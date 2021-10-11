package com.example.jdbcexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FileManager {
	
	private String filename;
	private String path;
	
	public FileManager(String filename) {
		this.filename = filename;
		// Per non dover cambiare ogni volta il nome utente
		this.path = System.getProperty("user.home") + "/Desktop/" + this.filename + ".txt";
	}
	
	
	// metodo che crea il file
	public void createFile() {
		try {
			File file = new File(this.path);
			if (file.exists()) {
				System.out.println("Il file esiste già!");
			} else if(file.createNewFile()) {
				System.out.println("Il file è stato creato!");
			} else {
				System.out.println("Il file non può essere creato!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Metodo che scrive nel file
	// Il risultato della query
	public void writeFile(ResultSet queryResult) {
		try {
			
			// Apro FileWriter e BufferedWriter
			FileWriter fw = new FileWriter(path);
			BufferedWriter bw = new BufferedWriter(fw);
			
			try {
				
				// Fino a quando il set queryResult ha una stringa
				// la estraggo e la scrivo nel file creato in precedenza
				while (queryResult.next()) {
					bw.write("Codice postazione: "+ queryResult.getString("actor_id"));
					bw.write("\n");
					bw.write("Marca: "+ queryResult.getString("first_name"));
					bw.write("\n");
					bw.write("Modello: "+ queryResult.getString("last_name"));
					bw.write("\n----------------------------\n");
				}
				
				bw.flush();
				bw.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
