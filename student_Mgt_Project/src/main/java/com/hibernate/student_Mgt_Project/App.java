package com.hibernate.student_Mgt_Project;

import com.hibernate.student_Mgt_Project.dao.*;
import com.hibernate.student_Mgt_Project.daoImpl.*;
import com.hibernate.student_Mgt_Project.entity.*;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	StudentDao sdao=new StudentDaoImpl();
    	Address add=new Address();
    	
    	do {
    	System.out.println("1. Create Student");
    	System.out.println("2. View a Student");
    	System.out.println("3. Update Student");
    	System.out.println("4. DeleteStudent");
    	System.out.println("5. Exit");
    	System.out.println("Enter choice :");
    	Scanner scan=new Scanner(System.in);
    	int ch=scan.nextInt();
    	
    	switch(ch) {
    	case 1:
    	{
    	System.out.println("Enter Name :");
		String name=scan.next();
		System.out.println("Enter contact:");
		String contact=scan.next();
		System.out.println("Enter the house no:");
		int hno=scan.nextInt();
		System.out.println("Enter the City name:");
		String city=scan.next();
		System.out.println("Enter the State:");
		String state=scan.next();
		System.out.println("Enter the Pin code:");
		String pin=scan.next();
		add.setHno(hno);
		add.setCity(city);
		add.setState(state);
		add.setPin(pin);
		sdao.insertStudent(name,contact,add);
		break;
    	}
    	
	    //view
	case 2:
	   {
		System.out.println("Enter Student Id :");
		int id=scan.nextInt();
		System.out.println(sdao.getStudent(id));
		break;
	   }
		
		//update
	case 3:
	 {
		System.out.println("Enter Id: ");
		int id=scan.nextInt();
		System.out.println("Enter name: ");
		String name=scan.next();
		System.out.println("Enter contact: ");
		String contact=scan.next();
		System.out.println("Enter the house no:");
		int hno=scan.nextInt();
		System.out.println("Enter the City name:");
		String city=scan.next();
		System.out.println("Enter the State:");
		String state=scan.next();
		System.out.println("Enter the Pin code:");
		String pin=scan.next();
		sdao.updateStudent(id,name,contact,add);
		 break;
	  }
	//delete
	case 4: 
	{
		System.out.println("Enter Id ");
		  int id=scan.nextInt();
		 sdao.deleteStudent(id);
	System.out.println("Record deleted successfully...");
	break;
	 }
	 //exit  
	case 5:
	{
		System.out.println("Exit.....");
		System.exit(0);
	}
  }
    	System.out.println("Do you want to continue: y/n");  
		char c=scan.next().charAt(0);
		if(c=='n' || c== 'N'){
			scan.close();
			break;
    	}
    }
	while(true);
        
    }
}
