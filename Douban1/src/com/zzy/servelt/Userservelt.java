package com.zzy.servelt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zzy.dao.UserMapper;
import com.zzy.entity.ShiJi;


@Service("userservelt")
public class Userservelt {
	@Autowired
	private UserMapper userMapper;

	public List<ShiJi> getShiJi(){
		return userMapper.getShiJi();
	}
	
	

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

}
