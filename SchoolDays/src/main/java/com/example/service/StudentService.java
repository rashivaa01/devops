package com.example.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.dto.StudentDto;

@Service("StudentService")
public class StudentService {

	@Resource(name = "StudentDao")
	StudentDao studentDao;

	public List<StudentDto> getStudents() {
		return studentDao.getStudents();
	}
}
