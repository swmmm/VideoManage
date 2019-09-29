package pers.swmmm.po;

import java.io.Serializable;

public class VideoTag implements Serializable {
    private Integer videoTagId;

    private Integer videoId;

    private Integer tagId;

    public Integer getVideoTagId() {
        return videoTagId;
    }

    public void setVideoTagId(Integer videoTagId) {
        this.videoTagId = videoTagId;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Override
    public String toString() {
        return "VideoTag{" +
                "videoTagId=" + videoTagId +
                ", videoId=" + videoId +
                ", tagId=" + tagId +
                '}';
    }
}