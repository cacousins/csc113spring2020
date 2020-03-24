/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterationman;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Colin A. Cousins
 */
public class AnotherGuessCodingWhile {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int numGuesses = 0;
        int randomNumber = (int) (Math.random() * 11);

        out.println("       ************         ");
        out.println("Welcome to the Guessing Game");
        out.println("       ************         ");
        out.println();
        out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;
        while (inputNumber != randomNumber) {
            out.println();
            out.println("Try again...");
            out.print("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }

        out.print("You win after ");
        out.println(numGuesses + " guesses.");
        keyboard.close();
    }

}
