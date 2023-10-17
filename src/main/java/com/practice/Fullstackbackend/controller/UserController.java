package com.practice.Fullstackbackend.controller;

import com.practice.Fullstackbackend.UserDTO.UserDTO;
import com.practice.Fullstackbackend.exception.UserNotFoundException;
import com.practice.Fullstackbackend.model.User;
import com.practice.Fullstackbackend.repository.UserRepository;
import com.practice.Fullstackbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;


@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user",consumes = "application/JSON",produces = "application/JSON")
    List<User> newUser(@RequestBody UserDTO newUser) {
        System.out.println("Going in backend");
        System.out.println("dto="+newUser);
        List<User> filteredUsers  =  userService.filteredUsers(newUser);
        return filteredUsers;
    }

//    @GetMapping("/users")
//    List<User> getAllUsers(){
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/user/{id}")
//    User getUserById(@PathVariable Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new UserNotFoundException(id));
//    }

//    @PutMapping("/user/{id}")
//    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
//        return userRepository.findById(id)
//                .map(user -> {
//                    user.setUsername(newUser.getUsername());
//                    user.setName(newUser.getName());
//                    user.setEmail(newUser.getEmail());
//                    return userRepository.save(user);
//                }).orElseThrow(() -> new UserNotFoundException(id));
//    }

//    @DeleteMapping("/user/{id}")
//    String deleteUser(@PathVariable Long id){
//        if(!userRepository.existsById(id)){
//            throw new UserNotFoundException(id);
//        }
//        userRepository.deleteById(id);
//        return  "User with id "+id+" has been deleted success.";
//    }
}
