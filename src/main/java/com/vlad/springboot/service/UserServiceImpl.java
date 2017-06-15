package com.vlad.springboot.service;

import com.vlad.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by vlad on 14-Jun-17.
 */
@Service
public class UserServiceImpl implements UserService {

    private static final AtomicInteger counter = new AtomicInteger();

    private static List<User> users;

    static {
        users = populateUsers();
    }

    private static List<User> populateUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Ola", 12, 5000, counter.incrementAndGet()));
        users.add(new User("Vlad",23,6000, counter.incrementAndGet()));
        return users;
    }


    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public User findById(int id) {
        return users
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public boolean isUserExist(User user) {
        return users.stream()
                .anyMatch(user1 -> Objects.equals(user.getName(), user1.getName()));
    }

    @Override
    public void saveUser(User user) {
        user.setId(counter.incrementAndGet());
        users.add(user);

    }

    @Override
    public void updateUser(User currentUser) {
        int index = users.indexOf(currentUser);
        users.set(index, currentUser);

    }

    @Override
    public void deleteUserById(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    @Override
    public void deleteAllUsers() {
        users.clear();
    }
}
