package com.aahar.Service.Impl;

import com.aahar.Entity.User;
import com.aahar.Repo.UserRepo;
import com.aahar.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public User CreateUser(User user)throws Exception {

        if (findUserByEmail(user.getEmail()) != null){
            throw new Exception("User is exist with " + user.getEmail());
        }
        return userRepo.save(user);
    }

    @Override
    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findUserById(Long Id) throws Exception {
        return userRepo.findById(Id);
    }
    @Override
    public User findUserByEmail(String email) throws Exception {
       return userRepo.findUserByEmail(email);
    }

    @Override
    public User updateUser(Long Id, User user) throws Exception {
        User newUser = new User();
        try{
            if (userRepo.findById(Id).isPresent()){
                newUser.setId(Id);
                newUser.setEmail(user.getEmail());
                newUser.setFullName(user.getFullName());
                newUser.setPassword(user.getPassword());
            }else{
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            throw new RuntimeException(e);
        }
        return userRepo.save(newUser);
    }

    @Override
    public String deleteUser(Long Id) throws Exception {
        userRepo.deleteById(Id);
        return "User deleted Succesfully";
    }

}
