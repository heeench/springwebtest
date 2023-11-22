package ru.heeench.springwebtest.service;

import ru.heeench.springwebtest.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    List<User> readAll();

    User read(long id);
    
    boolean update(User user, long id);

    boolean delete(long id);

}
