package com.sdzee.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Bean {

	private Connection connection;

	public List<User> getUsers() {
		List<User> users = new ArrayList<User>();
		Statement statement = null;
		ResultSet result = null;
		//Chargement du driver avec Class.forName
		loadDatabase();

	
		try {
			//connect a la bdd
			
			statement = connection.createStatement();
			
			//Execution de la requete sql
			result = statement.executeQuery("SELECT lastname, firstname FROM names;");
			
			//Recuperation des donnees
			while (result.next()) {
				String lastname = result.getString("lastname");
				String firstname = result.getString("firstname");
				
				User user = new User();
				user.setFirstname(firstname);
				user.setLastname(lastname);
				
				users.add(user);
			}
		}catch (SQLException e) {
		} finally {
					//Fermeture de la connexion
			try {
				if (result != null)
					result.close();
				if (statement !=null)
					statement.close();
				if (connection !=null)
					connection.close();
				} catch (SQLException ignore) {
				}
		}
		return users;
}

 private void loadDatabase() {
	 //Chargement du driver
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 
	 try {
		 connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "");
		 		        } catch (SQLException e) {
		 		            e.printStackTrace(); 
		 		        }
		 		    }
		 		     
	public void addUser(User user) {
		loadDatabase();
		 		       
		try {
		   PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO names(lastname, firstname) VALUES(?, ?);"); 
		   preparedStatement.setString(1, user.getLastname()); 
		   preparedStatement.setString(2, user.getFirstname());
		 	         
		   preparedStatement.executeUpdate();
		   } catch (SQLException e) { 
		        e.printStackTrace();
		   }
	 }
 }
