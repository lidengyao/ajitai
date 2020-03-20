package com.hxsoft.ajitai.model.info;


import java.io.Serializable;
import java.util.List;

public class DanWeiBeiAn_FuJian_Info implements Serializable {

    /**
     * id : 10
     * basecodeId : 26
     * basecodeName : 剧毒化学品从业单位备案登记表
     * attachmentNumber :
     * expireTime : null
     * expiretimeType : null
     * attachmentName : null
     * fileList : [{"id":null,"uri":"/2019/6/20190613102516490.jpg","unitId":null,"fileName":"b91edf0984b854d5cfcc4fb3dfd5de05.jpg","fileSuffix":null,"fileSize":"50K","createTime":null,"attachmentName":"剧毒化学证书"},{"id":null,"uri":"/2019/6/20190613102516490.jpg","unitId":null,"fileName":"ims-1.jpg","fileSuffix":null,"fileSize":"12K","createTime":null,"attachmentName":"剧毒问题证书"},{"id":null,"uri":"/2019/6/20190613102516490.jpg","unitId":null,"fileName":"3392294ad0f1110a7b2b4ff7248bb42e.jpg","fileSuffix":null,"fileSize":"25K","createTime":null,"attachmentName":"剧毒证书"}]
     * fileId : 8
     * unitId : 10
     */

    private int id;
    private int basecodeId;
    private String basecodeName;
    private String attachmentNumber;
    private Long expireTime;
    private Integer expiretimeType;
    private String attachmentName;
    private int fileId;
    private int unitId;
    private List<FileListBean> fileList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBasecodeId() {
        return basecodeId;
    }

    public void setBasecodeId(int basecodeId) {
        this.basecodeId = basecodeId;
    }

    public String getBasecodeName() {
        return basecodeName;
    }

    public void setBasecodeName(String basecodeName) {
        this.basecodeName = basecodeName;
    }

    public String getAttachmentNumber() {
        return attachmentNumber;
    }

    public void setAttachmentNumber(String attachmentNumber) {
        this.attachmentNumber = attachmentNumber;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getExpiretimeType() {
        return expiretimeType;
    }

    public void setExpiretimeType(Integer expiretimeType) {
        this.expiretimeType = expiretimeType;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public List<FileListBean> getFileList() {
        return fileList;
    }

    public void setFileList(List<FileListBean> fileList) {
        this.fileList = fileList;
    }

    public static class FileListBean {
        /**
         * id : null
         * uri : /2019/6/20190613102516490.jpg
         * unitId : null
         * fileName : b91edf0984b854d5cfcc4fb3dfd5de05.jpg
         * fileSuffix : null
         * fileSize : 50K
         * createTime : null
         * attachmentName : 剧毒化学证书
         */

        private Integer id;
        private String uri;
        private Integer unitId;
        private String fileName;
        private String fileSuffix;
        private String fileSize;
        private String createTime;
        private String attachmentName;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public Integer getUnitId() {
            return unitId;
        }

        public void setUnitId(Integer unitId) {
            this.unitId = unitId;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileSuffix() {
            return fileSuffix;
        }

        public void setFileSuffix(String fileSuffix) {
            this.fileSuffix = fileSuffix;
        }

        public String getFileSize() {
            return fileSize;
        }

        public void setFileSize(String fileSize) {
            this.fileSize = fileSize;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getAttachmentName() {
            return attachmentName;
        }

        public void setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
        }
    }
}

