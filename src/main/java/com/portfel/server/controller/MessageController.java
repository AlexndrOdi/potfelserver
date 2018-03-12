package com.portfel.server.controller;

import com.portfel.server.entity.Message;
import com.portfel.server.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/messages")
public class MessageController {

    private static final Logger logger = Logger.getLogger(MessageController.class.getName());

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Message> getAllMessages()
    {
        return messageService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMessageById(@PathVariable long id){
        return messageService.getById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Message saveMessage(@RequestBody Message message){
        return messageService.save(message);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMessage (@PathVariable long id){
        messageService.delete(id);
    }

}
