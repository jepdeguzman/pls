package com.corejava.pointwest.pls.ui;


import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.corejava.pointwest.pls.beans.PLS_Beans;
import com.corejava.pointwest.pls.dao.PLS_Dao;
import com.corejava.pointwest.pls.manager.PLS_Manager;

public class PLS_ui extends PLS_Beans {

	// LOGIN PAGE UI METHOD
	public void loginPageUI() {
		PLS_Manager plsManLogin = new PLS_Manager();
		PLS_Dao plsDaoLogin = new PLS_Dao();
		System.out.println("----------------------------------------------------------");
		System.out.println("LOGIN");
		System.out.println("----------------------------------------------------------");
		plsManLogin.plsLogin();
	}

	// HOMEPAGE UI METHOD
	public void homePageUI() {
		PLS_Manager plsManHomePageUI = new PLS_Manager();
		PLS_Dao plsDaoHomePageGreetings = new PLS_Dao();
		System.out.println("MENU");
		System.out.println("[1] SEARCH");
		System.out.println("[2] VIEW SEATPLAN");
		System.out.println("[3] LOGOUT");
		System.out.print("CMD: ");
		plsManHomePageUI.plsHomePage_evalChoice();
	}

	// SEARCH PAGE UI
	public void searchPageUI() {
		PLS_Manager plsManSearchPageUI = new PLS_Manager();
		System.out.println("----------------------------------------------------------");
		System.out.println("## SEARCH ##");
		System.out.println("----------------------------------------------------------");
		System.out.println("MENU");
		System.out.println("[1] BY EMPLOYEE ID");
		System.out.println("[2] BY NAME");
		System.out.println("[3] BY PROJECT");
		System.out.print("CMD: ");
		plsManSearchPageUI.plsSearchPage_evalChoice();
	}

