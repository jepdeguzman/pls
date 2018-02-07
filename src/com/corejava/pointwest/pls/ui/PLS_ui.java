package com.corejava.pointwest.pls.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.corejava.pointwest.pls.beans.PLS_Beans;
import com.corejava.pointwest.pls.dao.PLS_Dao;
import com.corejava.pointwest.pls.manager.PLS_Manager;

public class PLS_ui extends PLS_Beans {

	//LOGIN PAGE UI METHOD
	public void loginPageUI() {
		PLS_Manager plsManLogin = new PLS_Manager();
		PLS_Dao plsDaoLogin = new PLS_Dao();
		System.out.println("----------------------------------------------------------");
		System.out.println("LOGIN");
		System.out.println("----------------------------------------------------------");
		plsManLogin.plsLogin();
	}

	//HOMEPAGE UI METHOD
	public void homePageUI() {
		PLS_Manager plsManHomePageUI = new PLS_Manager();
		PLS_Dao plsDaoHomePageGreetings = new PLS_Dao();
		System.out.println("----------------------------------------------------------");
		System.out.println("## HOME ##");
		System.out.println("----------------------------------------------------------");
		System.out.println("WELCOME!");
		System.out.println("----------------------------------------------------------");
		System.out.println("MENU");
		System.out.println("[1] SEARCH");
		System.out.println("[2] VIEW SEATPLAN");
		System.out.println("[3] LOGOUT");
		System.out.print("CMD: ");
		plsManHomePageUI.plsHomePage_evalChoice();
	}
	
