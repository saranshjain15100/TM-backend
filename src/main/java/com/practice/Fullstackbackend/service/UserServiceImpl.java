package com.practice.Fullstackbackend.service;

import com.practice.Fullstackbackend.UserDTO.UserDTO;
import com.practice.Fullstackbackend.model.User;
import com.practice.Fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> filteredUsers(UserDTO newUser) {
        System.out.println("In UserService");
        List<User> allUsers = userRepository.findAll();
//        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        List<User> filteredUsers = new ArrayList<>() ;
//        filteredUsers = null;
        System.out.println("In UserService Impl");
        for(User user : allUsers){
//            System.out.println(newUser.getSamplingType() instanceof String);
//            System.out.println(user.getSamplingType() instanceof String);
            if(newUser.getScore() == user.getScore()&&
//                    newUser.getSample() >= user.getId() &&
                    newUser.getSamplingType().equals(user.getSamplingType()) &&
                    newUser.getCaseType().equals(user.getCaseType()) &&
//                    sdformat.parse("newUser.getDate2()").compareTo(sdformat.parse("user.getDate()")) > 0 &&
//                    sdformat.parse("user.getDate()").compareTo(sdformat.parse("newUser.getDate1()")) > 0 &&
                    newUser.getScenarioType().equals(user.getScenarioType())
            )
            {
                System.out.println("In filtered users");
                filteredUsers.add(user);
            }
        }
        return filteredUsers;
    }
}
