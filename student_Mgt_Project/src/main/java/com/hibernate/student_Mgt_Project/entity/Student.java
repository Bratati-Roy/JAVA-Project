package com.hibernate.student_Mgt_Project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Students")
public class Student {
	  @Id
	  @GeneratedValue
	  @Column(name="s_id")
	  private int id;
	  @Column(name="s_name",nullable=false,length=30)
	  private String name;
	  @Column(name="s_contact",nullable=false,length=10,unique=true)
	  private String contact;
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "aid")
	  private Address address;
	  
	 //default Constructor
	  public Student() {
		  super();
		}
	  
	  //parameterized Constructor
	  public Student( String name, String contact,Address address) {
			super();
			this.name = name;
			this.contact = contact;
			this.address=address;
		}
	  
//	  getter & setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student: \nStudent_id= " + id + " \nName= " + name + " \nContact= " + contact + " \nAddress: " + address ;
	}
	}
