package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.dto.StudentDto;

@Repository("StudentDao")
public class StudentDao {

	public List<StudentDto> getStudents() {

		List<StudentDto> list = new ArrayList<>();

		boolean flag = false;

		list.add(new StudentDto(12, "Pranav Munshi"));
		list.add(new StudentDto(24, "Aakash Munshi"));
		list.add(new StudentDto(36, "Suresh Munshi"));

		if (!flag)
			return list;
		return null;
	}
}
