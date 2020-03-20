package com.hxsoft.ajitai.utils;

import java.sql.Date;
import java.util.Comparator;

public class Sort_Rectify_Detail_Info_By_Id implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if (Date.valueOf(s1).before(Date.valueOf(s2)))
            return 1;
        return -1;
    }
}
