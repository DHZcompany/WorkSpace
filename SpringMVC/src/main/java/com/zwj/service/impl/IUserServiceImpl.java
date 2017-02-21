package com.zwj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zwj.dao.UserDao;
import com.zwj.entity.User;
import com.zwj.service.IUserService;

/**
 * @author Administrator 
 * 查询User接口实现类
 */
@Service("iuserService")
public class IUserServiceImpl implements IUserService {

	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(String id) {
		return this.userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.userDao.getAllUser();
	}

}
