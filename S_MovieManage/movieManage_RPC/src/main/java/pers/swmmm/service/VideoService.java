package pers.swmmm.service;

import pers.swmmm.po.Tag;
import pers.swmmm.po.Video;

import java.util.List;

public interface VideoService {
     List<Video> getVideos();
     List<Tag> getTags();
     void addVideo(Video video);
     Video getVideoById(Integer videoId);
     void updateVideo(Video video);
     Object insertResources(List<String> resources);
}
