package com.example.billing.controller;

import com.example.billing.dto.CreateUserDto;
import com.example.billing.entity.User;
import com.example.billing.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserRestController {
    private final UserService userService;

    @PostMapping
    public Long create(@RequestBody CreateUserDto createUserDto) {
        User user = new User();
        user.setUsername(createUserDto.getUserName());
        user.setPassword(createUserDto.getPassword());
        return userService.add(user);
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Integer id) {
        return String.format("Hello %s!", id);
    }

}
