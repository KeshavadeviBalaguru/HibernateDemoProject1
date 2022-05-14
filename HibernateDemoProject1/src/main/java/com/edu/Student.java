package com.edu;


	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

	@Entity  //create table Student
	@Table(name="hibStudent")
	public class Student {
		@Id   //primary key
	private int rollnum;
	private String sname;
	private int mark;
	@OneToOne
	MyLaptop lid;
	//generate setter and getter method 
		//generate toString
		
	
	public int getRollnum() {
		return rollnum;
	}
	
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
	public MyLaptop getLid() {
		return lid;
	}

	public void setLid(MyLaptop lid) {
		this.lid = lid;
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", sname=" + sname + ", mark=" + mark + ", lid=" + lid + "]";
	}

	
	

	}


