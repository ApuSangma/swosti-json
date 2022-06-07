package com.project.json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Statement;

public class MySQLData {
	
	 public static void main(String[] args) {
		

		String jdbcURL = "jdbc:mysql://localhost:3306/borrowerinfo";
		String dbusername = "root";
		String dbpassword = "password";
		
		
		try {

			Connection connection = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
			
//			String sql = "INSERT INTO users (username, email, fullname, password)" + 
//			" Values ('Apu', 'apu@gmail.com', 'Apu Sangma', 'secret')";
//			
			
//			String sql = "INSERT INTO users (username, email, fullname, password)" + 
//					" Values (?, ?, ?, ?)";
//					
			
			String sql = "INSERT INTO borrowerinfo (id, s, m, n, i, c, nid, groupNO, l, branchOid )" +
					" Values (?, ?, ?, ? , ? , ? , ?, ?, ?, ?)"; 
			
			
			
			// Statement statement = connection.createStatement();
			
			//Create 
			
//			PreparedStatement statement = connection.prepareStatement(sql);
//			
//			statement.setString(1, username);
//			statement.setString(2, email);
//			statement.setString(3, fullname);
//			statement.setString(4, password);
//			 
//			int rows = statement.executeUpdate();
//			
//			if(rows > 0) {
//				System.out.println("A new user has been inserted");
//			}
//			
			
			// Read 
			
//			String sql = "SELECT * FROM users";
//			
//			Statement statement = connection.createStatement();
//			
//			ResultSet result = statement.executeQuery(sql);
//			
//			while(result.next()) {
//				
//				int userId = result.getInt("user_id");
//				
//				String username = result.getString("username");
//				String fullname = result.getString("fullname");
//				String email = result.getString("email");
//				String password = result.getString("password");
//				
//				System.out.println(userId + ":" +  username + "," +
//				fullname + ", " + email + ", " + password);
//				
//			}
			
			
			// Update
			
			//String sql = "Update users SET password='okay' WHERE username = 'Apu'";
			//Statement statement = connection.createStatement();
			
			
//			String sql = "UPDATE users SET password=?, fullname=?, email=? WHERE username=?";
//			
//			PreparedStatement statement = connection.prepareStatement(sql);
//			
//			statement.setString(1, password);
//			statement.setString(2, fullname);
//			statement.setString(3, email);
//			statement.setString(4, username);
//			
//			
//			
//			  int rows = statement.executeUpdate();
//			  
//			//int rows = statement.executeUpdate(sql);
//			
//			
//			if (rows > 0 ) {
//				
//				System.out.println("The user's information has been updated");
//				 
//			}
			
			
			// Delete
			
			String sql = "DELETE FROM users WHERE username=?";
			
			 
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
//			statement.setString(1, password);
//			statement.setString(2, fullname);
//			statement.setString(3, email);
			statement.setString(1, username);
			
			 int rows = statement.executeUpdate();
//			  
//			//int rows = statement.executeUpdate(sql);
//			
//			
			if (rows > 0 ) {
				
				System.out.println("The user's information has been deleted");
				 
			}
			
			
			
			//connection checking
			
//			if (connection != null) {
//				System.out.println("Connected to database");

				connection.close();
			//}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
