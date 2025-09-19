package com.klu.CICDPROJECT.service;

import com.klu.CICDPROJECT.entity.User;
import com.klu.CICDPROJECT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Signup
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Login validation
    public boolean validateUser(String username, String password) {
        User existingUser = userRepository.findByUsername(username);
        return existingUser != null && existingUser.getPassword().equals(password);
    }
}
