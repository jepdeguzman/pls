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
		PLS_Dao plsDaoUsername = new PLS_Dao();
		plsBeansToMan.setUsername(username);
		plsLoginUsernameVerify(username);
		//username = plsDao.usernameVerify;
		return username;
		
	}
	
	public static void plsLoginUsernameVerify(String username) {
		PLS_Dao plsDao = new PLS_Dao();
		plsDao.verifyUsernameData(username);
	}
	
	//PASSWORD MANAGEMENT METHODS
	public static String plsLoginPassword() {
		Scanner scanPassword = new Scanner(System.in);
		password = scanPassword.next();
		return password;
	}
	
	public static void plsLoginPasswordVerify(String password) {
		
	}
	
	public void plsFullNames() {
		
	} 

}
