package ru.heeench.springwebtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.heeench.springwebtest.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
