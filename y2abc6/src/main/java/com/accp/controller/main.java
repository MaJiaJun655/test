package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.accp.model.Student;
import com.accp.service.servicemain;

import java.util.*;
@Controller
@RequestMapping("main")
public class main {
	@Autowired
	private servicemain service;
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("allinfo")
	@ResponseBody
	public List<Student> selectAll(){
		return service.selectAll();
	}
	
	@GetMapping("getbysid")
	@ResponseBody
	public Student selectBysid(Integer sid) {
		return service.selectBysid(sid);
	}

}