	public void searchPage_byEmployeeIDUIDisplay() {
		PLS_Manager plsManByEmpIDUIDisplay = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		System.out.println("## SEARCH - BY EMPLOYEE ID ##");
		plsManByEmpIDUIDisplay.plsSearchPage_byEmpID();
		System.out.println("----------------------------------------------------------");
		System.out.println("EMPLOYEE ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("----------------------------------------------------------");

		List<PLS_Beans> byEmpIDRs = plsManByEmpIDUIDisplay.plsGetNameResults;
		for (PLS_Beans byEmpIDRsOne : byEmpIDRs) {
			
			if(byEmpIDRsOne.getProjectAlias().equalsIgnoreCase("BogusProject")) {
				System.out.println(byEmpIDRsOne.getEmpId() + " | " + byEmpIDRsOne.getFirstName() + " | "
						+ byEmpIDRsOne.getLastName() + " | " + byEmpIDRsOne.getBldg_id() + byEmpIDRsOne.getFloor_number()
						+ "F" + byEmpIDRsOne.getQuadrant() + byEmpIDRsOne.getSeat() + " | LOCAL: " + byEmpIDRsOne.getLocal() + " | "
						+ byEmpIDRsOne.getShift() + " | NO PROJECT");
			}else {
			System.out.println(byEmpIDRsOne.getEmpId() + " | " + byEmpIDRsOne.getFirstName() + " | "
					+ byEmpIDRsOne.getLastName() + " | " + byEmpIDRsOne.getBldg_id() + byEmpIDRsOne.getFloor_number()
					+ "F" + byEmpIDRsOne.getQuadrant() + byEmpIDRsOne.getSeat() + " | LOCAL: " + byEmpIDRsOne.getLocal() + " | "
					+ byEmpIDRsOne.getShift() + " | " + byEmpIDRsOne.getProjectAlias());
			}
		}

		System.out.println("----------END OF RESULT----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		plsManByEmpIDUIDisplay.plsSearchPage_byEmpID_action();
	}

	public void searchPage_byNameUIDisplay() {
		PLS_Manager plsManBynameUIDisplay = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		System.out.println("## SEARCH - BY NAME ##");
		plsManBynameUIDisplay.plsSearchPage_byName();
		System.out.println("----------------------------------------------------------");
		System.out.println("EMPLOYEE ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("----------------------------------------------------------");

		List<PLS_Beans> byNameRs = plsManBynameUIDisplay.plsGetNameResults;
		for (PLS_Beans byNameRsOne : byNameRs) {
			
			if(byNameRsOne.getProjectAlias().equalsIgnoreCase("BogusProject")) {
				System.out.println(byNameRsOne.getEmpId() + " | " + byNameRsOne.getFirstName().toUpperCase() + " | "
						+ byNameRsOne.getLastName().toUpperCase() + " | " + byNameRsOne.getBldg_id()
						+ byNameRsOne.getFloor_number() + "F" + byNameRsOne.getQuadrant() + byNameRsOne.getSeat() + " | LOCAL: "
						+ byNameRsOne.getLocal() + " | " + byNameRsOne.getShift().toUpperCase() + " | NO PROJECT");
			}else {
			System.out.println(byNameRsOne.getEmpId() + " | " + byNameRsOne.getFirstName().toUpperCase() + " | "
					+ byNameRsOne.getLastName().toUpperCase() + " | " + byNameRsOne.getBldg_id()
					+ byNameRsOne.getFloor_number() + "F" + byNameRsOne.getQuadrant() + byNameRsOne.getSeat() + " | LOCAL: "
					+ byNameRsOne.getLocal() + " | " + byNameRsOne.getShift().toUpperCase() + " | "
					+ byNameRsOne.getProjectAlias().toUpperCase());
			}
		}

		System.out.println("----------END OF RESULT----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		plsManBynameUIDisplay.plsSearchPage_byName_action();
	}

	public void searchPage_byProjectAliasDisplay() {
		PLS_Manager plsManByProjectAliasDisplay = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		System.out.println("## SEARCH - BY PROJECT ##");
		plsManByProjectAliasDisplay.plsSearchPage_byProjectAlias();
		System.out.println("----------------------------------------------------------");
		System.out.println("EMPLOYEE ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("----------------------------------------------------------");

		List<PLS_Beans> byProjectAliasRs = plsManByProjectAliasDisplay.plsGetNameResults;
		for (PLS_Beans byProjectAliasRsOne : byProjectAliasRs) {
			
			if(byProjectAliasRsOne.getProjectAlias().equalsIgnoreCase("BogusProject")) {
			System.out.println(byProjectAliasRsOne.getEmpId() + " | " + byProjectAliasRsOne.getFirstName() + " | "
					+ byProjectAliasRsOne.getLastName() + " | " + byProjectAliasRsOne.getBldg_id()
					+ byProjectAliasRsOne.getFloor_number() + "F" + byProjectAliasRsOne.getQuadrant()
					+ byProjectAliasRsOne.getSeat() + " | LOCAL : " + byProjectAliasRsOne.getLocal() + " | "
					+ byProjectAliasRsOne.getShift() + " | NO PROJECT");
			}else {
				System.out.println(byProjectAliasRsOne.getEmpId() + " | " + byProjectAliasRsOne.getFirstName() + " | "
						+ byProjectAliasRsOne.getLastName() + " | " + byProjectAliasRsOne.getBldg_id()
						+ byProjectAliasRsOne.getFloor_number() + "F" + byProjectAliasRsOne.getQuadrant()
						+ byProjectAliasRsOne.getSeat() + " | LOCAL : " + byProjectAliasRsOne.getLocal() + " | "
						+ byProjectAliasRsOne.getShift() + " | " + byProjectAliasRsOne.getProjectAlias());
			}
		}

		System.out.println("----------END OF RESULT----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		plsManByProjectAliasDisplay.plsSearchPage_byProjectAlias_action();
	}

	// SEAT PLAN UI
	public void seatPlanPageUI() {
		PLS_Manager plsManSeatPlanPageUI = new PLS_Manager();
		System.out.println("----------------------------------------------------------");
		System.out.println("## VIEW SEAT PLAN ##");
		System.out.println("----------------------------------------------------------");
		System.out.println("MENU");
		System.out.println("[1] BY LOCATION - FLOOR LEVEL");
		System.out.println("[2] BY QUADRANT");
		System.out.print("CMD: ");
		plsManSeatPlanPageUI.plsSeatPlanPage_evalChoice();
	}

	public void seatPlanPage_byLocationFloorLevelDisplay() {
		PLS_Manager plsManByLocationFloorUIDisplay = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		System.out.println("## LOCATION - FLOOR ##");
		plsManByLocationFloorUIDisplay.plsSeatPlan_byLocationFloor();
		List<PLS_Beans> byLocationFloorRs = plsManByLocationFloorUIDisplay.plsSeatPlanResults;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("## VIEW SEAT PLAN ##");
		System.out.println("LOCATION : "+byLocationFloorRs.get(0).getBldg_id()+"["+byLocationFloorRs.get(0).getBldg_address().toUpperCase()+"] | FLOOR : "+byLocationFloorRs.get(0).getFloor_number()+" ["+byLocationFloorRs.get(0).getBldg_name().toUpperCase()+"]");
		System.out.println("----------------------------------------------------------");
		
		//FOR LOOP FOR DISPLAY : BY LOCATION FLOOR
		for (PLS_Beans byLocationFloorOne : byLocationFloorRs) {
			System.out.println("ROW : " + byLocationFloorOne.getRow_number() + " | COLUMN : "
					+ byLocationFloorOne.getColumn_number() + " | QUADRANT : " + byLocationFloorOne.getQuadrant());
			System.out.println(byLocationFloorOne.getBldg_id() + byLocationFloorOne.getFloor_number() + "F"
					+ byLocationFloorOne.getQuadrant() + byLocationFloorOne.getSeat() + "-"
					+ byLocationFloorOne.getRow_number());
			System.out.println(byLocationFloorOne.getFirstName().toUpperCase() + " "
					+ byLocationFloorOne.getLastName().toUpperCase());
			System.out.println("LOCAL : " + byLocationFloorOne.getLocal());
		}

		System.out.println("----------END OF SEAT PLAN----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		plsManByLocationFloorUIDisplay.plsSeatPlan_byLocationFloor_action();
	}

	public void seatPlanPage_byQuadrantDisplay() {
		PLS_Manager plsManByQuadrantUIDisplay = new PLS_Manager();
		PLS_Dao plsDao = new PLS_Dao();
		System.out.println("## LOCATION - QUADRANT ##");
		plsManByQuadrantUIDisplay.plsSeatPlan_byQuadrant();

		List<PLS_Beans> byQuadrantRs = plsManByQuadrantUIDisplay.plsSeatPlanResults;

		System.out.println("----------------------------------------------------------");
		System.out.println("LOCATION : "+byQuadrantRs.get(0).getBldg_id()+"["+byQuadrantRs.get(0).getBldg_address().toUpperCase()+"] | FLOOR : "+byQuadrantRs.get(0).getFloor_number()+" ["+byQuadrantRs.get(0).getBldg_name().toUpperCase()+"]");
		System.out.println("----------------------------------------------------------");
		
		//FOR LOOP FOR DISPLAY : BY QUADRANT
		for (PLS_Beans byQuadrantsOne : byQuadrantRs) {
			System.out.println();
			System.out.println("ROW : " + byQuadrantsOne.getColumn_number() + " | COLUMN : "
					+ byQuadrantsOne.getRow_number() + " | QUADRANT : " + byQuadrantsOne.getQuadrant());
			System.out.println(byQuadrantsOne.getBldg_id() + byQuadrantsOne.getFloor_number() + "F"
					+ byQuadrantsOne.getQuadrant() + byQuadrantsOne.getSeat() + "-" + byQuadrantsOne.getRow_number());
			System.out.println(
					byQuadrantsOne.getFirstName().toUpperCase() + " " + byQuadrantsOne.getLastName().toUpperCase());
			System.out.println("LOCAL : " + byQuadrantsOne.getLocal());
			System.out.println();
		}
		
		System.out.println("\n----------END OF SEAT PLAN----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		plsManByQuadrantUIDisplay.plsSeatPlan_byQuadrant_action();
	}

	public void wrongInputMessageUI() {
		System.out.println("** UNREGISTERED SEARCH. GOING BACK TO SEARCH PAGE. **");
	}
}
