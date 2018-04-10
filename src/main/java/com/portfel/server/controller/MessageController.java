package com.portfel.server.controller;

import com.portfel.server.entity.Message;
import com.portfel.server.service.MessageService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    private static final Logger logger = LogManager.getLogger(MessageController.class.getName());

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Message> getAllMessages()
    {
        logger.info("User get all messages");
        return messageService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getMessageById(@PathVariable long id){
        logger.info("User get message by id: {}",id);
        return messageService.getById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Message saveMessage(@RequestBody Message message){
        logger.info("User save message: {}",message.toString());
        return messageService.save(message);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteMessage (@PathVariable long id){
        logger.info("User delete message with id: {}",id);
        messageService.delete(id);
    }

}
