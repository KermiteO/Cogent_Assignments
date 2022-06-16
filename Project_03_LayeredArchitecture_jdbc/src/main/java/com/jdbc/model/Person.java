package com.jdbc.model;

public class Person {
	private int pid;
	private String pname;
	private String pemail;
	private String pcity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	public Person(int pid, String pname, String pemail, String pcity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.pcity = pcity;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", pcity=" + pcity + "]";
	}
	
	
}
