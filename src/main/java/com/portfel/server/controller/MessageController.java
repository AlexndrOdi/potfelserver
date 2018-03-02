package com.portfel.server.controller;

import com.portfel.server.entity.Message;
import com.portfel.server.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String getMessage(ModelMap model){
        return "this is a first message";
    }

    @RequestMapping(value = "/geto",method = RequestMethod.GET)
    @ResponseBody
    public Message getMessage(){
        List<Message> list = messageRepository.findAll();
        return createMockMessage();
    }

    private Message createMockMessage() {
        Message message=new Message();
        message.setId(1);
        message.setValue("Hi, man! It's mock object!");
        message.setDate(new Date());
        return message;
    }

    /**    not for commit, just test
     * after test it will be deleted
     * kill this shit pleas.. */

    @RequestMapping(value = "/getdb",method = RequestMethod.GET)
    @ResponseBody
    public String getDB(){
        Message message=new Message();
        message.setId(1);
        message.setValue("Hi, man!");
        message.setDate(new Date());
        return message.toString();
    }
}
