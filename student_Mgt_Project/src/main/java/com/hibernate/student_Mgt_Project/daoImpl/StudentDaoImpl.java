package com.hibernate.student_Mgt_Project.daoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.student_Mgt_Project.util.HiberUtil;
import com.hibernate.student_Mgt_Project.entity.Address;
import com.hibernate.student_Mgt_Project.entity.Student;
import com.hibernate.student_Mgt_Project.dao.StudentDao;

public class StudentDaoImpl implements StudentDao{
	HiberUtil hu=new HiberUtil();
	Session session=hu.getSession();
	
	@Override
	public void insertStudent(String name,String contact,Address add) {
		Transaction tx=session.beginTransaction();
		Student s=new Student(name,contact,add);
		 session.save(s);
		tx.commit();
	     System.out.println("Record inserted successfully....");
	}

	@Override
	public void updateStudent(int id,String name,String contact,Address add) {
		Student s=getStudent(id);
		s.setName(name);
		s.setContact(contact);
		Transaction tx=session.beginTransaction();
		session.update(s);
		tx.commit();
		System.out.println("Updated Successfully....");
	}

	@Override
	public void deleteStudent(int id) {
		Student s = session.get(Student.class, id);
		Transaction tx = session.beginTransaction();
		session.delete(s);
		tx.commit();
		session.close();
	}

	@Override
	public Student getStudent(int id) {
		return session.get(Student.class, id);
	}

}
