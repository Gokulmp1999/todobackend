package com.example.todobackEnd.controller;

import com.example.todobackEnd.dto.UserDto;
import com.example.todobackEnd.service.UserDetilesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/todo")
public class LoginController {
    @Autowired
    private UserDetilesServiceImpl userDetilesServiceImpl;

    @PostMapping(path = "/signup")
    public String signUp(@RequestBody UserDto userDto) {
        String id = userDetilesServiceImpl.addUser(userDto);
        return id;
    }

}
