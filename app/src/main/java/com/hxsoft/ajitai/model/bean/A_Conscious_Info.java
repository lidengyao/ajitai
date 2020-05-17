package com.hxsoft.ajitai.model.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
    private relayObjectBean relayObject;

    public relayObjectBean getRelayObject() {
        return relayObject;
    }

    public void setRelayObject(relayObjectBean relayObject) {
        this.relayObject = relayObject;
    }

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


    public static class ThumbsBean implements Serializable {
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

    public static class CommentsBean implements Serializable {


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

    public static class relayObjectBean implements Serializable {


        /**
         * uid : 1
         * position : 测试位置
         * nickname : 测试
         * content : 转发它003
         * relaycid : 94
         * extrals : [{"type":2,"uri":"http://image.hxsoft.net/image/1589725001595356.jpg"}]
         * replylist : [{"uid":1,"nickname":"测试","content":"转发它002"},{"uid":1,"nickname":"测试","content":"转发它001"},{"uid":1,"nickname":"测试","content":"发布个感悟带图片的"}]
         */

        private Integer uid;
        private String position;
        private String nickname;
        private String content;
        private Integer relaycid;
        private ArrayList<ExtralsBean> extrals;
        private ArrayList<ReplylistBean> replylist;

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

        public ArrayList<ExtralsBean> getExtrals() {
            return extrals;
        }

        public void setExtrals(ArrayList<ExtralsBean> extrals) {
            this.extrals = extrals;
        }

        public ArrayList<ReplylistBean> getReplylist() {
            return replylist;
        }

        public void setReplylist(ArrayList<ReplylistBean> replylist) {
            this.replylist = replylist;
        }


        public static class ReplylistBean implements Serializable {
            /**
             * uid : 1
             * nickname : 测试
             * content : 转发它002
             */

            private Integer uid;
            private String nickname;
            private String content;

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
        }
    }
}

