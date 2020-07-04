package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StudentMapper;
import com.accp.model.Student;

@Service
@Transactional
public class servicemain {
	@Autowired
	private StudentMapper Stumapper;
	
	public List<Student> selectAll(){
		return Stumapper.selectByExample(null);
	}
	
	public Student selectBysid(Integer sid) {
		return Stumapper.selectbysid(sid);
	}
}
