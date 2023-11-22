package ru.heeench.springwebtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.heeench.springwebtest.model.User;
import ru.heeench.springwebtest.repository.UserRepo;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void createUser(User user) {
        userRepo.save(user);
    }
    @Override
    public List<User> readAll() {
        return userRepo.findAll();
    }

    @Override
    public User read(long id) {
        return userRepo.getOne(id);
    }

    @Override
    public boolean update(User user, long id) {
        if (userRepo.existsById(id)) {
            user.setId(id);
            userRepo.save(user);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(long id) {
        if (userRepo.existsById(id)) {
            userRepo.deleteById(id);
            return true;
        }

        return false;
    }
}
