package com.example.springbootprimary.service;

import com.example.springbootprimary.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootprimary.repository.UserRepository;
import com.example.springbootprimary.util.Message;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Message login(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);

        return new Message(user == null, "");
    }
}
