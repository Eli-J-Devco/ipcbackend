/********************************************************
* Copyright 2020-2021 NEXT WAVE ENERGY MONITORING INC.
* All rights reserved.
* 
*********************************************************/
package com.nwm.api.services;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import com.nwm.api.controllers.BaseController;
import com.nwm.api.entities.UserEntity;

@Component
public class CustomUserDetailService extends BaseController implements UserDetailsService {
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
    	try {

        	userService = new UserService();
        	if(username == "") {
        		throw new UsernameNotFoundException("Must specify both username and corporate customer type");
        	}
        	UserEntity user = new UserEntity();
        	user = userService.getUserByUserName(username);
            String passwd = "";
            passwd = passwordEncoder.encode(user.getPassword());
            user.setPassword(passwd);
            user.setFirst_name(user.getFirst_name());
            user.setId(user.getId());
            Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
    		authorities.add(new SimpleGrantedAuthority(user.getRoles()));
    		user.setAuthorities(authorities);
    		return user;
		} catch (Exception ex) {
			return new UserEntity();
		}
    	
    }
    
    
    
    
}
