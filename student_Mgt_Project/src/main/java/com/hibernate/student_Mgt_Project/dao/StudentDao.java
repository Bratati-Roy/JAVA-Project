package com.hibernate.student_Mgt_Project.dao;

import com.hibernate.student_Mgt_Project.entity.Address;
import com.hibernate.student_Mgt_Project.entity.Student;

public interface StudentDao {
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public void updateStudent(int id,String name,String contact,Address add);
	public void insertStudent(String name,String contact,Address add);
	 
}
