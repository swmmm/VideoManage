package pers.swmmm.controller;


import pers.swmmm.po.Advertisement;
import pers.swmmm.service.AdvertisementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RedisController {
    @Autowired
    private AdvertisementService advertisementService;

    @RequestMapping(value = "/redis")
    public String toRedis(Model model){
        List<Advertisement> advertisementList =advertisementService.getAdvertisements();
        model.addAttribute("advertisements",advertisementList);
        return "RedisIndex";
    }

}
