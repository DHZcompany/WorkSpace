package com.zwj.service;

import java.util.List;

import com.zwj.entity.User;

/**
 * @author Administrator 
 * ��ѯUser�ӿ�
 */
public interface IUserService {
	public User getUserById(String id);
	public List<User> getAllUser();
}
