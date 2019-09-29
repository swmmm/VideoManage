package pers.swmmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pers.swmmm.mapper.AdminMapper;
import pers.swmmm.po.Admin;
import pers.swmmm.service.LoginService;

/**
 * @ClassName: LoginServiceImpl
 * @description:
 * @author: swm
 * @create: 2019-09-02 14:46
 **/
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AdminMapper adminMapper;

    public Admin selectByUsername(String username) {
        return adminMapper.selectByUsername(username);
    }
}
