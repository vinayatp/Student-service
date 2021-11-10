package com.example.Studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Studentservice.VO.ResponseTemplateVO;
import com.example.Studentservice.VO.Teacher;
import com.example.Studentservice.model.Student;
import com.example.Studentservice.repository.IStudentRepository;
@Service
public class StudentServiceImpl implements IStudentService {
@Autowired
IStudentRepository istudentrepository;
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return istudentrepository.save(student);
	}
	@Override
	public Student getStudentBysName(String sName) {
		// TODO Auto-generated method stub
		return istudentrepository.findBysName(sName);
	}
	@Override
	public ResponseTemplateVO getStudandTeacherdetailsbysName(String sName) {
	 Student save=istudentrepository.findBysName(sName);
	 int var=save.getsClass();
	 RestTemplate rest = new RestTemplate();
	 Teacher teacher=rest.getForObject("http://localhost:1290/api/teacher/api/getTeacherbyTclass/"+var,Teacher.class);
	 ResponseTemplateVO resp=new ResponseTemplateVO(save,teacher);
		return resp;
	}
   
}
