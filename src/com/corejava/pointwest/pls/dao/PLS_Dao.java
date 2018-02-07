package com.corejava.pointwest.pls.dao;

import java.beans.Beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

import com.corejava.pointwest.pls.beans.PLS_Beans;
import com.corejava.pointwest.pls.ui.PLS_ui;

public class PLS_Dao extends PLS_Beans{
	
	public PLS_Beans plsBeans = new PLS_Beans();
	public String usernameVerify = plsBeans.getUsername();	
	public List<PLS_Beans> plsFullNameList;
	public List<PLS_Beans> plsSeatPlanList;
	public Map<String, List> plsSeatPlanMap;
	public List<PLS_Beans> plsSeatMapQuadrant;
	public List<PLS_Beans> plsSeatMapRow;
	public List<PLS_Beans> plsSeatMapColumn;
	public String firstNameGreet;
	public String lastNameGreet;
	public String roleGreet;
	
	
		//TRY
	
	
		//VERIFYING CREDENTIALS
		public static void verifyCredentials(String username, String password) {			
			PLS_ui plsUi = new PLS_ui();
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
				String dbUser = "newuser";
				String dbPass = "password123";
				String query = "SELECT username,password FROM plsdb.employee WHERE username='"+username+"' AND password='"+password+"'";
				
				Connection verifyCredsConn = DriverManager.getConnection(db,dbUser,dbPass);
				Statement verifyCredsPrepdSt = verifyCredsConn.createStatement();
				ResultSet verifyCredsRs = verifyCredsPrepdSt.executeQuery(query);
				
				int counter = 0;
				while(verifyCredsRs.next()) {
						counter = counter+1;
				}
				if(counter == 1) {
						plsUi.homePageUI();
						}else {
							plsUi.loginPageUI();
						}
			}
			catch (Exception exc) {
				System.out.println("EXCEPTION EXC");
			}
		}

