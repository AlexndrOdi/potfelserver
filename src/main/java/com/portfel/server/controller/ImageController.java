package com.portfel.server.controller;

import com.portfel.server.repository.ImageRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping()
public class ImageController {

    private static final Logger logger = LogManager.getLogger(ImageController.class.getName());

    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping(value = "/image", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE, params = "id")
    public @ResponseBody byte[] getImageById(@RequestParam("id") long id){
        return imageRepository.findOne(id).getDataImage();
    }


}
