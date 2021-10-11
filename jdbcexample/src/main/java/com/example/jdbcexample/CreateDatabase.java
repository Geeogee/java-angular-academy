package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	private static String username = "root";
	private static String password = "root";
	private static String DBPath = "jdbc:mysql://localhost:3306/";
	private static Connection demoDBConnection;
	private static Statement statement;
	
	public static void createNewDatabase(String DBName) {
		try {
			Connection mysqlConnection = DriverManager.getConnection(DBPath, username, password);
			statement = mysqlConnection.createStatement();
			
			statement.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DBName);
			demoDBConnection = DriverManager.getConnection(DBPath + DBName, username, password);
			statement = demoDBConnection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void createNewTable(String DBName, String tableName) {
		try {
			demoDBConnection = DriverManager.getConnection(DBPath + DBName, username, password);
			statement = demoDBConnection.createStatement();
			
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS " + tableName + " (person_id INT AUTO_INCREMENT NOT NULL, first_name VARCHAR(255) NOT NULL, last_name VARCHAR(255) NOT NULL,PRIMARY KEY(person_id));");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String... args) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
	
				e.printStackTrace();
			}
			
			createNewDatabase("prova6");
			createNewTable("prova6", "person");
			
			try {
				demoDBConnection = DriverManager.getConnection(DBPath + "prova6", username, password);
				Statement statement = demoDBConnection.createStatement();
				statement.executeUpdate("INSERT INTO person (first_name, last_name) VALUES('Gioele', 'Armiento')");
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
}
