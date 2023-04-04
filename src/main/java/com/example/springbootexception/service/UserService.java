package com.example.springbootexception.service;

import com.example.springbootexception.dto.UserDto;
import com.example.springbootexception.entity.User;
import com.example.springbootexception.exception.UserNotFoundException;
import com.example.springbootexception.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDto userDto){
        User user=User.build(0,userDto.getUserName(),userDto.getUserEmail(), userDto.getGender(), userDto.getMobile(), userDto.getAge(), userDto.getNationality());
        return userRepository.save(user);
    }
    public List<User>getAllUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id) throws UserNotFoundException {
        User user= userRepository.findByUserId(id);
        if (user!=null){
            return user;
        }
        else {
            throw new UserNotFoundException("User Not Found with id :"+id);
        }
    }
}
