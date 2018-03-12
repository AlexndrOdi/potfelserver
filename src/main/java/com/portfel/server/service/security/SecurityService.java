package com.portfel.server.service.security;

public interface SecurityService {

    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
