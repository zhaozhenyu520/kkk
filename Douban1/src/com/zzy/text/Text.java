package com.zzy.text;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zzy.entity.ShiJi;
import com.zzy.servelt.Userservelt;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Userservelt user=(Userservelt) context.getBean("userservelt");
		List<ShiJi> jis=user.getShiJi();
		for (ShiJi shiJi : jis) {
			System.out.println(shiJi.getName());
		}
	}

}
