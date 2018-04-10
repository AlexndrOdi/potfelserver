package com.portfel.server.controller;

import com.portfel.server.entity.Image;
import com.portfel.server.repository.ImageRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/page")
public class PageController {

    private static final Logger logger = LogManager.getLogger(PageController.class.getName());

    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping(value = "/main", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String getPage(){
        return "test";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE, params = "name")
    public ModelAndView getPage(@RequestParam (name = "name", required = false) String name){
        System.out.println(name);
        ModelAndView model = new ModelAndView();
        if (name.equals("index")) {
            model.setStatus(HttpStatus.OK);
            model.setViewName("index");
        }
        model.setViewName("test");
        model.setStatus(HttpStatus.OK);
        model.addObject("name", name);
        return model;
    }

}
