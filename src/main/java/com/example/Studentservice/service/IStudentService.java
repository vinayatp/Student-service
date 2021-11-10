package com.example.Studentservice.service;

import com.example.Studentservice.VO.ResponseTemplateVO;
import com.example.Studentservice.model.Student;

public interface IStudentService {
	
	public Student createStudent(Student student);
	public Student getStudentBysName(String sName);
	public ResponseTemplateVO getStudandTeacherdetailsbysName(String sName);

}
