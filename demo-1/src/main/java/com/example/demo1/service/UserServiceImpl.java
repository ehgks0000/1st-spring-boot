package com.example.demo1.service;

import com.example.demo1.domain.entity.User;
import com.example.demo1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findUser(Long userId) {
        return userRepository.findUserById(userId);
    }
}
