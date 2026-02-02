package Default;
import java.io.FileWriter;
import java.io.IOException;
public class WriteCSV {
	public static void main(String[] args) {

        String fileName = "employees.csv";

        try (FileWriter writer = new FileWriter(fileName)) {

            // Header
            writer.write("ID,Name,Department,Salary\n");

            // Employee records
            writer.write("1,Khushi,IT,50000\n");
            writer.write("2,Rahul,HR,42000\n");
            writer.write("3,Priya,Finance,55000\n");
            writer.write("4,Aman,Marketing,48000\n");
            writer.write("5,Neha,IT,60000\n");

            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("Error writing CSV file: " + e.getMessage());
        }
    }
}
