package com.corejava.pointwest.pls.dao;

import java.beans.Beans;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.corejava.pointwest.pls.beans.PLS_Beans;

public class PLS_Dao extends PLS_Beans{
	public PLS_Beans plsBeans = new PLS_Beans();
	public String usernameVerify = plsBeans.getUsername();
		
		public List<PLS_Beans> getUsernamesData() {
			List<PLS_Beans> plsDbUsers = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
				String user = "newuser";
				String password = "password123";
				String query = "SELECT username,password FROM plsdb.employee";
				
				try {
					Connection conn = DriverManager.getConnection(db,user,password);
					Statement statement = conn.createStatement();
					ResultSet rs = statement.executeQuery(query);
					Statement st = conn.createStatement();
					PreparedStatement ps = conn.prepareStatement(query);
					ResultSet rs1 = ps.executeQuery();
					
					plsDbUsers = new ArrayList<PLS_Beans>();
					
					while(rs.next()) {
						PLS_Beans usernameData = new PLS_Beans();
						usernameData.setUsername(rs.getString("username"));
						usernameData.setPassword(rs.getString("password"));
						plsDbUsers.add(usernameData);
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
	/*				logger.error("Connection Error Encountered.");
					logger.error(e.getMessage());*/
					System.out.println("SQL EXCEPTION");
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("CLASS NOT FOUND EXCEPTION");
				e.printStackTrace();
			/*	logger.error(e.getMessage());*/
			}
			
			return plsDbUsers;
		}
		
		public List<PLS_Beans> getFullNameData() {
			List<PLS_Beans> plsDbFullName = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
				String user = "newuser";
				String password = "password123";
				String query = "SELECT first_name, last_name FROM plsdb.employee";
				
				try {
					Connection conn = DriverManager.getConnection(db,user,password);
					Statement statement = conn.createStatement();
					ResultSet rs = statement.executeQuery(query);
					Statement st = conn.createStatement();
					PreparedStatement ps = conn.prepareStatement(query);
					ResultSet rs1 = ps.executeQuery();
					
					plsDbFullName = new ArrayList<PLS_Beans>();
					
					while(rs.next()) {
						PLS_Beans fullNameData = new PLS_Beans();
						fullNameData.getFirstName(rs.getString("first_name"));
						fullNameData.getLastName(rs.getString("last_name"));
						plsDbFullName.add(fullNameData);
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
	/*				logger.error("Connection Error Encountered.");
					logger.error(e.getMessage());*/
					System.out.println("SQL EXCEPTION");
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("CLASS NOT FOUND EXCEPTION");
				e.printStackTrace();
			/*	logger.error(e.getMessage());*/
			}
			
			return plsDbFullName;
		}

		public void verifyUsernameData(String username) {
			//List<PLS_Beans> plsDbUsers = null;
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				String db = "jdbc:mysql://172.26.83.193:3306/plsdb";
				String user1 = "newuser";
				String password1 = "password123";
				String query = "SELECT username,password FROM plsdb.employee WHERE username=?";
				
				try {
					Connection conn = DriverManager.getConnection(db,user1,password1);
					Statement statement = conn.createStatement();
					ResultSet rs = statement.executeQuery(query);
					Statement st = conn.createStatement();
					PreparedStatement ps = conn.prepareStatement(query);
					ResultSet rs1 = ps.executeQuery();
					// "SELECT * FROM staff where SName=? and SPwd=?"
				//	plsDbUsers = new ArrayList<PLS_Beans>();
					
				if(!rs.next()) {
					JOptionPane.showMessageDialog(null, "WRONG USERNAME");
				}
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
	/*				logger.error("Connection Error Encountered.");
					logger.error(e.getMessage());*/
					System.out.println("SQL EXCEPTION");
					
				}
				
			} catch (ClassNotFoundException e) {
				System.out.println("CLASS NOT FOUND EXCEPTION");
				e.printStackTrace();
			/*	logger.error(e.getMessage());*/
			}
			
			//return plsDbUsers;
		}
	
}
