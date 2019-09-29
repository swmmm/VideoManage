package pers.swmmm.mapper;

import org.apache.ibatis.annotations.Param;
import pers.swmmm.po.VideoTag;
import pers.swmmm.po.VideoTagExample;

import java.util.List;
import java.util.Map;

public interface VideoTagMapper {
    long countByExample(VideoTagExample example);

    int deleteByExample(VideoTagExample example);

    int deleteByPrimaryKey(Integer videoTagId);

    int insert(VideoTag record);

    int insertSelective(VideoTag record);

    List<VideoTag> selectByExample(VideoTagExample example);

    VideoTag selectByPrimaryKey(Integer videoTagId);

    int updateByExampleSelective(@Param("record") VideoTag record, @Param("example") VideoTagExample example);

    int updateByExample(@Param("record") VideoTag record, @Param("example") VideoTagExample example);

    int updateByPrimaryKeySelective(VideoTag record);

    int updateByPrimaryKey(VideoTag record);

    int insertBatch(Map map);
}