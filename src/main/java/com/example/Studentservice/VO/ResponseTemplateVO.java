package com.example.Studentservice.VO;

import com.example.Studentservice.model.Student;

public class ResponseTemplateVO {
	Student student;
	Teacher teacher;
	public ResponseTemplateVO(Student student, Teacher teacher) {
		super();
		this.student = student;
		this.teacher = teacher;
	}
	public ResponseTemplateVO() {
		super();
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
