package com.nt.dto;

public class UsersDTO {
	private String uname;
	private String pwd;
	
	//setters&getters
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//toString()
	@Override
	public String toString() {
		return "UsersDTO [uname=" + uname + ", pwd=" + pwd + "]";
	}

}
