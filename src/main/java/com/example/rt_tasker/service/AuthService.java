package com.example.rt_tasker.service;

import com.example.rt_tasker.dto.UserDTO;
import com.example.rt_tasker.entity.User;
import com.example.rt_tasker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public User register(UserDTO dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return userRepository.save(user);
    }

    public User authenticate(UserDTO dto) {
        return userRepository.findByUsername(dto.getUsername())
                .filter(u -> u.getPassword().equals(dto.getPassword()))
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }
}
