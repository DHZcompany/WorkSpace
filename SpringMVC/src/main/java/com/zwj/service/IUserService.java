package com.zwj.service;

import java.util.List;

import com.zwj.entity.User;

/**
 * @author Administrator 
 * ²éÑ¯User½Ó¿Ú
 */
public interface IUserService {
	public User getUserById(String id);
	public List<User> getAllUser();
}
