package com.example.ung_dung_blog.service;

import com.example.ung_dung_blog.model.AppUser;
import com.example.ung_dung_blog.model.UserRole;
import com.example.ung_dung_blog.repository.IRepositoryAppUser;
import com.example.ung_dung_blog.repository.IRepositoryUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private IRepositoryAppUser repositoryAppUser;
    @Autowired
    private IRepositoryUserRole repositoryUserRole;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Tìm đối tượng đang đăng nhập trong DB
        AppUser appUser = this.repositoryAppUser.findByUserName(username);
        if (appUser == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        System.out.println("Found User: " + appUser);
        List<GrantedAuthority> grantList = new ArrayList<>();
        List<UserRole> userRoles = this.repositoryUserRole.findByAppUser(appUser);
        if (userRoles != null) {
            for (UserRole userRole : userRoles) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getAppRole().getRoleName());
                grantList.add(authority);
            }
        }

        UserDetails userDetails = new User(appUser.getUserName(),
                appUser.getEncrytedPassword(), grantList);
        return userDetails;
    }
}
