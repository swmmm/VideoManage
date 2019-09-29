package pers.swmmm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pers.swmmm.mapper.AdvertisementMapper;
import pers.swmmm.po.Advertisement;
import pers.swmmm.service.AdvertisementService;

import java.util.List;

public class AdvertisementServiceImpl implements AdvertisementService {
    @Autowired
    AdvertisementMapper advertisementMapper;

    @Cacheable(value = "advertisement")
    public List<Advertisement> getAdvertisements() {
        System.out.println("该方法执行了。");
        return advertisementMapper.getAdvertisements();
    }
}
