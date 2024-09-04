package com.example.Abs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
@Autowired

private UserRepository userRepository;

public User saveUser(User user) {
    return userRepository.save(user);
}
}
