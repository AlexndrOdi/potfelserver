package com.portfel.server.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/header")
public class HeaderController {

    private static final Logger logger = LogManager.getLogger(HeaderController.class.getName());

//something realization for header of main page
}