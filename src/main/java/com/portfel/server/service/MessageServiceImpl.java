package com.portfel.server.service;

import com.portfel.server.entity.Message;
import com.portfel.server.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    public Message getById(long id) {
        return messageRepository.findOne(id);
    }

    public Message save(Message message) {
        return messageRepository.saveAndFlush(message);
    }

    public void delete(long id) {
        messageRepository.delete(id);
    }
}
