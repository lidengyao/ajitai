package com.hxsoft.ajitai.model.bean;


import java.io.Serializable;
import java.util.ArrayList;

public class A_Conscious_Info implements Serializable {

        /**
         * cid : 1
         * uid : 1
         * position : XXX
         * nickname : 修
         * avatar : 102b80ca0aff433cbe1ef996eb0abf19
         * content : 测试内容
         * relaycid : 0
         * status : 0
         * createTime : 2020-05-13 10:14:40
         * extrals : [{"type":2,"uri":"http://image.hxsoft.net/image/xxxxx.jpg"},{"type":2,"uri":"http://image.hxsoft.net/image/yyyy.jpg"}]
         * thumbs : [{"uid":1,"nickname":"修"}]
         * comments : [{"cmid":2,"uid":1,"nickname":"修","content":"测试评论"}]
         */

        private Integer cid;
        private Integer uid;
        private String position;
        private String nickname;
        private String avatar;
        private String content;
        private Integer relaycid;
        private Integer status;
        private String createTime;
        private ArrayList<ExtralsBean> extrals;
        private ArrayList<ThumbsBean> thumbs;
        private ArrayList<CommentsBean> comments;

        public Integer getCid() {
            return cid;
        }

        public void setCid(Integer cid) {
            this.cid = cid;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getRelaycid() {
            return relaycid;
        }

        public void setRelaycid(Integer relaycid) {
            this.relaycid = relaycid;
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

        public ArrayList<ExtralsBean> getExtrals() {
            return extrals;
        }

        public void setExtrals(ArrayList<ExtralsBean> extrals) {
            this.extrals = extrals;
        }

        public ArrayList<ThumbsBean> getThumbs() {
            return thumbs;
        }

        public void setThumbs(ArrayList<ThumbsBean> thumbs) {
            this.thumbs = thumbs;
        }

        public ArrayList<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(ArrayList<CommentsBean> comments) {
            this.comments = comments;
        }

        public static class ExtralsBean {
            /**
             * type : 2
             * uri : http://image.hxsoft.net/image/xxxxx.jpg
             */

            private Integer type;
            private String uri;

            public Integer getType() {
                return type;
            }

            public void setType(Integer type) {
                this.type = type;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }
        }

        public static class ThumbsBean {
            /**
             * uid : 1
             * nickname : 修
             */

            private Integer uid;
            private String nickname;

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
        }

        public static class CommentsBean {


            /**
             * cmid : 18
             * uid : 1
             * nickname : 修
             * content : 12
             * replyid : 0
             * replynickname :
             */

            private Integer cmid;
            private Integer uid;
            private String nickname;
            private String content;
            private Integer replyid;
            private String replynickname;

            public Integer getCmid() {
                return cmid;
            }

            public void setCmid(Integer cmid) {
                this.cmid = cmid;
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

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public Integer getReplyid() {
                return replyid;
            }

            public void setReplyid(Integer replyid) {
                this.replyid = replyid;
            }

            public String getReplynickname() {
                return replynickname;
            }

            public void setReplynickname(String replynickname) {
                this.replynickname = replynickname;
            }
        }
    }

