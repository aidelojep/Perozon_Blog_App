package com.PerozonBloggingApplication1.PerozonBloggingApplication.contoller;

import com.PerozonBloggingApplication1.PerozonBloggingApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//include request address below for request mapping to pick from either Postman or Clientside
@RequestMapping("adress")
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
