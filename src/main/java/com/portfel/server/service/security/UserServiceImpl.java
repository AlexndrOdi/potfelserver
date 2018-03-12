package com.portfel.server.service.security;

import com.portfel.server.entity.Role;
import com.portfel.server.entity.User;
import com.portfel.server.repository.RoleRepository;
import com.portfel.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleRepository.getOne(1L));// установили роль согласно таблице в бд
        user.setRoles(roles);
        userRepository.save(user);
    }

    public User findByUserName(String username) {
        return userRepository.finByUsername(username);
    }
}
