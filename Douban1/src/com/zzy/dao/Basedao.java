package com.zzy.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class Basedao {
    public static SqlSession getConnection() throws IOException{
    	InputStream is=Resources.getResourceAsStream("mybatis-config.xml");
    	SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
    	return  factory.openSession(true);
    }
    
    public static void closeAll(SqlSession session){
    	if (session!=null) {
			session.close();
		}
    }
}
