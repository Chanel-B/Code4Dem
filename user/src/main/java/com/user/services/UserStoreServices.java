package com.user.services;

import com.user.model.Users;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Optional;

public class UserStoreServices {

    @Autowired
    private UserRepository userRepository;

    //TODO GET ALL users
    public Collection<Users> findAllUsers() {
        return userRepository.findAll();
    }

    //TODO SAVE user
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    //TODO UPDATE users
    public String updateUser(Users newUser, int id) {
        if (!userRepository.findById(id).isEmpty()) {

            Users user =  userRepository.findById(id).get();

            user.setEmail(newUser.getEmail());
            user.setUserName(newUser.getUserName());
            user.setPassword(newUser.getPassword());

            userRepository.save(user);

            return "User Data with id [" + id + "] Updated successfully";

        } else {

            return "User with id [" + id + "] not found in database";
        }
    }

    //TODO DELETE users
    public String deleteUser(int id) {
        if ( userRepository.findById(id).isEmpty()) {
            return "The User with id [" + id + "] is not found in database";
        } else {
            userRepository.deleteById(id);
            return "Deleted User with id [" + id + "] Successfully from database";
        }
    }

    //TODO RETRIEVE A users BY ID
    public Optional<Users> findUserById(int id) {
        return userRepository.findById(id);
    }

}
