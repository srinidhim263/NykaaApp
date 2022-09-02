package com.nseit.NykaaApp.controller;

import com.nseit.NykaaApp.model.ProductUser;
import com.nseit.NykaaApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public void addUser(@RequestBody ProductUser productUser){

        userService.addUser(productUser);
    }
    @GetMapping("/all")
    public List<ProductUser> viewUser(@PathVariable int id){
        return userService.viewUser();

    }
    @PutMapping
    public void updateUser(@RequestBody ProductUser productUser){

        userService.updateUser(productUser);
    }
    @DeleteMapping
    public void deleteUser(@PathVariable int id){

        userService.deleteUser(id);
    }
}
