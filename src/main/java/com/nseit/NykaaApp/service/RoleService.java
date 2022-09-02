package com.nseit.NykaaApp.service;

import com.nseit.NykaaApp.model.Role;
import com.nseit.NykaaApp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public void addRole(Role role){
        roleRepository.save(role);

    }
    public List<Role> viewRole(){
        return roleRepository.findAll();
    }


}
