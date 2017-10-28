/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_04_06_file_letter_counter;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author bluebackdev
 */
public class RandomLetterGenerator {
    
    public char getRandomCharacter()
    {
        // Create constant for limiting random
        // int generator to 0-25 (total number
        // of letters in the alphabet)
        final int INT_MAX = 25;

        // Declare temp holder to hold each randomly
        // generated number before it's converted to a char
        int intTempLetterHolder;

        // Temporary character variable to return
        // with random letter for user in main
        char chrTempToWrite;

        // Create random generator
        Random randomLetters = new Random();

        // Generate number and offset by 65
        // to get to letters on the ASCII chart
        intTempLetterHolder = randomLetters.nextInt(INT_MAX) + 65;

        // Convert int value to character
        chrTempToWrite = (char) intTempLetterHolder;

        // Debug
//        JOptionPane.showMessageDialog(null, chrTempToWrite);

        // Return generated letter
        return chrTempToWrite;
    }
}
