package com.corejava.pointwest.pls.manager;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import com.corejava.pointwest.pls.beans.PLS_Beans;
import com.corejava.pointwest.pls.dao.PLS_Dao;
import com.corejava.pointwest.pls.ui.PLS_ui;

public class PLS_Manager extends PLS_Beans {
	public static PLS_Beans plsBeansToMan = new PLS_Beans();
	public PLS_Dao plsDao = new PLS_Dao();
	public static PLS_ui plsUiToMan = new PLS_ui();
	public List<PLS_Beans> plsGetNameResults;
	public List<PLS_Beans> plsSeatPlanResults;

	// LOGIN MANAGEMENT METHODS
	public void plsLogin() {
		PLS_Dao plsDaoLogin = new PLS_Dao();
		System.out.print("USERNAME: ");
		Scanner scanUsername = new Scanner(System.in);
		setUsername(scanUsername.next());

		System.out.print("PASSWORD: ");
		Console console = System.console();
		Scanner scanPassword = new Scanner(System.in);
		setPassword(scanPassword.next());

		plsDaoLogin.verifyCredentials(getUsername(), getPassword());
	}

	// EVALUATING MENU CHOICES
	public void plsHomePage_evalChoice() {
		PLS_ui plsHomePageUiMan = new PLS_ui();
		Scanner scanHomePageMenuChoice = new Scanner(System.in);
		int homePageMenuChoice = scanHomePageMenuChoice.nextInt();
		switch (homePageMenuChoice) {
		case 1:
			plsHomePageUiMan.searchPageUI();
			break;
		case 2:
			plsHomePageUiMan.seatPlanPageUI();
			break;
		case 3:
			System.out.println("PROGRAM HAS ENDED. HAVE A NICE DAY!");
			plsHomePageUiMan.loginPageUI();
			plsLogin();
			break;
		default:
			plsHomePageUiMan.wrongInputMessageUI();
			plsHomePageUiMan.loginPageUI();
			plsLogin();
		}
	}

	public void plsSearchPage_evalChoice() {
		PLS_ui plsSearchPageUiMan = new PLS_ui();
		Scanner scanSearchPageMenuChoice = new Scanner(System.in);
		int searchPageMenuChoice = scanSearchPageMenuChoice.nextInt();
		switch (searchPageMenuChoice) {
		case 1:
			plsSearchPageUiMan.searchPage_byEmployeeIDUIDisplay();
			break;
		case 2:
			plsSearchPageUiMan.searchPage_byNameUIDisplay();
			break;
		case 3:
			plsSearchPageUiMan.searchPage_byProjectAliasDisplay();
			break;
		default:
			plsSearchPageUiMan.wrongInputMessageUI();
			plsSearchPageUiMan.searchPageUI();
			break;
		}
	}

	public void plsSeatPlanPage_evalChoice() {
		PLS_ui plsSeatPlanPageUiMan = new PLS_ui();
		Scanner scanSeatPlanMenuChoice = new Scanner(System.in);
		int seatPlanMenuChoice = scanSeatPlanMenuChoice.nextInt();
		switch (seatPlanMenuChoice) {
		case 1:
			plsSeatPlanPageUiMan.seatPlanPage_byLocationFloorLevelDisplay();
			break;
		case 2:
			plsSeatPlanPageUiMan.seatPlanPage_byQuadrantDisplay();
			break;
		default:
			plsSeatPlanPageUiMan.wrongInputMessageUI();
			plsSeatPlanPageUiMan.searchPageUI();
			break;
		}

	}

	// DISPLAY MANAGEMENT METHODS : SEARCH PAGE
	public List<PLS_Beans> plsSearchPage_byName() {
		PLS_Dao plsSearchByNameDao = new PLS_Dao();

		System.out.print("ENTER FIRST NAME: ");
		Scanner scanFirstName = new Scanner(System.in);
		setFirstName(scanFirstName.nextLine());

		System.out.print("ENTER LAST NAME: ");
		Scanner scanLastName = new Scanner(System.in);
		setLastName(scanLastName.nextLine());

		plsGetNameResults = plsSearchByNameDao.searchByNameDao(getFirstName(), getLastName());

		return plsGetNameResults;
	}

	public List<PLS_Beans> plsSearchPage_byEmpID() {
		PLS_Dao plsSearchByNameDao = new PLS_Dao();

		System.out.print("ENTER EMPLOYEE ID#: ");
		Scanner scanEmpID = new Scanner(System.in);
		String scannedempID = scanEmpID.nextLine();
		setEmpId(scannedempID);

		plsGetNameResults = plsSearchByNameDao.searchByEmpIDDao(getEmpId());

		return plsGetNameResults;
	}

	public List<PLS_Beans> plsSearchPage_byProjectAlias() {
		PLS_Dao plsSearchByProjectAliasDao = new PLS_Dao();

		System.out.print("ENTER PROJECT ALIAS: ");
		Scanner scanProjectAliasID = new Scanner(System.in);
		String scannedProjectAlias = scanProjectAliasID.nextLine();
		setProjectAlias(scannedProjectAlias);

		plsGetNameResults = plsSearchByProjectAliasDao.searchByProjectAliasDao(getProjectAlias());

		return plsGetNameResults;
	}

