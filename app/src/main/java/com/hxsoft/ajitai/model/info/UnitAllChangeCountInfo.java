package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.ArrayList;

public class UnitAllChangeCountInfo implements Serializable {


    /**
     * countFinishedChangeRecord : 3
     * list : [{"id":8,"changeNum":1},{"id":99,"changeNum":3},{"id":127,"changeNum":2}]
     */

    private int countFinishedChangeRecord;
    private ArrayList<ListBean> list;

    public int getCountFinishedChangeRecord() {
        return countFinishedChangeRecord;
    }

    public void setCountFinishedChangeRecord(int countFinishedChangeRecord) {
        this.countFinishedChangeRecord = countFinishedChangeRecord;
    }

    public ArrayList<ListBean> getList() {
        return list;
    }

    public void setList(ArrayList<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * id : 8
         * changeNum : 1
         */

        private int id;
        private int changeNum;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getChangeNum() {
            return changeNum;
        }

        public void setChangeNum(int changeNum) {
            this.changeNum = changeNum;
        }
    }

}

