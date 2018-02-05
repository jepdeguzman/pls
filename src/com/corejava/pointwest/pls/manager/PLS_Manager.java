package com.corejava.pointwest.pls.manager;

import java.util.List;
import java.util.Scanner;

import com.corejava.pointwest.pls.beans.PLS_Beans;
import com.corejava.pointwest.pls.dao.PLS_Dao;
import com.corejava.pointwest.pls.ui.PLS_ui;


public class PLS_Manager extends PLS_Beans {
	
	public static String username;
	public static String password;
	public static PLS_Beans plsBeansToMan =  new PLS_Beans();
	public PLS_Dao plsDao = new PLS_Dao();
	public static PLS_ui plsUiToMan = new PLS_ui(); 
	public List<PLS_Beans> usernameList = plsDao.getUsernamesData();
	public List<PLS_Beans> fullNameList = plsDao.getFullNameData();
	//public Map<>
	
	//TEST : USERNAME LIST
	public List<PLS_Beans> getUsernames(){
		return usernameList;
	}
	
	public List<PLS_Beans> getFullNames(){
		return fullNameList;
	}
	
	//USERNAME MANAGEMENT METHODS
	public String plsLoginUsername() {
		Scanner scanUsername = new Scanner(System.in);
		username = scanUsername.next();
		plsBeansToMan.setUsername(username);
		return username;
	}
	
	public String plsLoginPassword() {
		Scanner scanPassword = new Scanner(System.in);
		password = scanPassword.next();
		plsBeansToMan.setPassword(password);
		return password;
	}
}
