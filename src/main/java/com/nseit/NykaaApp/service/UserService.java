package com.nseit.NykaaApp.service;

import com.nseit.NykaaApp.model.ProductUser;
import com.nseit.NykaaApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
     private UserRepository userRepository;
    public void addUser(ProductUser productUser){
        userRepository.save(productUser);
    }
    public List<ProductUser> viewUser(){
        return userRepository.findAll();
    }
    public void updateUser(ProductUser productUser){
        userRepository.save(productUser);
    }
    public void deleteUser(int userId){
        userRepository.deleteById(userId);
    }
}
