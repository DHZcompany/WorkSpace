package com.zwj.dao;

import java.util.List;
import com.zwj.entity.User;

/**
 * @author Administrator 
 * UserDao���ݿ������
 */

public interface UserDao {
	public User getUserById(String id);
	public List<User> getAllUser();
}
