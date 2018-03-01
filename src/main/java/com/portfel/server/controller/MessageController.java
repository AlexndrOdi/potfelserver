package com.portfel.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/message")
public class MessageController {

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String getMessage(ModelMap model){
        return "this is a first message";
    }
}
