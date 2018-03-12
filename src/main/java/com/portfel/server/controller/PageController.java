package com.portfel.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/page")
public class PageController {

    private static final Logger logger = Logger.getLogger(PageController.class.getName());

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getPage(){
        logger.info("the user went to the 'index' page");
        return "index";
    }

    @RequestMapping(value = "/jsp", method = RequestMethod.GET)
    public String getJsp(){
        return "dog";
    }
}
