package com.example.casestudy.service.impl;

import com.example.casestudy.model.employeeModel.User;
import com.example.casestudy.repository.IRepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private IRepositoryUser repositoryUser;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.repositoryUser.findByUserName(username);

        if (user == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        System.out.println("Found User: " + user);
        List<GrantedAuthority> grantList = new ArrayList<>();
        UserDetails userDetails = (UserDetails) new org.springframework.security.core.userdetails.User(user.getUserName(),
                user.getPassWord(), grantList);
        return userDetails;
    }
}
