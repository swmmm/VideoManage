package pers.swmmm.service;

import pers.swmmm.po.Admin;

public interface LoginService {
    Admin selectByUsername(String username);
}
