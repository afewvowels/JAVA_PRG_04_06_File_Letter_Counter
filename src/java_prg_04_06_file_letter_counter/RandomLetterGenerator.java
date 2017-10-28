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
        final int INT_MIN = 0;
        final int INT_MAX = 25;

        int intTempLetterHolder;

        char chrTempToWrite;

        Random randomLetters = new Random();

        intTempLetterHolder = randomLetters.nextInt(INT_MAX) + 65;

        chrTempToWrite = (char) intTempLetterHolder;

//        JOptionPane.showMessageDialog(null, chrTempToWrite);

        return chrTempToWrite;
    }
}
