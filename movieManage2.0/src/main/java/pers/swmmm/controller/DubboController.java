package pers.swmmm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.swmmm.service.VideoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: DubboController
 * @description:
 * @author: swm
 * @create: 2019-09-06 14:05
 **/
@RestController
@RequestMapping(value = "/test")
public class DubboController {

    private static List<DubboController> list = new ArrayList<>();

    @RequestMapping(value = "videoTest")
    public String test(){
        list.add(new DubboController());
        return "";
    }

}
