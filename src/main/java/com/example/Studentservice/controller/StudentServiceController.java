package com.example.Studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Studentservice.VO.ResponseTemplateVO;
import com.example.Studentservice.model.Student;
import com.example.Studentservice.service.IStudentService;

@RestController
@RequestMapping(value="/api/Student")
public class StudentServiceController {
	@Autowired
	IStudentService istudentservice;
	@RequestMapping(value="/api/createStudent",method=RequestMethod.POST)
	public Student createStudent(@RequestBody Student student)
	{
		return istudentservice.createStudent(student);
	}
	@RequestMapping(value="/api/getStudent/{sName}",method=RequestMethod.GET)
	public Student getStudentbysName(@PathVariable String sName)
	{
		return istudentservice.getStudentBysName(sName);
	}
	@RequestMapping(value="/api/getstudandTeacher/{sName}",method=RequestMethod.GET)
	public ResponseTemplateVO getstudandteacherBysName(@PathVariable String sName)
	{
		return istudentservice.getStudandTeacherdetailsbysName(sName);
	}

}