	//SEARCH PAGE UI
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
		System.out.println("EMPLOYEE|ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("----------------------------------------------------------");
		
		List<PLS_Beans> byEmpIDRs = plsManByEmpIDUIDisplay.plsGetNameResults;
		for(PLS_Beans byEmpIDRsOne : byEmpIDRs) {
			System.out.println(byEmpIDRsOne.getEmpId()+"|"+byEmpIDRsOne.getFirstName()+"|"+byEmpIDRsOne.getLastName()+"|"+byEmpIDRsOne.getBldg_id()+byEmpIDRsOne.getFloor_number()+"F"+byEmpIDRsOne.getQuadrant()+byEmpIDRsOne.getSeat()+"|"+byEmpIDRsOne.getLocal()+"|"+byEmpIDRsOne.getShift()+"|"+byEmpIDRsOne.getProjectAlias());
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
		System.out.println("EMPLOYEE|ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("----------------------------------------------------------");
		
		List<PLS_Beans> byNameRs = plsManBynameUIDisplay.plsGetNameResults;
		for(PLS_Beans byNameRsOne : byNameRs) {
			System.out.println(byNameRsOne.getEmpId()+"|"+byNameRsOne.getFirstName()+"|"+byNameRsOne.getLastName()+"|"+byNameRsOne.getBldg_id()+byNameRsOne.getFloor_number()+"F"+byNameRsOne.getQuadrant()+byNameRsOne.getSeat()+"|"+byNameRsOne.getLocal()+"|"+byNameRsOne.getShift()+"|"+byNameRsOne.getProjectAlias());
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
		System.out.println("EMPLOYEE|ID|FIRSTNAME|LASTNAME|SEAT|LOCAL|SHIFT|PROJECT(S)");
		System.out.println("----------------------------------------------------------");
		
		List<PLS_Beans> byProjectAliasRs = plsManByProjectAliasDisplay.plsGetNameResults;
		for(PLS_Beans byProjectAliasRsOne : byProjectAliasRs) {
			System.out.println(byProjectAliasRsOne.getEmpId()+"|"+byProjectAliasRsOne.getFirstName()+"|"+byProjectAliasRsOne.getLastName()+"|"+byProjectAliasRsOne.getBldg_id()+byProjectAliasRsOne.getFloor_number()+"F"+byProjectAliasRsOne.getQuadrant()+byProjectAliasRsOne.getSeat()+"|"+byProjectAliasRsOne.getLocal()+"|"+byProjectAliasRsOne.getShift()+"|"+byProjectAliasRsOne.getProjectAlias());
		}
		
		System.out.println("----------END OF RESULT----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		plsManByProjectAliasDisplay.plsSearchPage_byProjectAlias_action();
	}

	//SEAT PLAN UI
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
		System.out.println("----------------------------------------------------------");
		
		for(PLS_Beans byLocationFloorOne : byLocationFloorRs) {
			System.out.println("ROW :"+byLocationFloorOne.getRow_number()+" | COLUMN :"+byLocationFloorOne.getColumn_number());
			System.out.println(byLocationFloorOne.getBldg_id()+byLocationFloorOne.getFloor_number()+"F"+byLocationFloorOne.getQuadrant()+byLocationFloorOne.getSeat()+"-"+byLocationFloorOne.getRow_number());
			System.out.println(byLocationFloorOne.getFirstName()+" "+byLocationFloorOne.getLastName());
			System.out.println(byLocationFloorOne.getLocal()+"\n");
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

		Map<String, List> byQuadrantRs = plsManByQuadrantUIDisplay.seatPlanView;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("## VIEW SEAT PLAN ##");
		System.out.println("----------------------------------------------------------");

		//OFFICIAL LIST CODE : ADVANCED FOR LOOP
/*		for(PLS_Beans byQuadrantsOne : byQuadrantRs) {
			System.out.println();
			System.out.println("COLUMN: "+byQuadrantsOne.getRow_number_int()+" ROW: "+byQuadrantsOne.getColumn_number_int());
			System.out.println(byQuadrantsOne.getBldg_id()+byQuadrantsOne.getFloor_number()+"F"+byQuadrantsOne.getQuadrant()+byQuadrantsOne.getSeat()+"-"+byQuadrantsOne.getRow_number_int());
			System.out.println(byQuadrantsOne.getFirstName()+" "+byQuadrantsOne.getLastName());
			System.out.println(byQuadrantsOne.getLocal());
			System.out.println();
		}*/

		//ITERATOR LIST CODE
		Iterator<Map.Entry<String, List>> quadrantIterator = byQuadrantRs.entrySet().iterator();
		
		int counter = 0;
		
		
		while(quadrantIterator.hasNext()) {
			Map.Entry<String, List> pair = quadrantIterator.next();
			//enhancedForLoopList(pair.getValue());
			
			//System.out.println(pair.getKey() + "\t" + pair.getValue());
			/*switch(pair.getKey()) {
			case "11":
				enhancedForLoopList(pair.getValue());
				counter=1;
				break;
			case "12":
				if(counter<1) {
				System.out.format("%22s"," ");
				}
				else {
					System.out.format("%20s", " ");
				}
				enhancedForLoopList(pair.getValue());
				counter=1;
				break;
			case "13":
				if(counter<1) {
				System.out.format("%44s", " ");
				}
				else {
					System.out.format("%20s", " ");
				}
				enhancedForLoopList(pair.getValue());
				break;
			case "21":
				System.out.println();
				enhancedForLoopList(pair.getValue());
				counter = 2;
				break;
			case "22":
				if(counter<2) {
					System.out.println();
					System.out.format("%22s", " ");
				}
				else {
				System.out.format("%20s", " ");
				}
				enhancedForLoopList(pair.getValue());
				counter = 2;
				break;
			case "23":
				if(counter<2) {
					System.out.println();
					System.out.format("%44s", "\n");
				}
				else {
				System.out.format("%20s", "\n");
				}
				enhancedForLoopList(pair.getValue());
				counter = 2;
				break;
			case "31":
				if(counter<2) {
					System.out.println("\n");
				}
				counter = 3;
				enhancedForLoopList(pair.getValue());
				break;
			case "32":
				if(counter<3) {
					System.out.println("\n");
					System.out.format("%22s", " ");
				}
				else {
				System.out.format("%20s", " ");
				}
				enhancedForLoopList(pair.getValue());
				counter = 3;
				break;
			case "33":
				if(counter<3) {
					System.out.println("\n");
					System.out.format("%44s", "");
				}
				else {
				System.out.format("%20s", " ");
				}
				enhancedForLoopList(pair.getValue());
				counter=3;
				break;
				default:
					break;
			}*/
			
		}
		System.out.println("\n----------END OF SEAT PLAN----------");
		System.out.println("ACTIONS: [1] SEARCH AGAIN [2] HOME");
		System.out.print("CMD: ");
		//plsManByQuadrantUIDisplay.plsSeatPlan_byLocationFloor_action();
	}
	
/*	public void enhancedForLoopList(List<PLS_Beans> getValue) {
		System.out.println("ENTER"); 
		for(PLS_Beans byQuadrantsOne : getValue) {
			System.out.println("COLUMN: "+byQuadrantsOne.getRow_number()+" ROW: "+byQuadrantsOne.getColumn_number());
			System.out.println(byQuadrantsOne.getBldg_id()+byQuadrantsOne.getFloor_number()+"F"+byQuadrantsOne.getQuadrant()+byQuadrantsOne.getSeat()+"-"+byQuadrantsOne.getRow_number_int());
			System.out.println(byQuadrantsOne.getFirstName()+" "+byQuadrantsOne.getLastName());
			System.out.println(byQuadrantsOne.getLocal());
		}
		System.out.println("EXIT");
	}
	*/
	public void enhancedForLoopList(List<PLS_Beans> getValue, String pair) {
		System.out.println("ENTER"); 
		
		switch(pair) {
		
		}
		
		for(PLS_Beans byQuadrantsOne : getValue) {
			System.out.println("COLUMN: "+byQuadrantsOne.getRow_number()+" ROW: "+byQuadrantsOne.getColumn_number());
			System.out.println(byQuadrantsOne.getBldg_id()+byQuadrantsOne.getFloor_number()+"F"+byQuadrantsOne.getQuadrant()+byQuadrantsOne.getSeat()+"-"+byQuadrantsOne.getRow_number_int());
			System.out.println(byQuadrantsOne.getFirstName()+" "+byQuadrantsOne.getLastName());
			System.out.println(byQuadrantsOne.getLocal());
		}
		System.out.println("EXIT");
	}
	
	
}
