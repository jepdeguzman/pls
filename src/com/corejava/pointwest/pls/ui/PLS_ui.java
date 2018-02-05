package com.corejava.pointwest.pls.ui;

import java.util.List;

import com.corejava.pointwest.pls.beans.PLS_Beans;
import com.corejava.pointwest.pls.dao.PLS_Dao;
import com.corejava.pointwest.pls.manager.PLS_Manager;

public class PLS_ui extends PLS_Beans {

		// TEST USERNAME LIST VIEW
	public void usernameList() {
		System.out.println("---------------");
		System.out.println("USERNAME/PASSWORD LIST");
		System.out.println("---------------");
		PLS_Manager plsMan = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		List<PLS_Beans> usernames = plsMan.getUsernames();	
		for(PLS_Beans usernamesone : usernames) {
			System.out.println(usernamesone.getUsername()+"/"+usernamesone.getPassword());
		}
			
	}
	
	public void pleaseTryAgain() {
		System.out.println("PLEASE TRY AGAIN!");
		loginPage();
	}
	
	public void fullNameList() {
		System.out.println("---------------");
		System.out.println("FIRSTNAME/LASTNAME LIST");
		System.out.println("---------------");
		PLS_Manager plsMan = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		List<PLS_Beans> fullNames = plsMan.getFullNames();	
		for(PLS_Beans fullNamesone : fullNames) {
			System.out.println(fullNamesone.setFirstName()+"/"+fullNamesone.setLastName());
		}
			
	}

	public void loginPage() {
		PLS_Manager plsManLogin = new PLS_Manager();
		System.out.println("---------------------------------");
		System.out.println("LOGIN");
		System.out.println("---------------------------------");
		System.out.print("Username: ");
		plsManLogin.plsLoginUsername();
		System.out.print("Password: ");
		plsManLogin.plsLoginPassword();
		homePage();
	}
	
	public void homePage() {
		System.out.println("---------------------------------");
		System.out.println("## HOME ##");
		System.out.println("---------------------------------");
		System.out.println("Welcome ");
		
		System.out.println("---------------------------------");
		System.out.println("MENU");
		System.out.println("[1] SEARCH");
		System.out.println("[2] VIEW SEATPLAN");
		System.out.println("[3] LOGOUT");
		System.out.print("CMD: ");
	}
	
	public void searchPage() {
		System.out.println("---------------------------------");
		System.out.println("## SEARCH ##");
		System.out.println("---------------------------------");
		System.out.println("MENU");
		System.out.println("[1] BY EMPLOYEE ID");
		System.out.println("[2] BY NAME");
		System.out.println("[3] BY PROJECT");
		System.out.print("CMD: ");
		
	}
	
	public void searchByEmploye() {
		System.out.println("---------------------------------");
		System.out.println("EMPLOYEE|ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("---------------------------------");
		
	}
	
	
	
	
}
