package com.queries.queriesexamples;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App 
{
    public static void main(String[] args )
    {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // sempre uguale
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
    	
//    	Insert a record to represent Mary Smith renting ‘Academy Dinosaur’ from Mike Hillyer at Store 1 today .
    	
    	try {
    		Connection mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
    		System.out.println("Connesso al database!");
    		
    		Statement statement = mysqlConnection.createStatement();
 
    		// Creo le variabili che conterranno i dati
    		// da inserire nella INSERT
    		String filmID = "";
    		String customerID = "";
    		String employeeID = "";
    		String inventoryID = "";
    		
    		// Ricavo il customer ID che rispetta la mia query
    		ResultSet customerResult = statement.executeQuery("SELECT customer_id FROM customer WHERE first_name = 'Mary' AND last_name = 'Smith'");
    		while(customerResult.next()) {
    			customerID = customerResult.getString("customer_id");
    			System.out.println("Customer ID: " + customerID);
    		}
    		
    		// Ricavo il film ID che rispetta la mia query
    		ResultSet film = statement.executeQuery("SELECT film_id FROM film WHERE title = 'ACADEMY DINOSAUR'");
    		while(film.next()) {
    			filmID = film.getString("film_id");
    			System.out.println("Film ID: " + filmID);
    		}
    		
    		// Ricavo l'employee ID che rispetta la mia query
    		ResultSet employee = statement.executeQuery("SELECT staff_id FROM staff WHERE first_name = 'Mike' AND last_name = 'Hillyer'");
    		while(employee.next()) {
    			employeeID = employee.getString("staff_id");
    			System.out.println("Employee ID: " + employeeID);
    		}
    		
    		// Ricavo l'inventaryID che rispetta la mia query
    		ResultSet inventory = statement.executeQuery("SELECT * FROM inventory WHERE film_id = " + filmID + " AND store_id = 1 LIMIT 1");
	   		while(inventory.next()) {
	   			inventoryID = inventory.getString("inventory_id");
	   		 }
    		
	   		// Con LocalDateTime ricavo la data odierna millisecondi compresi
	   		// La data verrà quindi formattata impostando un pattern (formatter)
	   		// Ed eseguendo il metodo format passando il pattern
	   		LocalDateTime todayDayTime = LocalDateTime.now();
	   		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	   		String nowFormatted = todayDayTime.format(formatter);
	   		
	   		// Al LocalDateTime con plusDays aggiungo 30 giorni
	   		LocalDateTime returnDayTime = LocalDateTime.now().plusDays(30);
	   		String returnDateFormatted = returnDayTime.format(formatter);
    		
	   		// Query di INSERT
    		int result = statement.executeUpdate("INSERT INTO rental (rental_date, inventory_id, customer_id, return_date, staff_id) VALUES ( '" + nowFormatted + "' , '" + inventoryID + "' , '" + customerID + "' , '" + returnDateFormatted + "', '" + employeeID + "' )");
    		if(result == 0) {
    			System.out.println("Inserimento non completato");
    		} else {
    			System.out.println("Riga aggiunta!");
    			System.out.println(result);
    		}
    		
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
