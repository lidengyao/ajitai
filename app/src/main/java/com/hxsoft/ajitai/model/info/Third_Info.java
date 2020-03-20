package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class Third_Info implements Serializable {

    /**
     * userinfo : {"id":9,"username":"u9","nickname":"rnJ3IMzUvPsmpdYy6jVL","mobile":"19895732016","avatar":"http://cdn.yck2046.com/uploads/20200116/1b5b0c2d18def6fb380feed96c753ec0.png","score":0,"token":"e762a167-e669-4ad4-824c-38ec76c9292d","user_id":9,"createtime":1581048209,"expiretime":0,"expires_in":31536000}
     * thirdinfo : {"access_token":"30_2GDiRJvC7YiK73uDl-XXX7ZuLeH3okTu7RQq-o1VpLhrkw8q5pG_cqXHOxMIvYSLUjRmoQDduzL3XLcmqYXYU6ceh408u4qTQExyW9_d2dQ","refresh_token":"30_M76M_BPIZMZP0lj0G-EmyO2bCxr0TF_DcY3Xg-Ph8GNdmKC_ZwT5wyhXQAZBP-idX5I2I-a6mHm3FeqWyXcEh5D6aK_RwmHUVwV1UzLoLJQ","expires_in":7200,"openid":"oOMaqjl-CHvTJgZHhN1H4x9yQ1hQ","unionid":"osC9hs1fJv5EDIMh_2_MWTHMdddA","userinfo":[]}
     */

    private UserDataInfo userinfo;
    private ThirdinfoBean thirdinfo;

    public UserDataInfo getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserDataInfo userinfo) {
        this.userinfo = userinfo;
    }

    public ThirdinfoBean getThirdinfo() {
        return thirdinfo;
    }

    public void setThirdinfo(ThirdinfoBean thirdinfo) {
        this.thirdinfo = thirdinfo;
    }



    public static class ThirdinfoBean {
        /**
         * access_token : 30_2GDiRJvC7YiK73uDl-XXX7ZuLeH3okTu7RQq-o1VpLhrkw8q5pG_cqXHOxMIvYSLUjRmoQDduzL3XLcmqYXYU6ceh408u4qTQExyW9_d2dQ
         * refresh_token : 30_M76M_BPIZMZP0lj0G-EmyO2bCxr0TF_DcY3Xg-Ph8GNdmKC_ZwT5wyhXQAZBP-idX5I2I-a6mHm3FeqWyXcEh5D6aK_RwmHUVwV1UzLoLJQ
         * expires_in : 7200
         * openid : oOMaqjl-CHvTJgZHhN1H4x9yQ1hQ
         * unionid : osC9hs1fJv5EDIMh_2_MWTHMdddA
         * userinfo : []
         */

        private String access_token;
        private String refresh_token;
        private int expires_in;
        private String openid;
        private String unionid;
        private List<?> userinfo;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getRefresh_token() {
            return refresh_token;
        }

        public void setRefresh_token(String refresh_token) {
            this.refresh_token = refresh_token;
        }

        public int getExpires_in() {
            return expires_in;
        }

        public void setExpires_in(int expires_in) {
            this.expires_in = expires_in;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getUnionid() {
            return unionid;
        }

        public void setUnionid(String unionid) {
            this.unionid = unionid;
        }

        public List<?> getUserinfo() {
            return userinfo;
        }

        public void setUserinfo(List<?> userinfo) {
            this.userinfo = userinfo;
        }
    }
}



