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
        char chrTemp = 'a'; 
        char chrTemp2 = 'a';
        
        String strUserInput;
        String strTemp;
        
        int intUserInput = 0;
        int intCounter = 0;
        
        RandomLetterGenerator chrGenerator = new RandomLetterGenerator();
        
        strUserInput = JOptionPane.showInputDialog("Please enter how many " +
                "letters\nyou would like to generate.");
        intUserInput = Integer.parseInt(strUserInput);
        
        PrintWriter outputFile = new PrintWriter("/Users/bluebackdev/NetBeansProjects/Github/Book/Ch04 - Loops and Files/JAVA_PRG_04_06_File_Letter_Counter/textfile.txt");
        
        for(int i = 0 ; i < intUserInput ; i++)
        {
            chrTemp = chrGenerator.getRandomCharacter();
            outputFile.println(chrTemp);
        }
        
        outputFile.close();
        
        strUserInput = JOptionPane.showInputDialog("Please enter a letter " +
                "to search for.");
        
        strUserInput.toUpperCase();
        
        chrTemp = strUserInput.charAt(0);
        
        File file = new File("/Users/bluebackdev/NetBeansProjects/Github/Book/Ch04 - Loops and Files/JAVA_PRG_04_06_File_Letter_Counter/textfile.txt");
        Scanner inputFile = new Scanner(file);
        
        for(int i = 0 ; i < intUserInput ; i++)
        {
            strTemp = inputFile.nextLine();
            
            chrTemp2 = strTemp.charAt(0);
            
            if(chrTemp == chrTemp2)
            {
                intCounter++;
            }
        }
        
        inputFile.close();
        
        JOptionPane.showMessageDialog(null, "Your letter appears " + intCounter
            + " times in the generated file.");
        
        System.exit(0);
    }
    
}
