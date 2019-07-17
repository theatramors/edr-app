package com.amors.edrapp.controllers;

import com.amors.edrapp.dto.UserDto;
import com.amors.edrapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void add(@RequestBody UserDto dto) {
        userService.add(dto);
    }

    @GetMapping
    public List<UserDto> get() {
        return userService.get();
    }

    @GetMapping("/{username}")
    public UserDto get(@PathVariable String username) {
        return null;
    }
}
