package com.duong.fakedata.controller;

import com.duong.fakedata.model.User;
import com.duong.fakedata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getFakeUsers(@RequestParam(defaultValue = "10") int count) {
        List<User> userList = userService.getFakeUsers(count);
        return ResponseEntity.ok(userList);
    }

}
