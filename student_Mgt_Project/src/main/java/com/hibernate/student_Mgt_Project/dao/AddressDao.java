package com.hibernate.student_Mgt_Project.dao;

import com.hibernate.student_Mgt_Project.entity.Address;

public interface AddressDao {
	public void insertAddress(int hno, String city, String state, String pin);

	public void updateAddress( int hno, String city, String state, String pin);

	public void deletetAddress(int aid);

	public Address viewAddress(int aid);
}
