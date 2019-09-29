package pers.swmmm.mapper;

import pers.swmmm.po.Admin;
import pers.swmmm.po.Video;

import java.util.List;

public interface AdminMapper {
    Admin selectByUsername(String username);

}
