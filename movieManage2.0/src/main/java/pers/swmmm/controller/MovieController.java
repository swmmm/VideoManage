package pers.swmmm.controller;

import pers.swmmm.po.Video;
import pers.swmmm.service.VideoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MovieController {

    @Autowired
    private VideoService videoService;
    @RequestMapping(value = "/movie")
    public String showMovie(){
        return "redirect:/movie/list";
    }

    @RequestMapping(value = "/movie/list")
    public String toVideoList(Model model){
        model.addAttribute("Videos",videoService.getVideos());
        model.addAttribute("Tags",videoService.getTags());
        return "videoManage";
    }

    @RequestMapping(value = "/movie/add",method = RequestMethod.POST)
    @ResponseBody
    public String addVideo(Video video){
        videoService.addVideo(video);
        return "OK";
    }
    @RequestMapping(value = "/movie/edit")
    @ResponseBody
    public Video getVideoById(Integer videoId){
        return videoService.getVideoById(videoId);
    }

    @RequestMapping(value = "/movie/update")
    @ResponseBody
    public String updateVideo(Video video){
        videoService.updateVideo(video);
        return "OK";
    }
}
