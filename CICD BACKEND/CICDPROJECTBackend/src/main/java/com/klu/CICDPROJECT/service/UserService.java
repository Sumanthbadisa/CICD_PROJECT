package com.klu.CICDPROJECT.service;

import com.klu.CICDPROJECT.entity.User;
import com.klu.CICDPROJECT.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

   
    public User addUser(User user) {
        return userRepository.save(user);
    }

 
    public boolean validateUser(String username, String password) {
        return userRepository.findByUsername(username)
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }
 
    public boolean deleteUserById(Long userId) {
        if (!userRepository.existsById(userId)) {
            return false;
        }
        userRepository.deleteById(userId);
        return true;
    }

 
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
 
    
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
