package pers.swmmm.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Video implements Serializable {
    private Integer videoId;

    private String videoName;

    private String nation;

    private String language;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date showdate;

    private String tvstation;

    private String category;

    private String alias;

    private String screenwriter;

    private String director;

    private String leadactor;

    private Short episodes;

    private String statu;

    //关系字段
    private List<Tag> tags;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Date getShowdate() {
        return showdate;
    }

    public void setShowdate(Date showdate) {
        this.showdate = showdate;
    }

    public String getTvstation() {
        return tvstation;
    }

    public void setTvstation(String tvstation) {
        this.tvstation = tvstation == null ? null : tvstation.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getScreenwriter() {
        return screenwriter;
    }

    public void setScreenwriter(String screenwriter) {
        this.screenwriter = screenwriter == null ? null : screenwriter.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getLeadactor() {
        return leadactor;
    }

    public void setLeadactor(String leadactor) {
        this.leadactor = leadactor == null ? null : leadactor.trim();
    }

    public Short getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Short episodes) {
        this.episodes = episodes;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", videoName='" + videoName + '\'' +
                ", nation='" + nation + '\'' +
                ", language='" + language + '\'' +
                ", showdate=" + showdate +
                ", tvstation='" + tvstation + '\'' +
                ", category='" + category + '\'' +
                ", alias='" + alias + '\'' +
                ", screenwriter='" + screenwriter + '\'' +
                ", director='" + director + '\'' +
                ", leadactor='" + leadactor + '\'' +
                ", episodes=" + episodes +
                ", statu='" + statu + '\'' +
                ", tags=" + tags +
                '}';
    }
}