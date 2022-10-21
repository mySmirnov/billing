package com.example.billing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/user")
public class UserRestController {
    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Integer id) {
        return String.format("Hello %s!", id);
    }
}
