package com.example.demo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.StudentService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolDaysApplicationTests {

	@Resource(name = "StudentService")
	StudentService stuService;

	@SuppressWarnings("deprecation")
	@Test
	public void contextLoads() {
		Assert.assertNotNull(stuService.getStudents());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void nullCheck() {
		Assert.assertNotNull(stuService.getStudents());
	}

}
