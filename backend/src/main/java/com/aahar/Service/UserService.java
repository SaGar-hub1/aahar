package com.aahar.Service;

import com.aahar.Entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User CreateUser(User user) throws Exception;
    List<User> findAllUser();
    Optional<User> findUserById(Long Id) throws Exception;
    User findUserByEmail(String email) throws Exception;
    User updateUser(Long Id, User user) throws Exception;
    String deleteUser(Long Id) throws Exception;

}
