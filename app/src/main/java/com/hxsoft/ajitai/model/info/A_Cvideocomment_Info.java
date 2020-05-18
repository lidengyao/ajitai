package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class A_Cvideocomment_Info implements Serializable {


        /**
         * cid : 101
         * sid : 101
         * uid : 1
         * nickname : 测试
         * avatar : http://image.hxsoft.net/asdfasdfsadfasdf
         * ctype : 1
         * replyid : 0
         * content : 测试回复1
         * status : 1
         * createTime : 2020-05-18 16:53:02
         */

        private Integer cid;
        private Integer sid;
        private Integer uid;
        private String nickname;
        private String avatar;
        private Integer ctype;
        private Integer replyid;
        private String content;
        private Integer status;
        private String createTime;

        public Integer getCid() {
            return cid;
        }

        public void setCid(Integer cid) {
            this.cid = cid;
        }

        public Integer getSid() {
            return sid;
        }

        public void setSid(Integer sid) {
            this.sid = sid;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public Integer getCtype() {
            return ctype;
        }

        public void setCtype(Integer ctype) {
            this.ctype = ctype;
        }

        public Integer getReplyid() {
            return replyid;
        }

        public void setReplyid(Integer replyid) {
            this.replyid = replyid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }
    
}



