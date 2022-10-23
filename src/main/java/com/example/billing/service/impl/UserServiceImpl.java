package com.example.billing.service.impl;

import com.example.billing.entity.User;
import com.example.billing.repository.UserRepository;
import com.example.billing.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Long add(User user) {
        return userRepository.save(user).getId();
    }
}
