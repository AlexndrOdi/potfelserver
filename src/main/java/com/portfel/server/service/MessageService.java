package com.portfel.server.service;


import com.portfel.server.entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAll();
    Message getById(long id);
    Message save(Message message);
    void delete(long id);
}
