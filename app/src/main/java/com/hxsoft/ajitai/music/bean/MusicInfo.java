package com.hxsoft.ajitai.music.bean;


import com.mediabrowser.xiaxl.client.model.IMusicInfo;

public class MusicInfo implements IMusicInfo {

    private String source;
    private String mediaID;
    private String url;
    private String title;

    public String getMediaID() {
        return mediaID;
    }

    public void setMediaID(String mediaID) {
        this.mediaID = mediaID;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return title;
    }

    @Override
    public String getMediaId() {
        return source;
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public String getArtUrl() {
        return url;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return title;
    }

    @Override
    public String getAlbum() {
        return title;
    }

    @Override
    public String getAlbumArtUrl() {
        return url;
    }

    @Override
    public String getGenre() {
        return "";
    }

    @Override
    public String freeType() {
        return "1";
    }

    @Override
    public long getDuration() {
        return 277 * 1000;
    }


}
