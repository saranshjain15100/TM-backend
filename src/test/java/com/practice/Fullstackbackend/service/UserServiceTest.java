package com.practice.Fullstackbackend.service;

import com.practice.Fullstackbackend.UserDTO.UserDTO;
import com.practice.Fullstackbackend.model.User;
import com.practice.Fullstackbackend.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

        @Mock
        private UserRepository userRepo;

        private UserService userService;

        @BeforeEach
        void setUp() {
            this.userService = new UserService(this.userRepo) {
                @Override
                public List<User> filteredUsers(UserDTO newUser) {
                    return null;
                }
            };
        }

        @Test
        void getAllPerson() {
            userService.filteredUsers();
            verify(userRepo).findAll();
        }

    @Test
    void filteredUsers() {

    }
}