package pers.swmmm.mapper;

import org.apache.ibatis.annotations.Param;
import pers.swmmm.po.Video;
import pers.swmmm.po.VideoExample;

import java.util.List;

public interface VideoMapper {
    List<Video> getVideos();
    Video getVideoById(Integer videoId);
    long countByExample(VideoExample example);

    int deleteByExample(VideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(Video record);

    int insertSelective(Video record);

    List<Video> selectByExample(VideoExample example);

    Video selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByExample(@Param("record") Video record, @Param("example") VideoExample example);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    int insertResources(List<String> resources);

}