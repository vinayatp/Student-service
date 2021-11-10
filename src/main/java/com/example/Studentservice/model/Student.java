package com.example.Studentservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student890")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sRollno;
	private String sName;
	private int sClass;
	public Student() {
		super();
	}
	public Student(Long sRollno, String sName, int sClass) {
		super();
		this.sRollno = sRollno;
		this.sName = sName;
		this.sClass = sClass;
	}
	public Long getsRollno() {
		return sRollno;
	}
	public void setsRollno(Long sRollno) {
		this.sRollno = sRollno;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsClass() {
		return sClass;
	}
	public void setsClass(int sClass) {
		this.sClass = sClass;
	}
	
	
	

}
