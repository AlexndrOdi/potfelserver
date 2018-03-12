package com.portfel.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/header")
public class HeaderController {

    private static final Logger logger= Logger.getLogger(HeaderController.class.getName());

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getMainPage(){
        logger.info("the user went to the 'main' page");
        return null;
    }

    @RequestMapping(value = "/studio", method = RequestMethod.GET)
    public String getStudioShot(){
        logger.info("the user went to the 'studio' page");
        return null;
    }

    @RequestMapping(value = "/lovestory", method = RequestMethod.GET)
    public String getLoveStory(){
        logger.info("the user went to the 'lovestory' page");
        return null;
    }

    @RequestMapping(value = "/inwaiting", method = RequestMethod.GET)
    public String getWaitingMiracle(){
        logger.info("the user went to the 'waiting' page");
        return null;
    }

    @RequestMapping(value = "/family", method = RequestMethod.GET)
    public String getFamilyShot(){
        logger.info("the user went to the 'family' page");
        return null;
    }

    @RequestMapping(value = "/walk", method = RequestMethod.GET)
    public String getPhotoWalk(){
        logger.info("the user went to the 'walk' page");
        return null;
    }

    @RequestMapping(value = "/socials", method = RequestMethod.GET)
    public String getSocials(){
        logger.info("the user went to the 'socials' page");
        return null;
    }
}