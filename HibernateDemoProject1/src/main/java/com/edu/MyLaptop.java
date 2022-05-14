package com.edu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hibLaptop")
public class MyLaptop {

@Id
		private int lid;
		private String lname;
		public int getLid() {
			return lid;
		}
		public void setLid(int lid) {
			this.lid = lid;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		@Override
		public String toString() {
			return "MyLaptop [lid=" + lid + ", lname=" + lname + "]";
		}
		

	}