// -------------------------------------------------- SEARCH BY DAO --------------------------------------------------
		//SEARCH BY NAME
		public List<PLS_Beans> searchByNameDao(String firstName, String lastName) {
			
				try {
				Class.forName("com.mysql.jdbc.Driver");
				String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
				String dbUser = "newuser";
				String dbPass = "password123";
				String query = "SELECT employee.emp_id, employee.first_name, employee.last_name, employee_seat.bldg_id, seat.floor_number , seat.quadrant, employee_seat.seat_id, seat.local_number, employee.shift, employee_project.proj_alias FROM plsdb.employee JOIN plsdb.employee_seat ON employee_seat.emp_id = employee.emp_id JOIN plsdb.seat ON seat.seat_id = employee_seat.seat_id JOIN plsdb.employee_project ON employee_project.employee_id like employee_seat.emp_id WHERE employee.first_name= '"+firstName+"' AND employee.last_name = '"+lastName+"'";
				
				
				Connection verifyFullNameConn = DriverManager.getConnection(db,dbUser,dbPass);
				Statement verifyFullNamePrepdSt = verifyFullNameConn.createStatement();
				ResultSet verifyFullNameRs = verifyFullNamePrepdSt.executeQuery(query);
				plsFullNameList = new ArrayList<PLS_Beans>();
				
				while(verifyFullNameRs.next()) {
					PLS_Beans plsBeansFullNameVerify = new PLS_Beans();
					plsBeansFullNameVerify.setEmpId(verifyFullNameRs.getString("emp_id"));
					plsBeansFullNameVerify.setFirstName(verifyFullNameRs.getString("first_name"));
					plsBeansFullNameVerify.setLastName(verifyFullNameRs.getString("last_name"));
					plsBeansFullNameVerify.setBldg_id(verifyFullNameRs.getString("bldg_id"));
					plsBeansFullNameVerify.setFloor_number(verifyFullNameRs.getString("floor_number"));
					plsBeansFullNameVerify.setQuadrant(verifyFullNameRs.getString("quadrant"));
					plsBeansFullNameVerify.setSeat(verifyFullNameRs.getString("seat_id"));
					plsBeansFullNameVerify.setLocal(verifyFullNameRs.getString("local_number"));
					plsBeansFullNameVerify.setShift(verifyFullNameRs.getString("shift"));
					plsBeansFullNameVerify.setProjectAlias(verifyFullNameRs.getString("proj_alias"));
					plsFullNameList.add(plsBeansFullNameVerify);
				}
				}
			catch (Exception exc) {
			}
			
			return plsFullNameList;
		}
		
		public List<PLS_Beans> searchByNameDao(){
			return plsFullNameList;
		}
		
		//SEARCH BY EMP ID
		public List<PLS_Beans> searchByEmpIDDao(String emp_id) {
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
			String dbUser = "newuser";
			String dbPass = "password123";
			String query = "SELECT employee.emp_id, employee.first_name, employee.last_name, employee_seat.bldg_id, seat.floor_number , seat.quadrant, employee_seat.seat_id, seat.local_number, employee.shift, employee_project.proj_alias FROM plsdb.employee JOIN plsdb.employee_seat ON employee_seat.emp_id = employee.emp_id JOIN plsdb.seat ON seat.seat_id = employee_seat.seat_id JOIN plsdb.employee_project ON employee_project.employee_id like employee_seat.emp_id WHERE employee.emp_id='"+emp_id+"'";
			
			
			Connection verifyEmpIDConn = DriverManager.getConnection(db,dbUser,dbPass);
			Statement verifyEmpIDSt = verifyEmpIDConn.createStatement();
			ResultSet verifyEmpIDRs = verifyEmpIDSt.executeQuery(query);
			plsFullNameList = new ArrayList<PLS_Beans>();
			
			while(verifyEmpIDRs.next()) {
				PLS_Beans plsBeansEmpIDVerify = new PLS_Beans();
				plsBeansEmpIDVerify.setEmpId(verifyEmpIDRs.getString("emp_id"));
				plsBeansEmpIDVerify.setFirstName(verifyEmpIDRs.getString("first_name"));
				plsBeansEmpIDVerify.setLastName(verifyEmpIDRs.getString("last_name"));
				plsBeansEmpIDVerify.setBldg_id(verifyEmpIDRs.getString("bldg_id"));
				plsBeansEmpIDVerify.setFloor_number(verifyEmpIDRs.getString("floor_number"));
				plsBeansEmpIDVerify.setQuadrant(verifyEmpIDRs.getString("quadrant"));
				plsBeansEmpIDVerify.setSeat(verifyEmpIDRs.getString("seat_id"));
				plsBeansEmpIDVerify.setLocal(verifyEmpIDRs.getString("local_number"));
				plsBeansEmpIDVerify.setShift(verifyEmpIDRs.getString("shift"));
				plsBeansEmpIDVerify.setProjectAlias(verifyEmpIDRs.getString("proj_alias"));
				plsFullNameList.add(plsBeansEmpIDVerify);
			}
			}
		catch (Exception exc) {
		}
		return plsFullNameList;
	}
		
		public List<PLS_Beans> searchByEmpIDDao(){
			return plsFullNameList;
		}

		//SEARCH BY PROJECT ALIAS
		public List<PLS_Beans> searchByProjectAliasDao(String projectAlias) {
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
			String dbUser = "newuser";
			String dbPass = "password123";
			String query = "SELECT employee.emp_id, employee.first_name, employee.last_name, employee_seat.bldg_id, seat.floor_number , seat.quadrant, employee_seat.seat_id, seat.local_number, employee.shift, employee_project.proj_alias FROM plsdb.employee JOIN plsdb.employee_seat ON employee_seat.emp_id = employee.emp_id JOIN plsdb.seat ON seat.seat_id = employee_seat.seat_id JOIN plsdb.employee_project ON employee_project.employee_id like employee_seat.emp_id WHERE employee_project.proj_alias= '"+projectAlias+"'";
			
			
			Connection verifyByProjectAliasConn = DriverManager.getConnection(db,dbUser,dbPass);
			Statement verifyByProjectAliasSt = verifyByProjectAliasConn.createStatement();
			ResultSet verifyByProjectAliasRs = verifyByProjectAliasSt.executeQuery(query);
			plsFullNameList = new ArrayList<PLS_Beans>();
			
			while(verifyByProjectAliasRs.next()) {
				PLS_Beans plsBeansProjectAliasVerify = new PLS_Beans();
				plsBeansProjectAliasVerify.setEmpId(verifyByProjectAliasRs.getString("emp_id"));
				plsBeansProjectAliasVerify.setFirstName(verifyByProjectAliasRs.getString("first_name"));
				plsBeansProjectAliasVerify.setLastName(verifyByProjectAliasRs.getString("last_name"));
				plsBeansProjectAliasVerify.setBldg_id(verifyByProjectAliasRs.getString("bldg_id"));
				plsBeansProjectAliasVerify.setFloor_number(verifyByProjectAliasRs.getString("floor_number"));
				plsBeansProjectAliasVerify.setQuadrant(verifyByProjectAliasRs.getString("quadrant"));
				plsBeansProjectAliasVerify.setSeat(verifyByProjectAliasRs.getString("seat_id"));
				plsBeansProjectAliasVerify.setLocal(verifyByProjectAliasRs.getString("local_number"));
				plsBeansProjectAliasVerify.setShift(verifyByProjectAliasRs.getString("shift"));
				plsBeansProjectAliasVerify.setProjectAlias(verifyByProjectAliasRs.getString("proj_alias"));
				plsFullNameList.add(plsBeansProjectAliasVerify);
			}
			}
		catch (Exception exc) {
		}
		return plsFullNameList;
	}
		
		public List<PLS_Beans> searchByProjectAliasDao(){
			return plsFullNameList;
		}

