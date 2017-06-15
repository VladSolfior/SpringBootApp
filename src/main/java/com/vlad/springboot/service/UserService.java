package com.vlad.springboot.service;

import com.vlad.springboot.model.User;

import java.util.List;

/**
 * Created by vlad on 14-Jun-17.
 */
public interface UserService {

    List<User> findAllUsers();

    User findById(int id);

    boolean isUserExist(User user);

    void saveUser(User user);

    void updateUser(User currentUser);

    void deleteUserById(int id);

    void deleteAllUsers();

}