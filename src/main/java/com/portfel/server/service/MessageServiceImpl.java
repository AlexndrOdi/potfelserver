package com.portfel.server.service;

import com.portfel.server.entity.Message;
import com.portfel.server.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Service
public class MessageServiceImpl implements MessageService{

    private static final Logger logger = Logger.getLogger(MessageServiceImpl.class.getName());

    @Autowired
    private MessageRepository messageRepository;

    @Transactional
    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    @Transactional
    public Message getById(long id) {
        return messageRepository.findOne(id);
    }

    @Transactional
    public Message save(Message message) {
        return messageRepository.saveAndFlush(message);
    }

    @Transactional
    public void delete(long id) {
        messageRepository.delete(id);
    }
}
