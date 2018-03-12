package com.portfel.server.service.security;

import com.portfel.server.entity.User;

public interface UserService {

    void save(User user);
    User findByUserName(String username);
}
