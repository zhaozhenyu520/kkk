package com.zzy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zzy.entity.ShiJi;



public interface UserMapper {
		public List<ShiJi> getShiJi();
}
