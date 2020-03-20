package com.hxsoft.ajitai.log;

import android.util.Log;

import java.io.File;
import java.io.RandomAccessFile;

public class YLog {
    public static void Write(String log) {

    }

    //生成文件夹
    public static void makeRootDirectory(String filePath) {
        File file = null;
        try {
            file = new File(filePath);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            Log.i("error:", e + "");
        }
    }

    //生成文件
    public static File makeFilePath(String filePath, String fileName) {
        File file = null;
        makeRootDirectory(filePath);
        try {
            file = new File(filePath + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    // 将字符串写入到文本文件中
    public static void writeTxtToFile(String strcontent, String filePath, String fileName) {
        //生成文件夹之后，再生成文件，不然会出错
        makeFilePath(filePath, fileName);


        String strFilePath = filePath + fileName;
        // 每次写入时，都换行写
        String strContent = strcontent;
        try {
            File file = new File(strFilePath);
            file.delete();
            file.getParentFile().mkdirs();
            file.createNewFile();

            //一天一个文本文件，插入数据时先检测是否已经存在当天文件，不存在再创建文件，若存在则追加到文件末尾

            //判断文件是否存在
            if (file.exists()) {


            } else {
                file.getParentFile().mkdirs();
                file.createNewFile();
                RandomAccessFile raf = new RandomAccessFile(file, "rwd");
                raf.seek(file.length());
                raf.write(strContent.getBytes());
                raf.close();
            }
//            if (!file.exists()) {
//                Log.d("TestFile", "Create the file:" + strFilePath);
//                file.getParentFile().mkdirs();
//                file.createNewFile();
//            } else {
//                file.delete();
//            }

        } catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
        }
    }

}