// -------------------------------------------------- SEAT PLAN DAO --------------------------------------------------
		// SEAT PLAN BY LOCATION FLOOR
		public List<PLS_Beans> seatPlanLocationFloorDao(String bldg_id, String floor_number) {
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
			String dbUser = "newuser";
			String dbPass = "password123";
			String query = "SELECT employee.first_name, employee.last_name, employee_seat.bldg_id, seat.floor_number, seat.quadrant, seat.seat_id, seat.row_number, seat.column_number, seat.local_number, location.bldg_name, location.bldg_address FROM plsdb.employee JOIN plsdb.employee_seat ON employee_seat.emp_id = employee.emp_id JOIN plsdb.seat ON seat.seat_id = employee_seat.seat_id JOIN plsdb.employee_project ON employee_project.employee_id like employee_seat.emp_id JOIN plsdb.location ON location.bldg_id = employee_seat.bldg_id WHERE employee_seat.bldg_id='"+bldg_id+"' AND seat.floor_number='"+floor_number+"' ORDER BY seat.row_number,seat.column_number";
			
			
			Connection verifyLocationFloorConn = DriverManager.getConnection(db,dbUser,dbPass);
			Statement verifyLocationFloorSt = verifyLocationFloorConn.createStatement();
			ResultSet verifyLocationFloorRs = verifyLocationFloorSt.executeQuery(query);
			plsSeatPlanMap = new LinkedHashMap<String, List>();
			plsSeatPlanList = new ArrayList<PLS_Beans>();
			
			while(verifyLocationFloorRs.next()) {
				PLS_Beans plsBeansLocationFloorVerify = new PLS_Beans();
				plsBeansLocationFloorVerify.setFirstName(verifyLocationFloorRs.getString("first_name"));
				plsBeansLocationFloorVerify.setLastName(verifyLocationFloorRs.getString("last_name"));
				plsBeansLocationFloorVerify.setBldg_id(verifyLocationFloorRs.getString("bldg_id"));
				plsBeansLocationFloorVerify.setFloor_number(verifyLocationFloorRs.getString("floor_number"));
				plsBeansLocationFloorVerify.setQuadrant(verifyLocationFloorRs.getString("quadrant"));
				plsBeansLocationFloorVerify.setSeat(verifyLocationFloorRs.getString("seat_id"));
				plsBeansLocationFloorVerify.setRow_number(verifyLocationFloorRs.getString("row_number"));
				plsBeansLocationFloorVerify.setColumn_number(verifyLocationFloorRs.getString("column_number"));
				plsBeansLocationFloorVerify.setLocal(verifyLocationFloorRs.getString("local_number"));
				plsBeansLocationFloorVerify.setBldg_name(verifyLocationFloorRs.getString("bldg_name"));
				plsBeansLocationFloorVerify.setBldg_address(verifyLocationFloorRs.getString("bldg_address"));
				plsSeatPlanList.add(plsBeansLocationFloorVerify);
			}
			}
		catch (Exception exc) {
		}
		return plsSeatPlanList;
	}
		
		// SEAT PLAN BY LOCATION QUADRANT
		public Map<String, List> seatPlanQuadrantDao(String quadrant, String bldg_id, String floor_number) {
			
			try {
			Class.forName("com.mysql.jdbc.Driver");
			String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
			String dbUser = "newuser";
			String dbPass = "password123";
			String query = "SELECT employee.first_name, employee.last_name, employee_seat.bldg_id, seat.floor_number, seat.quadrant, seat.seat_id, seat.row_number, seat.column_number, seat.local_number, location.bldg_name, location.bldg_address FROM plsdb.employee JOIN plsdb.employee_seat ON employee_seat.emp_id = employee.emp_id JOIN plsdb.seat ON seat.seat_id = employee_seat.seat_id JOIN plsdb.employee_project ON employee_project.employee_id like employee_seat.emp_id JOIN plsdb.location ON location.bldg_id = employee_seat.bldg_id WHERE seat.quadrant='"+quadrant+"' AND seat.bldg_id='"+bldg_id+"' AND seat.floor_number='"+floor_number+"' ORDER BY seat.row_number,seat.column_number";
			
			System.out.println("QUERY USED: "+query);
			Connection verifyQuadrantConn = DriverManager.getConnection(db,dbUser,dbPass);
			Statement verifyQuadrantSt = verifyQuadrantConn.createStatement();
			ResultSet verifyQuadrantRs = verifyQuadrantSt.executeQuery(query);
			plsSeatPlanMap = new LinkedHashMap<String, List>();
			plsSeatPlanList = new ArrayList<PLS_Beans>();
			
			//System.out.println(verifyQuadrantRs);

			while(verifyQuadrantRs.next()) {
				PLS_Beans plsBeansQuadrantVerify = new PLS_Beans();
/*				plsBeansQuadrantVerify.setRow_number_int(verifyQuadrantRs.getInt("row_number"));
				plsBeansQuadrantVerify.setColumn_number_int(verifyQuadrantRs.getInt("column_number"));*/
				plsBeansQuadrantVerify.setRow_number(verifyQuadrantRs.getString("row_number"));
				plsBeansQuadrantVerify.setColumn_number(verifyQuadrantRs.getString("column_number"));
				plsBeansQuadrantVerify.setFirstName(verifyQuadrantRs.getString("first_name"));
				plsBeansQuadrantVerify.setLastName(verifyQuadrantRs.getString("last_name"));
				plsBeansQuadrantVerify.setBldg_id(verifyQuadrantRs.getString("bldg_id"));
				plsBeansQuadrantVerify.setFloor_number(verifyQuadrantRs.getString("floor_number"));
				plsBeansQuadrantVerify.setQuadrant(verifyQuadrantRs.getString("quadrant"));
				plsBeansQuadrantVerify.setSeat(verifyQuadrantRs.getString("seat_id"));
				plsBeansQuadrantVerify.setLocal(verifyQuadrantRs.getString("local_number"));
				plsBeansQuadrantVerify.setBldg_name(verifyQuadrantRs.getString("bldg_name"));
				plsBeansQuadrantVerify.setBldg_address(verifyQuadrantRs.getString("bldg_address"));
				plsSeatPlanList.add(plsBeansQuadrantVerify);
				plsSeatPlanMap.put(plsBeansQuadrantVerify.getRow_number()+plsBeansQuadrantVerify.getColumn_number(), plsSeatPlanList);
			}
			}
		catch (Exception exc) {
		}
		
		return plsSeatPlanMap;
	}
}
