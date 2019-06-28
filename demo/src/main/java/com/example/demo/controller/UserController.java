package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.Userservice;



@RestController
@RequestMapping(value = "/api/user", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
	@Autowired
	private Userservice userservice;

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id) {
		int result = userservice.delete(id);
		if (result >= 1) {
			return "success";
		} else {
			return "fail";
		}
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user) {
		int result = userservice.Update(user);
		if (result >= 1) {
			return "success";
		} else {
			return "fail";
		}

	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public User insert(User user) {
		return userservice.insertUser(user);
	}

	@RequestMapping("/ListUser")
	@ResponseBody
	public List<User> ListUser(){
		return userservice.ListUser();
	}

	@RequestMapping("/ListUserByname")
	@ResponseBody
	public List<User> ListUserByname(String name){
		return userservice.findByName(name);
	}
	@RequestMapping("/selectPhone_listById")
	@ResponseBody
	public List<User> selectPhone_listById(int id){
		return userservice.selectPhone_listById(id);
	}
	@RequestMapping("/selectUserAndPhone_listById")
	@ResponseBody
	public List<User> selectUserAndPhone_listById(int id){
		return userservice.selectUserAndPhone_listById(id);
	}
}

