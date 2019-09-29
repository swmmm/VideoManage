package pers.swmmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import pers.swmmm.mapper.TagMapper;
import pers.swmmm.mapper.VideoMapper;
import pers.swmmm.mapper.VideoTagMapper;
import pers.swmmm.po.Tag;
import pers.swmmm.po.Video;
import pers.swmmm.service.VideoService;

import java.util.List;

public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;
    @Autowired
    TagMapper tagMapper;
    @Autowired
    VideoTagMapper videoTagMapper;

    public List<Video> getVideos() {
        return videoMapper.getVideos();
    }

    public List<Tag> getTags() {
        return tagMapper.getTags();
    }

    public void addVideo(Video video) {
        videoMapper.insert(video);
    }

    public Video getVideoById(Integer videoId) {
        return videoMapper.getVideoById(videoId);
    }

    public void updateVideo(Video video) {
        videoMapper.updateByPrimaryKey(video);
    }

    public Object insertResources(List<String> resources) {
        return videoMapper.insertResources(resources);
    }
}
