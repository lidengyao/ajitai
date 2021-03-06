package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;

import com.hxsoft.ajitai.AppContext;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;

/**
 * Created by jinxh on 16/1/8.
 */
public class FileUtils {


    public static String TAG = "ZHGDFileUtils";

    /**
     * 删除单个文件
     *
     * @param filePath 被删除文件的文件名
     * @return 文件删除成功返回true，否则返回false
     */
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.isFile() && file.exists()) {
            return file.delete();
        }
        return false;
    }

    public static boolean isExists(String filePath) {
        return new File(filePath).exists();
    }

    /**
     * 删除文件夹以及目录下的文件
     *
     * @param filePath 被删除目录的文件路径
     * @return 目录删除成功返回true，否则返回false
     */
    public static boolean deleteDirectory(String filePath) {
        boolean flag = false;
        //如果filePath不以文件分隔符结尾，自动添加文件分隔符
        if (!filePath.endsWith(File.separator)) {
            filePath = filePath + File.separator;
        }
        File dirFile = new File(filePath);
        if (!dirFile.exists() || !dirFile.isDirectory()) {
            return false;
        }
        flag = true;
        File[] files = dirFile.listFiles();
        //遍历删除文件夹下的所有文件(包括子目录)
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                //删除子文件
                flag = deleteFile(files[i].getAbsolutePath());
                if (!flag) break;
            } else {
                //删除子目录
                flag = deleteDirectory(files[i].getAbsolutePath());
                if (!flag) break;
            }
        }
        if (!flag) return false;
        //删除当前空目录
        return dirFile.delete();
    }

    /**
     * 根据路径删除指定的目录或文件，无论存在与否
     *
     * @param filePath 要删除的目录或文件
     * @return 删除成功返回 true，否则返回 false。
     */
    public static boolean deleteFolder(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            return false;
        } else {
            if (file.isFile()) {
                // 为文件时调用删除文件方法
                return deleteFile(filePath);
            } else {
                // 为目录时调用删除目录方法
                return deleteDirectory(filePath);
            }
        }
    }

    /**
     * 下载到SD卡地址
     */
    public static String getCachePath(Context context) {
        String filePath = getAppRootPath(context) + "/cache/";
        File file = new File(filePath);
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        return filePath;
    }

    public static String getAppRootPath(Context context) {
        String filePath = "/" + AppUtils.getAppName(context);
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            filePath = Environment.getExternalStorageDirectory() + filePath;
        } else {
            filePath = context.getCacheDir() + filePath;
        }
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        File noMedia = new File(filePath + "/.nomedia");
        if (!noMedia.exists())
            try {
                noMedia.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return filePath;
    }

    public static long getMemFree() {
        File root = Environment.getRootDirectory();
        StatFs sf = new StatFs(root.getPath());
        long blockSize = sf.getBlockSize();
        long availCount = sf.getAvailableBlocks();
        return availCount * blockSize;
    }

    /**
     * 得到SD可用内存
     **/
    public static long getSdFree() {
        long result = 0;
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            File sdcardDir = Environment.getExternalStorageDirectory();
            StatFs sf = new StatFs(sdcardDir.getPath());
            long blockSize = sf.getBlockSize();
            long availCount = sf.getAvailableBlocks();
            result = availCount * blockSize;
        }
        return result;
    }

    public static long getFree() {
        long result;
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            result = getSdFree();
        } else {
            result = getMemFree();
        }
        return result;
    }

    public static String fileToBase64(File file) {
        String base64 = null;
        InputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int size = fis.available();
            byte[] all = new byte[(int) file.length()];
            fis.read(all);
            base64 = new String(all, Charset.forName("UTF-8"));

//            byte[] bytes = new byte[(int) file.length()];
//            in.read(bytes);
//            base64 = Base64.encodeToString(bytes, Base64.DEFAULT);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return base64;
    }

    public static String Bitmap2StrByBase64(Bitmap bit) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bit.compress(Bitmap.CompressFormat.JPEG, 40, bos);//第二个入参表示图片压缩率，如果是100就表示不压缩
        byte[] bytes = bos.toByteArray();
        return Base64.encodeToString(bytes, Base64.DEFAULT);

    }

    public static String file2Base64(String filePath) {
        FileInputStream objFileIS = null;
        try {
            objFileIS = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ByteArrayOutputStream objByteArrayOS = new ByteArrayOutputStream();
        byte[] byteBufferString = new byte[1024];
        try {
            for (int readNum; (readNum = objFileIS.read(byteBufferString)) != -1; ) {
                objByteArrayOS.write(byteBufferString, 0, readNum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String videodata = Base64.encodeToString(objByteArrayOS.toByteArray(), Base64.DEFAULT);
        return videodata;
    }

    public static void write(String picture) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(picture);

            int size = fis.available();
            byte[] all = new byte[size];
            fis.read(all);
            String imageStr = new String(all, Charset.forName("UTF-8"));
            System.out.println(imageStr);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static File getZipImg(String srcPath, int ImageSize, String fileName) {
        int subtract;
        Log.i(TAG, "图片处理开始..");
        Bitmap bitmap = compressByResolution(srcPath, 1024, 720); //分辨率压缩
        if (bitmap == null) {
            Log.i(TAG, "bitmap 为空");
            return null;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int options = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, options, baos);//质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
        Log.i(TAG, "图片分辨率压缩后：" + baos.toByteArray().length / 1024 + "KB");


        while (baos.toByteArray().length > ImageSize * 1024) { //循环判断如果压缩后图片是否大于ImageSize kb,大于继续压缩
            subtract = 10;
            baos.reset();//重置baos即清空baos
            options -= subtract;//每次都减少10
            bitmap.compress(Bitmap.CompressFormat.JPEG, options, baos);//这里压缩options%，把压缩后的数据存放到baos中
            Log.i(TAG, "图片压缩后：" + baos.toByteArray().length / 1024 + "KB");
        }
        Log.i(TAG, "图片处理完成!" + baos.toByteArray().length / 1024 + "KB");
        try {
            File appDir = new File(Environment.getExternalStorageDirectory(), "A_Zhgd");
            if (!appDir.exists()) {
                appDir.mkdir();
            }
            String savePath = appDir.getPath() + "/" + fileName;
            File upLoadImg = saveImage(bitmap, fileName);
            FileOutputStream fos = new FileOutputStream(new File(savePath));//将压缩后的图片保存的本地上指定路径中
            fos.write(baos.toByteArray());
            fos.flush();
            fos.close();
            return upLoadImg;
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (bitmap != null) {
            bitmap.recycle();
        }

        return null; //压缩成功返回ture
    }

    private static Bitmap compressByResolution(String imgPath, int w, int h) {
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(imgPath, opts);

        int width = opts.outWidth;
        int height = opts.outHeight;
        int widthScale = width / w;
        int heightScale = height / h;

        int scale;
        if (widthScale < heightScale) { //保留压缩比例小的
            scale = widthScale;
        } else {
            scale = heightScale;
        }

        if (scale < 1) {
            scale = 1;
        }
        Log.i(TAG, "图片分辨率压缩比例：" + scale);

        opts.inSampleSize = scale;

        opts.inJustDecodeBounds = false;

        Bitmap bitmap = BitmapFactory.decodeFile(imgPath, opts);

        return bitmap;
    }

    private static int setSubstractSize(int imageMB) {

        if (imageMB > 1000) {
            return 60;
        } else if (imageMB > 750) {
            return 40;
        } else if (imageMB > 500) {
            return 20;
        } else {
            return 10;
        }
    }


    public static File saveImage(Bitmap bmp, String fileName) {
        File appDir = new File(Environment.getExternalStorageDirectory(), "A_Zhgd");
        if (!appDir.exists()) {
            appDir.mkdir();
        }
        File file = new File(appDir, fileName);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static String getFileName(String filePath) {

        String fileName = "";
        if (filePath.length() > 0) {
            int lastIndex = filePath.lastIndexOf("/");
            fileName = filePath.substring(lastIndex + 1, filePath.length());
        }
        return fileName;
    }

    // 将字符串写入到文本文件中
    public static void writeTxtToFile(String strcontent, String filePath, String fileName) {
        //生成文件夹之后，再生成文件，不然会出错
        filePath = Environment.getExternalStorageDirectory() + "/" + filePath + "/";
        makeFilePath(filePath, fileName);

        String strFilePath = filePath + fileName;
        // 每次写入时，都换行写
        String strContent = strcontent;
        try {
            File file = new File(strFilePath);
//            file.delete();
//            file.getParentFile().mkdirs();
//            file.createNewFile();
            if (!file.exists()) {
                Log.d("TestFile", "Create the file:" + strFilePath);
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

//            else {
//                file.delete();
//            }
//            RandomAccessFile raf = new RandomAccessFile(file, "rwd");
//            raf.seek(1);
//            raf.write(strContent.getBytes());
//            raf.close();
            insert(strFilePath, 0, strContent);
        } catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
        }
    }

    // 将字符串写入到文本文件中
    public static void writeLogToFile(String strcontent) {
        if (AppContext.debug == false)
            return;
        String filePath = "ajitai";
        String fileName = "log.txt";
        filePath = Environment.getExternalStorageDirectory() + "/" + filePath + "/";
        makeFilePath(filePath, fileName);

        String strFilePath = filePath + fileName;
        // 每次写入时，都换行写
        String strContent = strcontent;
        try {
            File file = new File(strFilePath);
            if (!file.exists()) {
                Log.d("TestFile", "Create the file:" + strFilePath);
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

            insert(strFilePath, 0, strContent);
        } catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
        }
    }


    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        //使用临时文件保存插入点后的数据
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        FileOutputStream out = new FileOutputStream(tmp);
        FileInputStream in = new FileInputStream(tmp);
        raf.seek(pos);
        //----------下面代码将插入点后的内容读入临时文件中保存----------
        byte[] bbuf = new byte[64];
        //用于保存实际读取的字节数
        int hasRead = 0;
        //使用循环方式读取插入点后的数据
        while ((hasRead = raf.read(bbuf)) > 0) {
            //将读取的数据写入临时文件
            out.write(bbuf, 0, hasRead);
        }
        //-----------下面代码用于插入内容----------
        //把文件记录指针重写定位到pos位置
        raf.seek(pos);
        //追加需要插入的内容

        String nowDate = getNowTime();
        String insertStr = "";
        if (!insertContent.contains("line")) {
            insertStr = nowDate + insertContent.toString();
        } else {
            insertStr = insertContent.toString();
        }


        raf.write(insertStr.getBytes());
        //追加临时文件中的内容
        while ((hasRead = in.read(bbuf)) > 0) {
            raf.write(bbuf, 0, hasRead);
        }
    }

    public static String getNowTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String date = formatter.format(new java.util.Date());

        return date;
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

    //读取指定目录下的所有TXT文件的文件内容
    public static String getFileContent(File file) {
        String content = "";
        if (!file.isDirectory()) {  //检查此路径名的文件是否是一个目录(文件夹)
            if (file.getName().endsWith("txt")) {//文件格式为""文件
                try {
                    InputStream instream = new FileInputStream(file);
                    if (instream != null) {
                        InputStreamReader inputreader
                                = new InputStreamReader(instream, "UTF-8");
                        BufferedReader buffreader = new BufferedReader(inputreader);
                        String line = "";
                        //分行读取
                        while ((line = buffreader.readLine()) != null) {
                            content += line + "\n";
                        }
                        instream.close();//关闭输入流
                    }
                } catch (java.io.FileNotFoundException e) {
                    Log.d("TestFile", "The File doesn't not exist.");
                } catch (IOException e) {
                    Log.d("TestFile", e.getMessage());
                }
            }
        }
        return content;
    }

    /**
     * 从asset路径下读取对应文件转String输出
     *
     * @param mContext
     * @return
     */
    public static String getAssetFile(Context mContext, String fileName) {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        AssetManager am = mContext.getAssets();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    am.open(fileName)));
            String next = "";
            while (null != (next = br.readLine())) {
                sb.append(next);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            sb.delete(0, sb.length());
        }
        return sb.toString().trim();
    }

}