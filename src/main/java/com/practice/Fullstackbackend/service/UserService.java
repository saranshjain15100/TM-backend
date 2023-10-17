package com.practice.Fullstackbackend.service;
import com.practice.Fullstackbackend.UserDTO.UserDTO;
import com.practice.Fullstackbackend.model.User;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;


public interface UserService {
    List<User> filteredUsers(UserDTO newUser);
}
