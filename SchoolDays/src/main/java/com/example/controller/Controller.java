package com.example.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.StudentDto;
import com.example.service.StudentService;

@RestController
public class Controller {

	@Resource(name = "StudentService")
	StudentService studentService;

	@GetMapping("/students")
	public List<StudentDto> getStudents() {
		return studentService.getStudents();
	}
}
