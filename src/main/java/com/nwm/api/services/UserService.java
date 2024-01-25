/********************************************************
* Copyright 2020-2021 NEXT WAVE ENERGY MONITORING INC.
* All rights reserved.
* 
*********************************************************/
package com.nwm.api.services;

import java.util.ArrayList;
import java.util.List;

import com.nwm.api.DBManagers.DB;
import com.nwm.api.entities.UserEntity;

public class UserService extends DB {

	/**
	 * @description get user by username
	 * @author long.pham
	 * @since 2024-01-25
	 * @param
	 */
	public UserEntity getUserByUserName(String userName) {
		UserEntity user = new UserEntity();
		try {
			user = (UserEntity) queryForObject("User.getUserByEmail", userName);
			if (user == null)
				return new UserEntity();
			
			// Get permission by user id
			List dataList = new ArrayList();
			if (user.getId() != 0 && user.getRoles() != null) {
				dataList = queryForList("User.getPermissionByUser", user);
			}

			user.setPermissions(dataList);
						
			return user;
		} catch (Exception ex) {
			return new UserEntity();
		}
		
	}
	
}