	// DISPLAY MANAGEMENT METHODS : SEAT PLAN
	public List<PLS_Beans> plsSeatPlan_byLocationFloor() {
		PLS_Dao plsSearchByProjectAliasDao = new PLS_Dao();

		System.out.print("ENTER LOCATION CODE [PIC/PTC/PLC]: ");
		Scanner scanLocation = new Scanner(System.in);
		String scannedLocation = scanLocation.nextLine();
		setBldg_id(scannedLocation);

		System.out.print("ENTER FLOOR [PIC: 2/3 | PTC 12 | PLC 2/9]: ");
		Scanner scanFloor = new Scanner(System.in);
		String scannedFloor = scanFloor.nextLine();
		setFloor_number(scannedFloor);

		plsSeatPlanResults = plsSearchByProjectAliasDao.seatPlanLocationFloorDao(getBldg_id(), getFloor_number());

		return plsSeatPlanResults;
	}

	public List<PLS_Beans> plsSeatPlan_byQuadrant() {
		PLS_Dao plsSeatPlanByQuadrantDao = new PLS_Dao();

		System.out.print("ENTER LOCATION CODE [PIC/PTC/PLC]: ");
		Scanner scanLocation = new Scanner(System.in);
		String scannedLocation = scanLocation.nextLine();
		setBldg_id(scannedLocation);

		System.out.print("ENTER FLOOR [PIC: 2/3 | PTC 12 | PLC 2/9]: ");
		Scanner scanFloor = new Scanner(System.in);
		String scannedFloor = scanFloor.nextLine();
		setFloor_number(scannedFloor);

		System.out.print("ENTER QUADRANT [A/B/C/D]: ");
		Scanner scanQuadrant = new Scanner(System.in);
		String scannedQuadrant = scanQuadrant.nextLine();
		setQuadrant(scannedQuadrant);

		plsSeatPlanResults = plsSeatPlanByQuadrantDao.seatPlanQuadrantDao(getQuadrant(), getBldg_id(),
				getFloor_number());

		return plsSeatPlanResults;
	}

	// ACTION CHOICES
	public void plsSearchPage_byName_action() {
		Scanner scanActionChoice = new Scanner(System.in);
		int actionChoice = scanActionChoice.nextInt();
		PLS_ui plsUi = new PLS_ui();
		switch (actionChoice) {
		case 1: // SEARCH AGAIN
			plsUi.searchPage_byNameUIDisplay();
			break;
		case 2: // RETURN TO HOME
			plsUi.homePageUI();
			break;
		default:
			plsUi.wrongInputMessageUI();
			plsUi.searchPageUI();
			break;
		}
	}

	public void plsSearchPage_byEmpID_action() {
		Scanner scanActionChoice = new Scanner(System.in);
		int actionChoice = scanActionChoice.nextInt();
		PLS_ui plsUi = new PLS_ui();
		switch (actionChoice) {
		case 1: // SEARCH AGAIN
			plsUi.searchPage_byEmployeeIDUIDisplay();
			break;
		case 2: // RETURN TO HOME
			plsUi.homePageUI();
			break;
		default:
			plsUi.wrongInputMessageUI();
			plsUi.searchPageUI();
			break;
		}
	}

	public void plsSearchPage_byProjectAlias_action() {
		Scanner scanActionChoice = new Scanner(System.in);
		int actionChoice = scanActionChoice.nextInt();
		PLS_ui plsUi = new PLS_ui();
		switch (actionChoice) {
		case 1: // SEARCH AGAIN
			plsUi.searchPage_byProjectAliasDisplay();
			break;
		case 2: // RETURN TO HOME
			plsUi.homePageUI();
			break;
		default:
			plsUi.wrongInputMessageUI();
			plsUi.searchPageUI();
			break;
		}
	}

	public void plsSeatPlan_byLocationFloor_action() {
		Scanner scanActionChoice = new Scanner(System.in);
		int actionChoice = scanActionChoice.nextInt();
		PLS_ui plsUi = new PLS_ui();
		switch (actionChoice) {
		case 1: // SEARCH AGAIN
			plsUi.seatPlanPage_byLocationFloorLevelDisplay();
			break;
		case 2: // RETURN TO HOME
			plsUi.homePageUI();
			break;
		default:
			plsUi.homePageUI();
			plsUi.seatPlanPageUI();
			break;
		}
	}

	public void plsSeatPlan_byQuadrant_action() {
		Scanner scanActionChoice = new Scanner(System.in);
		int actionChoice = scanActionChoice.nextInt();
		PLS_ui plsUi = new PLS_ui();
		switch (actionChoice) {
		case 1: // SEARCH AGAIN
			plsUi.seatPlanPage_byQuadrantDisplay();
			break;
		case 2: // RETURN TO HOME
			plsUi.homePageUI();
			break;
		default:
			plsUi.homePageUI();
			plsUi.seatPlanPageUI();
			break;
		}
	}
}
// END OF MANAGER