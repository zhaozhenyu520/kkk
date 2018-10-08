package com.zzy.SrpngMVC;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zzy.entity.ShiJi;
import com.zzy.servelt.Userservelt;

@Controller
@RequestMapping("/myController")
public class select extends HttpServlet {
	// myController/ShiJiSelect
	@RequestMapping("/ShiJiSelect.html")
	public void ShiJiSelect(HttpServletResponse response) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods",
				"POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers",
				"Content-Type, Accept");
		response.setContentType("text/json; charset=utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Userservelt u = (Userservelt) context.getBean("userservelt");
		List<ShiJi> jis = u.getShiJi();
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		int i = jis.size();
		int j = 0;
		for (ShiJi js : jis) {
			j++;
			sb.append("{");
			sb.append("\"id\":" + js.getShijiid() + ",");
			sb.append("\"jieshao\":\"" + js.getJieshao() + "\",");
			sb.append("\"jiage\":" + js.getJiage() + ",");
			sb.append("\"name\":\"" + js.getName() + "\"");
			sb.append("}");
			if (j < i) {
				sb.append(",");
			}
		}
		sb.append("]");

		out.print(sb.toString());
	}

	//
	// @RequestMapping("/select1.html")
	// public ModelAndView select() {
	// ApplicationContext context = new ClassPathXmlApplicationContext(
	// "applicationContext.xml");
	// Userservelt lt = (Userservelt) context.getBean("userservelt");
	// List<User> user = lt.users();
	// ModelAndView m = new ModelAndView();
	// m.addObject("list", user);
	// m.setViewName("index");
	// return m;
	// }
	//
	// @RequestMapping("/delect")
	// public ModelAndView delect(@RequestParam("id") int id) {
	// ApplicationContext context = new ClassPathXmlApplicationContext(
	// "applicationContext.xml");
	// Userservelt lt = (Userservelt) context.getBean("userservelt");
	// int num = lt.users02(id);
	// /* List<User> user =null; */
	// List<User> user = lt.users();
	// ModelAndView m = new ModelAndView();
	// m.addObject("list", user);
	// m.setViewName("index");
	// return m;
	// }
	//
	// @RequestMapping("/update")
	// public ModelAndView Update(@RequestParam("id") int id) {
	// ApplicationContext context = new ClassPathXmlApplicationContext(
	// "applicationContext.xml");
	// Userservelt lt = (Userservelt) context.getBean("userservelt");
	// List<User> user = lt.users04(id);
	// ModelAndView m = new ModelAndView();
	// m.addObject("list", user);
	// m.setViewName("MyJsp");
	// return m;
	// }
	//
	//
	// @RequestMapping("/update01")
	// public ModelAndView Update(@RequestParam("id") int id,
	// @RequestParam("name") String name, @RequestParam("pwd") String pwd) {
	//
	// ApplicationContext context = new ClassPathXmlApplicationContext(
	// "applicationContext.xml");
	// Userservelt lt = (Userservelt) context.getBean("userservelt");
	// User u=new User();
	// u.setId(id);
	// u.setuName(name);
	// u.setuPwd(pwd);
	// int num= lt.users01(u);
	//
	// List<User> user = lt.users();
	// ModelAndView m = new ModelAndView();
	// m.addObject("list", user);
	// m.setViewName("index");
	// return m;
	// }
	//
	//
	//
	// @RequestMapping("/insert01")
	// public String insert01(){
	// return "Insert";
	// }
	//
	// @RequestMapping("/insert")
	// public ModelAndView insert(
	// @RequestParam("name") String name, @RequestParam("pwd") String pwd){
	//
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("applicationContext.xml");
	// Userservelt lt = (Userservelt) context.getBean("userservelt");
	// User u=new User();
	// u.setuName(name);
	// u.setuPwd(pwd);
	// int num= lt.users03(u);
	//
	// List<User> user = lt.users();
	// ModelAndView m = new ModelAndView();
	// m.addObject("list", user);
	// m.setViewName("index");
	// return m;
	// }
}
