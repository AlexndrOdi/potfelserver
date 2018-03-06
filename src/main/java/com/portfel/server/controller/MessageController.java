package com.portfel.server.controller;

import com.portfel.server.entity.Message;
import com.portfel.server.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/welcome")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    @ResponseBody
    public List<Message> getAllMessages(){
        return messageService.getAll();
    }

    @RequestMapping(value = "/message{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMessageById(@PathVariable long id){
        return messageService.getById(id);
    }

    @RequestMapping(value = "/addmessages", method = RequestMethod.POST)
    @ResponseBody
    public Message saveMessage(@RequestBody Message message){
        return messageService.save(message);
    }

    @RequestMapping(value = "/messages{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMessage (@PathVariable long id){
        messageService.delete(id);
    }

}
