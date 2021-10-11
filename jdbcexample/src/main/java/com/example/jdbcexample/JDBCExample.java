package com.example.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;


public class JDBCExample {
	static Scanner input = new Scanner(System.in);
	
	public static void main (String... args) {
		
		// 1. Carico il driver JAR
		
		// 2. Registro il driver con Java
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // sempre uguale
		} catch (ClassNotFoundException e) {

			// non ho aggiunto il jar
			
			e.printStackTrace();
		}
		
		try {
			// 3. mi connetto al DB che sta qui ----------------------vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
			Connection mysqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root"); // analogo del workbench per java
			
			// 4. apro un canale di comunicazione
			Statement statement = mysqlConnection.createStatement(); //analogo della pagina vuota dove scrivete il codice SQL in workbench
			
			// 5. mando la query
			ResultSet tabellaRisultati = statement.executeQuery("SELECT * FROM actor"); // qualsiasi query

			// 6. Stampo i risultati
//			while (tabellaRisultati.next()) {
//				System.out.println("Codice postazione: "+tabellaRisultati.getString("actor_id"));
//				System.out.println("Marca: "+tabellaRisultati.getString("first_name"));
//				System.out.println("Modello: "+tabellaRisultati.getString("last_name"));
//				System.out.println("");
//			}
			
			System.out.println("Scegli il nome del file: ");
			String filename = input.nextLine();
			FileManager file = new FileManager(filename);
			file.createFile();
			file.writeFile(tabellaRisultati);
			
		} catch (SQLException e) {
			
			// errore di MySQL
			
			e.printStackTrace();
		}
	}

}
