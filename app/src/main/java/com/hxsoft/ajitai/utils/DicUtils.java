package com.hxsoft.ajitai.utils;

import android.content.Context;
import android.util.Xml;
import android.widget.TextView;

import com.hxsoft.ajitai.R;
import com.hxsoft.ajitai.model.info.BaseCodeInfo;
import com.hxsoft.ajitai.model.info.Unit_Info;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hxsoft.ajitai.test.YongHuGuanLi_Info;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DicUtils {
    public static ArrayList<BaseCodeInfo> getDicData(int dicKey, Context context) {

        ArrayList<BaseCodeInfo> baseCodeInfoArrayList_result = new ArrayList<>();
//
//        try {
//            InputStream is = context.getResources().getAssets().open("dicdata.xml");// getResources().getAssets().open(fileName);
//            XmlPullParser xmlParser = Xml.newPullParser();
//            xmlParser.setInput(is, "utf-8");
//            int event = xmlParser.getEventType();
//            while (event != XmlPullParser.END_DOCUMENT) {
//                switch (event) {
//                    case XmlPullParser.START_DOCUMENT:
//                        break;
//                    case XmlPullParser.START_TAG:
//                        if ("Item".equals(xmlParser.getName())) {
//
//                            String Key = xmlParser.getAttributeValue(null, "DicKey");
//                            String Value = xmlParser.getAttributeValue(null, "Value");
//                            String ID = xmlParser.getAttributeValue(null, "ID");
//                            if (Key.equals(dicKey + "")) {
//                                DicDataInfo dicDataInfo = new DicDataInfo();
//                                dicDataInfo.setId(Integer.parseInt(ID));
//                                dicDataInfo.setLby_type_name(Value);
//                                dicDataInfos.add(dicDataInfo);
//                            }
//                        }
//                        break;
//                    case XmlPullParser.END_TAG:
//                        break;
//                }
//                event = xmlParser.next();
//            }
//            is.close();
//        } catch (XmlPullParserException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String value = "";
        try {
            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(context, DbKeyS.basecodedata);

            ArrayList<BaseCodeInfo> baseCodeInfoArrayList = new ArrayList<>();
            if (!gsonData.equals("")) {
                ArrayList<BaseCodeInfo> tempGList = gson.fromJson(gsonData, new TypeToken<List<BaseCodeInfo>>() {
                }.getType());
                baseCodeInfoArrayList.addAll(tempGList);
            }

            for (int i = 0; i < baseCodeInfoArrayList.size(); i++) {
                BaseCodeInfo baseCodeInfo = baseCodeInfoArrayList.get(i);
                if (baseCodeInfo.getId() == dicKey) {
                    baseCodeInfoArrayList_result = baseCodeInfo.getRules();
                }
            }
            return baseCodeInfoArrayList_result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void InitStatusData(Context context) {
        ArrayList<StatusC> statusCArrayList = new ArrayList<>();
        try {
            InputStream is = context.getResources().getAssets().open("template/statusdata.xml");// getResources().getAssets().open(fileName);
            XmlPullParser xmlParser = Xml.newPullParser();
            xmlParser.setInput(is, "utf-8");
            int event = xmlParser.getEventType();
            StatusC statusC = null;
            HashMap<Integer, String> valueHashMap = null;
            HashMap<Integer, Integer> ColorIDHashMap = null;
            while (event != XmlPullParser.END_DOCUMENT) {
                switch (event) {
                    case XmlPullParser.START_DOCUMENT:
                        break;
                    case XmlPullParser.START_TAG:
                        String tag = xmlParser.getName();
                        if ("Item".equals(tag)) {
                            String DicKey = xmlParser.getAttributeValue(null, "DicKey");
                            String Des = xmlParser.getAttributeValue(null, "Des");
                            statusC = new StatusC();
                            valueHashMap = new HashMap<>();
                            ColorIDHashMap = new HashMap<>();
                            statusC.setDicKey(DicKey);
                            statusC.setDes(Des);
                        } else if (statusC != null) {
                            if ("Data".equals(tag)) {
                                Integer key = Integer.parseInt(xmlParser.getAttributeValue(null, "Status"));
                                String Value = xmlParser.getAttributeValue(null, "Value");
                                Integer ColorID = Integer.parseInt(xmlParser.getAttributeValue(null, "ColorID"));
                                valueHashMap.put(key, Value);
                                ColorIDHashMap.put(key, ColorID);
                            }
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if ("Item".equals(xmlParser.getName()) && statusC != null) {
                            statusC.setStatusHashMapArrayList(valueHashMap);
                            statusC.setColorHashMapArrayList(ColorIDHashMap);
                            statusCArrayList.add(statusC);
                            statusC = null;
                            valueHashMap = null;
                            ColorIDHashMap = null;
                        }

                        break;
                }
                event = xmlParser.next();
            }
            is.close();

            Gson gson = new Gson();
            String statusdata = gson.toJson(statusCArrayList);
            SpUtils.saveSettingNote(context, DbKeyS.statusdata, statusdata);


        } catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void InitMapData(Context context) {
        ArrayList<StatusC> statusCArrayList = new ArrayList<>();
        try {
            InputStream is = context.getResources().getAssets().open("template/mapdata.xml");// getResources().getAssets().open(fileName);
            XmlPullParser xmlParser = Xml.newPullParser();
            xmlParser.setInput(is, "utf-8");
            int event = xmlParser.getEventType();
            StatusC statusC = null;
            HashMap<Integer, String> valueHashMap = null;
            HashMap<Integer, Integer> ColorIDHashMap = null;
            while (event != XmlPullParser.END_DOCUMENT) {
                switch (event) {
                    case XmlPullParser.START_DOCUMENT:
                        break;
                    case XmlPullParser.START_TAG:
                        String tag = xmlParser.getName();
                        if ("Item".equals(tag)) {
                            String DicKey = xmlParser.getAttributeValue(null, "DicKey");
                            String Des = xmlParser.getAttributeValue(null, "Des");
                            statusC = new StatusC();
                            valueHashMap = new HashMap<>();
                            ColorIDHashMap = new HashMap<>();
                            statusC.setDicKey(DicKey);
                            statusC.setDes(Des);
                        } else if (statusC != null) {
                            if ("Data".equals(tag)) {
                                Integer key = Integer.parseInt(xmlParser.getAttributeValue(null, "Status"));
                                String Value = xmlParser.getAttributeValue(null, "Value");
                                Integer ColorID = Integer.parseInt(xmlParser.getAttributeValue(null, "ColorID"));
                                valueHashMap.put(key, Value);
                                ColorIDHashMap.put(key, ColorID);
                            }
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        if ("Item".equals(xmlParser.getName()) && statusC != null) {
                            statusC.setStatusHashMapArrayList(valueHashMap);
                            statusC.setColorHashMapArrayList(ColorIDHashMap);
                            statusCArrayList.add(statusC);
                            statusC = null;
                            valueHashMap = null;
                            ColorIDHashMap = null;
                        }

                        break;
                }
                event = xmlParser.next();
            }
            is.close();

            Gson gson = new Gson();
            String statusdata = gson.toJson(statusCArrayList);
            SpUtils.saveSettingNote(context, DbKeyS.mapdata, statusdata);


        } catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<BaseCodeInfo> getStatusDic(Context context, String statusName) {
        ArrayList<BaseCodeInfo> statusBaseCodeInfoList = new ArrayList<>();
        Gson gson = new Gson();
        String gsonData = SpUtils.getSettingNote(context, DbKeyS.statusdata);

        ArrayList<StatusC> statusList = new ArrayList<>();
        if (!gsonData.equals("")) {
            ArrayList<StatusC> tempGList = gson.fromJson(gsonData, new TypeToken<List<StatusC>>() {
            }.getType());
            statusList.addAll(tempGList);
        }

        for (StatusC statusC : statusList) {
            if (statusC.getDicKey().equals(statusName)) {
                HashMap<Integer, String> statusHashMapArrayList = statusC.getStatusHashMapArrayList();
                for (Integer key : statusHashMapArrayList.keySet()) {
                    BaseCodeInfo baseCodeInfo = new BaseCodeInfo();
                    baseCodeInfo.setId(key);
                    baseCodeInfo.setCardNo(statusHashMapArrayList.get(key));
                    statusBaseCodeInfoList.add(baseCodeInfo);

                }

            }
        }

        return statusBaseCodeInfoList;
    }

    public static String getMapValue(Context context, String mapName, String keyName) {

        String mapValue = "";
        ArrayList<BaseCodeInfo> statusBaseCodeInfoList = new ArrayList<>();
        Gson gson = new Gson();
        String gsonData = SpUtils.getSettingNote(context, DbKeyS.mapdata);

        ArrayList<StatusC> statusList = new ArrayList<>();
        if (!gsonData.equals("")) {
            ArrayList<StatusC> tempGList = gson.fromJson(gsonData, new TypeToken<List<StatusC>>() {
            }.getType());
            statusList.addAll(tempGList);
        }

        for (StatusC statusC : statusList) {
            if (statusC.getDicKey().equals(mapName)) {
                HashMap<Integer, String> statusHashMapArrayList = statusC.getStatusHashMapArrayList();
                for (Integer key : statusHashMapArrayList.keySet()) {

                    if (key.toString().equals(keyName)) {
                        mapValue = statusHashMapArrayList.get(key);
                        break;
                    }

                }

            }
        }

        return mapValue;
    }


    public static ArrayList<BaseCodeInfo> getUserDic(Context context) {
        ArrayList<BaseCodeInfo> baseCodeInfoArrayList = new ArrayList<>();

//        Gson gson = new Gson();
//        String gsonData = SpUtils.getSettingNote(context, DbKeyS.usersdata);
//
//        ArrayList<YongHuGuanLi_Info> users_infoArrayList = new ArrayList<>();
//        if (!gsonData.equals("")) {
//            ArrayList<YongHuGuanLi_Info> tempGList = gson.fromJson(gsonData, new TypeToken<List<YongHuGuanLi_Info>>() {
//            }.getType());
//            users_infoArrayList.addAll(tempGList);
//        }
//
//        for (YongHuGuanLi_Info yongHuGuanLi_info : users_infoArrayList) {
//            BaseCodeInfo baseCodeInfo = new BaseCodeInfo();
//            baseCodeInfo.setId(yongHuGuanLi_info.getUserId());
//            baseCodeInfo.setCardNo(yongHuGuanLi_info.getUserName());
//            baseCodeInfoArrayList.add(baseCodeInfo);
//
//        }

        return baseCodeInfoArrayList;
    }

    public static void InitHelpData(Context context) {
        ArrayList<HelpBean> helpBeanArrayList = new ArrayList<>();
        try {
            InputStream is = context.getResources().getAssets().open("template/help.xml");// getResources().getAssets().open(fileName);
            XmlPullParser xmlParser = Xml.newPullParser();
            xmlParser.setInput(is, "utf-8");
            int event = xmlParser.getEventType();
            HelpBean helpBean = null;
            while (event != XmlPullParser.END_DOCUMENT) {
                switch (event) {
                    case XmlPullParser.START_DOCUMENT:
                        break;
                    case XmlPullParser.START_TAG:
                        String tag = xmlParser.getName();
                        if ("Help".equals(tag)) {
                            String Name = xmlParser.getAttributeValue(null, "Name");
                            String ShowContent = xmlParser.getAttributeValue(null, "ShowContent");
                            helpBean = new HelpBean();
                            helpBean.setName(Name);
                            helpBean.setShowContent(ShowContent);
                            helpBeanArrayList.add(helpBean);
                        }
                        break;
                    case XmlPullParser.END_TAG:
                        break;
                }
                event = xmlParser.next();
            }
            is.close();

            Gson gson = new Gson();
            String helpData = gson.toJson(helpBeanArrayList);
            SpUtils.saveSettingNote(context, DbKeyS.helpdata, helpData);


        } catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getHelpData(String name, Context context) {
        String txtPath = "help/" + name + ".txt";

        String s = "";
        try {
            InputStream is = context.getAssets().open(txtPath);
            int size = is.available();

            // Read the entire asset into a local byte buffer.
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            s = new String(buffer, "utf-8");
            return s;

        } catch (Exception e) {
            System.out.println("read txt file: " + e);
        }

        return "[]";
    }

    public static String getCode(InputStream is) {
        try {
            BufferedInputStream bin = new BufferedInputStream(is);
            int p;

            p = (bin.read() << 8) + bin.read();

            String code = null;

            switch (p) {
                case 0xefbb:
                    code = "UTF-8";
                    break;
                case 0xfffe:
                    code = "Unicode";
                    break;
                case 0xfeff:
                    code = "UTF-16BE";
                    break;
                default:
                    code = "GBK";
            }
            is.close();
            return code;
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void SetStatus(String DicKey, Integer Status, Context context, TextView textView) {
        if (Status == null) {
            textView.setText("无");
            textView.setTextColor(context.getResources().getColor(R.color.color26));
            return;
        }

        String value = "";
        Integer ColorID = 0;
        Gson gson = new Gson();
        String gsonData = SpUtils.getSettingNote(context, DbKeyS.statusdata);

        ArrayList<StatusC> statusCArrayList = new ArrayList<>();
        if (!gsonData.equals("")) {
            ArrayList<StatusC> tempGList = gson.fromJson(gsonData, new TypeToken<List<StatusC>>() {
            }.getType());
            statusCArrayList.addAll(tempGList);
        }

        for (int i = 0; i < statusCArrayList.size(); i++) {
            StatusC statusC = statusCArrayList.get(i);
            if (statusC.getDicKey().equals(DicKey)) {
                value = statusC.getStatusHashMapArrayList().get(Status);
                ColorID = statusC.getColorHashMapArrayList().get(Status);
            }
        }

        if (value == null || value == "") {
            textView.setText("无");
            textView.setTextColor(context.getResources().getColor(R.color.color26));
        } else {
            textView.setText(value);
        }

        DataSetColor.setTextViewColor(context, textView, ColorID);


    }

    public static String getUnit(Integer id, Context context) {
        String value = "";
        try {
            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(context, DbKeyS.allqiyedata);

            ArrayList<Unit_Info> unit_infoArrayList = new ArrayList<>();
            if (!gsonData.equals("")) {
                ArrayList<Unit_Info> tempGList = gson.fromJson(gsonData, new TypeToken<List<Unit_Info>>() {
                }.getType());
                unit_infoArrayList.addAll(tempGList);
            }

            for (int i = 0; i < unit_infoArrayList.size(); i++) {
                Unit_Info unit_info = unit_infoArrayList.get(i);
                if (unit_info.getId() == id) {
                    value = unit_info.getUnitName();
                }
            }
            return value == "" ? "无" : value;
        } catch (Exception e) {
            e.printStackTrace();
            return value == "" ? "无" : value;
        }


    }

    public static String getUser(Integer id, Context context) {
        String value = "";
        try {
            Gson gson = new Gson();
            String gsonData = SpUtils.getSettingNote(context, DbKeyS.usersdata);

            ArrayList<YongHuGuanLi_Info> users_infoArrayList = new ArrayList<>();
            if (!gsonData.equals("")) {
                ArrayList<YongHuGuanLi_Info> tempGList = gson.fromJson(gsonData, new TypeToken<List<YongHuGuanLi_Info>>() {
                }.getType());
                users_infoArrayList.addAll(tempGList);
            }

            for (int i = 0; i < users_infoArrayList.size(); i++) {
                YongHuGuanLi_Info users_info = users_infoArrayList.get(i);
                if (users_info.getUserId() == id) {
                    value = users_info.getUserName();
                }
            }
            return value == "" ? "无" : value;
        } catch (Exception e) {
            e.printStackTrace();
            return value == "" ? "无" : value;
        }


    }
}
