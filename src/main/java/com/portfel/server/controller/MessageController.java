package com.portfel.server.controller;

import com.portfel.server.entity.Message;
import com.portfel.server.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/getString",method = RequestMethod.GET)
    @ResponseBody
    public String getMessage(ModelMap model){
        return "this is a first message";
    }

    @RequestMapping(value = "/messages",method = RequestMethod.GET)
    @ResponseBody
    public List<Message> getAllMessages(){
        return messageService.getAll();
    }

    @RequestMapping(value = "/message{id}",method = RequestMethod.GET)
    @ResponseBody
    public Message getMessageById(@PathVariable long id){
        return messageService.getById(id);
    }

    @RequestMapping(value = "/messages",method = RequestMethod.POST)
    @ResponseBody
    public Message saveMessage(@RequestBody Message message){
        return messageService.save(message);
    }

    @RequestMapping(value = "/messages{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMessage (@PathVariable long id){
        messageService.delete(id);
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
