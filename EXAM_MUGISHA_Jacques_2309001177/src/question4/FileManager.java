package question4;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    // Class implementation goes here

	    private File file;

	    // Method to create a file
	    public void createFile(String fileName) {
	        file = new File(fileName);
	        try {
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred while creating the file.");
	            e.printStackTrace();
	        }
	    }

	    // Method to write user input to the file
	    public void writeToFile(Person person) {
	        try (FileWriter fw = new FileWriter(file, true);
	             BufferedWriter bw = new BufferedWriter(fw);
	             PrintWriter out = new PrintWriter(bw)) {
	            out.println(person.toString());
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
	    }

	    // Method to read and display the file content
	    public void readFromFile() {
	        try (Scanner fileScanner = new Scanner(file)) {
	            while (fileScanner.hasNextLine()) {
	                String line = fileScanner.nextLine();
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("An error occurred while reading the file.");
	            e.printStackTrace();
	        }
	    }
	}
	


	