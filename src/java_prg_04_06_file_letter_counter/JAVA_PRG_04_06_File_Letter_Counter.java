/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_06_file_letter_counter;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter the name of a file, and then asks
 * the user to enter a character. The program should count and display the
 * number of times that the specified character appears in the file. Use
 * Notepad or another text editor to create a simple file that can be used to
 * test the program.
 */
public class JAVA_PRG_04_06_File_Letter_Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        char chrTemp; 
        char chrTemp2;
        
        String strUserInput;
        String strTemp;
        
        // Create variable to hold user input on how many
        // letters to generate
        // Create variable and initialize to hold matches
        // between random letters and user input
        int intUserInput;
        int intCounter = 0;
        
        // Create a new random letter generator class
        RandomLetterGenerator chrGenerator = new RandomLetterGenerator();
        
        // Get user input on how many letters to generate in file
        strUserInput = JOptionPane.showInputDialog("Please enter how many " +
                "letters\nyou would like to generate.");
        intUserInput = Integer.parseInt(strUserInput);
        
        PrintWriter outputFile = new PrintWriter("/Users/bluebackdev/NetBeansProjects/Github/Book/Ch04 - Loops and Files/JAVA_PRG_04_06_File_Letter_Counter/textfile.txt");
        
        // Keep generating a letter and incrementing through the loop
        // to fill the file until user input limit has been reached
        for(int i = 0 ; i < intUserInput ; i++)
        {
            chrTemp = chrGenerator.getRandomCharacter();
            outputFile.println(chrTemp);
        }
        
        // Remember to close the file
        outputFile.close();
        
        // Prompt user input on letter to search file for
        strUserInput = JOptionPane.showInputDialog("Please enter a letter " +
                "to search for.");
        
        // Make sure the comparison is in the correct case
        // (using uppercase ASCII values in random generator)
        strUserInput.toUpperCase();
        
        // Get user input (first character of input just in case)
        chrTemp = strUserInput.charAt(0);
        
        // Open the file
        File file = new File("/Users/bluebackdev/NetBeansProjects/Github/Book/Ch04 - Loops and Files/JAVA_PRG_04_06_File_Letter_Counter/textfile.txt");
        Scanner inputFile = new Scanner(file);
        
        // Compare each line to user input
        for(int i = 0 ; i < intUserInput ; i++)
        {
            strTemp = inputFile.nextLine();
            
            chrTemp2 = strTemp.charAt(0);
            
            // If the current letter matches the user input
            // then increment the counter variable
            if(chrTemp == chrTemp2)
            {
                intCounter++;
            }
        }
        
        // Remember to close the file
        inputFile.close();
        
        // Display results to the user
        JOptionPane.showMessageDialog(null, "Your letter appears " + intCounter
            + " times in the generated file.");
        
        // Exit for JOptionPane
        System.exit(0);
    }
    
}
