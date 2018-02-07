package com.corejava.pointwest.pls.beans;

public class PLS_Beans {

	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String emp_id;
	private String bldg_id;
	private String floor_number;
	private String quadrant;
	private String seat;
	private String local;
	private String shift;
	private String projectAlias;
	private String role;
	private String column_number;
	private String row_number;
	private String bldg_name;
	private String bldg_address;
	private int row_number_int;
	private int column_number_int;
	private int seat_int;
	
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
	public String getEmpId() {
		return emp_id;
	}
	public void setEmpId(String empid) {
		emp_id = empid;
	}
	
	//SETTERS GETTERS : FIRST NAME
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	//SETTERS GETTERS : LAST NAME
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	//SETTERS : SEATS
	public String getBldg_id() {
		return bldg_id;
	}
	public void setBldg_id(String bldg_id) {
		this.bldg_id = bldg_id;
	}
	public String getFloor_number() {
		return floor_number;
	}
	public void setFloor_number(String floor_number) {
		this.floor_number = floor_number;
	}
	public String getQuadrant() {
		return quadrant;
	}
	public void setQuadrant(String quadrant) {
		this.quadrant = quadrant;
	}
	
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public String getSeat() {
		return seat;
	}
	
	//SETTERS GETTERS : LOCAL
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	//SETTERS GETTERS : SHIFT
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	
	//SETTERS GETTERS : PROJECT ALIAS
	public String getProjectAlias() {
		return projectAlias;
	}
	public void setProjectAlias(String projectAlias) {
		this.projectAlias = projectAlias;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	// SETTERS GETTERS : COLUMN ROW
	public String getColumn_number() {
		return column_number;
	}
	public void setColumn_number(String column_number) {
		this.column_number = column_number;
	}
	public String getRow_number() {
		return row_number;
	}
	public void setRow_number(String row_number) {
		this.row_number = row_number;
	}
	
	//SETTERS GETTERS : BUILDING NAME
	public String getBldg_name() {
		return bldg_name;
	}
	public void setBldg_name(String bldg_name) {
		this.bldg_name = bldg_name;
	}
	
	//SETTERS GETTERS : BUILDING ADDRESS
	public String getBldg_address() {
		return bldg_address;
	}
	public void setBldg_address(String bldg_address) {
		this.bldg_address = bldg_address;
	}
	
	// SETTERS GETTERS : COLUMN ROW INT
	public int getRow_number_int() {
		return row_number_int;
	}
	public void setRow_number_int(int row_number_int) {
		this.row_number_int = row_number_int;
	}
	public int getColumn_number_int() {
		return column_number_int;
	}
	public void setColumn_number_int(int column_number_int) {
		this.column_number_int = column_number_int;
	}


	
}
