package com.corejava.pointwest.pls.beans;

public class PLS_Beans {

	protected String username;
	protected String password;
	private String firstName;
	private String lastName;
	private int emp_id;
	
	//SETTERS GETTERS : USERNAME
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	//SETTERS GETTERS : PASSWORD
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//SETTERS GETTERS : EMP_ID
	public int setEmpId() {
		return emp_id;
	}
	public void getEmpId(int emp_id) {
		this.emp_id = emp_id;
	}
	
	//SETTERS GETTERS : FIRST NAME
	public String setFirstName() {
		return firstName;
	}
	public void getFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//SETTERS GETTERS : LAST NAME
	public String setLastName() {
		return lastName;
	}
	public void getLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
