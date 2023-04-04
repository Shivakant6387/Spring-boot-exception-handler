package com.example.springbootexception.controller;
import com.example.springbootexception.dto.UserDto;
import com.example.springbootexception.entity.User;
import com.example.springbootexception.exception.UserNotFoundException;
import com.example.springbootexception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserDto userDto){
        return new ResponseEntity<>(userService.saveUser(userDto), HttpStatus.CREATED);
    }
    @GetMapping("/fetchAll")
    public ResponseEntity<List<User>>getAllUser(){
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User>getUser(@PathVariable int id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
