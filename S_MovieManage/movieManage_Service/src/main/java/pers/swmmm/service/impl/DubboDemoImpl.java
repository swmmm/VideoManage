package pers.swmmm.service.impl;

import org.springframework.stereotype.Service;
import pers.swmmm.service.DubboDemo;

/**
 * @ClassName: DubboDemoImpl
 * @description:
 * @author: swm
 * @create: 2019-08-26 14:49
 **/
public class DubboDemoImpl implements DubboDemo {
    public String remoteCall(String call) {
        return "The remote method has been called";
    }
}
