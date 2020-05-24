package com.hxsoft.ajitai.model.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class A_User_Info implements Serializable {


    /**
     * userType : null
     * sysUser : {"uid":1,"usertype":1,"nickname":"测试","address":30,"avatar":"asdfasdfsadfasdf","phone":"18810269616","udesc":"个人介绍","identify":"320288191204012342","sex":2,"createTime":"2019-01-31 14:29:07","updateTime":"2020-04-22 07:31:34"}
     * deptId : 1
     * sysUserAccount : {"id":1,"password":"$2a$10$SjO8K8wv8qjAw1EpcZZtOer1eI.iThm3qV1rbtBur46cKcfz6Gy4K","salt":"5def2601a40240ff8438ac2caf7c6147","account":"admin","createTime":"2020-04-19 17:26:03","updateTime":"2020-04-21 19:11:11","lockFlag":"0","delFlag":"0","uid":1}
     * permissions : ["sys_client_edit","sys_dict_add","sys_user_del","sys_dept_del","sys_menu_add","sys_role_add","sys_client_add","sys_user_edit","sys_dept_edit","sys_menu_del","sys_dict_edit","sys_menu_edit","sys_role_edit","sys_role_perm","sys_user_add","gen_form_del","sys_token_del","sys_dept_add","gen_form_edit","gen_form_add","sys_role_del","sys_log_del","sys_client_del","sys_dict_del"]
     * roles : [1]
     */

    private Integer userType;
    private SysUserBean sysUser;
    private Integer deptId;
    private SysUserAccountBean sysUserAccount;
    private ArrayList<String> permissions;
    private ArrayList<Integer> roles;

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public SysUserBean getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUserBean sysUser) {
        this.sysUser = sysUser;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public SysUserAccountBean getSysUserAccount() {
        return sysUserAccount;
    }

    public void setSysUserAccount(SysUserAccountBean sysUserAccount) {
        this.sysUserAccount = sysUserAccount;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    public ArrayList<Integer> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Integer> roles) {
        this.roles = roles;
    }

    public static class SysUserBean implements Serializable{


        /**
         * uid : 1
         * usertype : 1
         * nickname : 小小黑
         * province : 1
         * city : 2
         * area : 18
         * address : 30
         * avatar : http://image.hxsoft.net/image/1590229222703194.JPEG
         * phone : 15251435195
         * udesc : 个人介绍
         * identify : 320288191204012342
         * sex : 2
         * createTime : 2019-01-31 14:29:07
         * updateTime : 2020-05-20 23:11:28
         * addressinfo : 河南省洛阳市新安县正村镇
         */

        private Integer uid;
        private Integer usertype;
        private String nickname;
        private Integer province;
        private Integer city;
        private Integer area;
        private Integer address;
        private String avatar;
        private String phone;
        private String udesc;
        private String identify;
        private Integer sex;
        private String createTime;
        private String updateTime;
        private String addressinfo;

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public Integer getUsertype() {
            return usertype;
        }

        public void setUsertype(Integer usertype) {
            this.usertype = usertype;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public Integer getProvince() {
            return province;
        }

        public void setProvince(Integer province) {
            this.province = province;
        }

        public Integer getCity() {
            return city;
        }

        public void setCity(Integer city) {
            this.city = city;
        }

        public Integer getArea() {
            return area;
        }

        public void setArea(Integer area) {
            this.area = area;
        }

        public Integer getAddress() {
            return address;
        }

        public void setAddress(Integer address) {
            this.address = address;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getUdesc() {
            return udesc;
        }

        public void setUdesc(String udesc) {
            this.udesc = udesc;
        }

        public String getIdentify() {
            return identify;
        }

        public void setIdentify(String identify) {
            this.identify = identify;
        }

        public Integer getSex() {
            return sex;
        }

        public void setSex(Integer sex) {
            this.sex = sex;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getAddressinfo() {
            return addressinfo;
        }

        public void setAddressinfo(String addressinfo) {
            this.addressinfo = addressinfo;
        }
    }

    public static class SysUserAccountBean implements Serializable{
        /**
         * id : 1
         * password : $2a$10$SjO8K8wv8qjAw1EpcZZtOer1eI.iThm3qV1rbtBur46cKcfz6Gy4K
         * salt : 5def2601a40240ff8438ac2caf7c6147
         * account : admin
         * createTime : 2020-04-19 17:26:03
         * updateTime : 2020-04-21 19:11:11
         * lockFlag : 0
         * delFlag : 0
         * uid : 1
         */

        private Integer id;
        private String password;
        private String salt;
        private String account;
        private String createTime;
        private String updateTime;
        private String lockFlag;
        private String delFlag;
        private Integer uid;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getLockFlag() {
            return lockFlag;
        }

        public void setLockFlag(String lockFlag) {
            this.lockFlag = lockFlag;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }
    }
}

