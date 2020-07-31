/*
Name:       BrandonKane_IS22101_FinalProgrammingProject.java
Author:     Brandon Kane
Date:       2020-05-13
Language:   Java
Purpose:    The purpose of this program is to store good habits that the user 
            enters in an array to track good habits. Also, the program will prompt
            the user to enter the name of the habit, prompt the user to enter the 
            frequency in days that they would like to complete the habit, and 
            prompt the user to enter "Y" if the completed it, "N" if they failed
            to complete it, or "Q" if they would like to quit the program. Lastly, 
            if the user enters "Y" the program will print out "Good Job!" and the 
            next date that the user needs to complete the habit again. If the user 
            enters "N", then the program will print out "Make sure that you get 
            back on track" and the next date that the user needs to complete the 
            habit again. Lastly, by entering "Q" the user will be able to quit the
            program. The general input is the user's keyboard. The general 
            processing that occurs is reading strings and integers from the user, 
            while and for loops, if and else statements, and defining variables. 
            The general output is the user's screen.
 */
package brandonkane_is22101_finalprogrammingproject;

import java.util.Scanner;
import java.time.LocalDate;

public class BrandonKane_IS22101_FinalProgrammingProject {

    public static void main(String[] args) {
        /*
         * In this code block, I created a Scanner variable named scnMyKeyboard to hold
         * the number of good habits that the user enters, the names of the good habits
         * that the user enters, and any other keyboard input that the user enters after
         * a prompt. Also, I created the integer variable named intArraySize, which will
         * hold an integer that will be the size of the array that the user determines
         * by entering the number of habits that they would like to complete. Next, the
         * integer variable named intFreqOfHabitCompletion will hold the numbers that
         * represent how often the user would like to complete each habit. This will be
         * used to determine the date that the user will need to complete each habit by
         * next.
         * 
         * Fourth, I created an integer variable named intHabitPeriodCounter, which will
         * be used to keep track of how many times the user has had the opportunity to
         * complete their habits (how many periods of habit completion have occured).
         * Fifth, I created a boolean variable called blnNumberOfGoodHabitsIsInteger
         * that will be used to help determine if the user has entered an integer or not
         * when they are prompted to enter the number of habits that they would like to
         * track. Sixth, the boolean named blnEntryIsYorN will be used to test if the
         * user has entered a "Y" or an "N" when they are asked if they would like to
         * start the habit tracker.
         * 
         * Next, the boolean named blnEntryIsQ will be used to test if the user has
         * entered a "Q" when they are asked if they completed each habit. I also
         * created the String variable named strStartHabitTracker, which will hold
         * either "Y" or "N" when the user enters their response to whether they would
         * like to start the habit tracker. Lastly, I created the String variable named
         * strHabitCompletionYorN, which will hold the user's response to whether or not
         * they completed each habit.
         */
        Scanner scnMyKeyboard = new Scanner(System.in);
        int intArraySize;
        int intFreqOfHabitCompletion = 0;
        int intHabitPeriodCounter = 0;
        boolean blnNumberOfGoodHabitsIsInteger = false;
        boolean blnEntryIsYorN = false;
        boolean blnEntryIsQ = false;
        String strStartHabitTracker = "";
        String strHabitCompletionYorN = "";

        /*
         * In this code block, I created a while loop using a boolean variable called
         * blnEntryIsYorN, which will loop while blnEntryIsYorN is false. This is so
         * that I can make the program loop until the user either enters a "Y" or an "N"
         * to determine whether they would like to start their habit tracker. Also, I
         * created an if statemement that will continue to the next while loop and start
         * the Habit Tracker if the user enters a 'Y' or a 'y' and presses enter.
         * Additionally, I created an else if statement so that if the user enters an
         * 'N' or 'n' and presses enter, then the program will display a message
         * thanking them for their entry and will exit the program completely. Lastly, I
         * created an else statement that will output an error message if the user
         * enters a string or other data type that is neither 'Y' nor 'N'.
         */
        System.out.println(
                "Would you like to start your habit tracker " + "program? If so, enter 'Y', if not enter 'N'.");
        strStartHabitTracker = scnMyKeyboard.nextLine();

        while (blnEntryIsYorN == false) {
            if (strStartHabitTracker.equalsIgnoreCase("Y")) {
                blnEntryIsYorN = true;
                break;

            } else if (strStartHabitTracker.equalsIgnoreCase("N")) {
                blnEntryIsYorN = true;
                System.out.println("Thank you for your response. We hope that you"
                        + " use the habit tracker program in the future.");
                System.exit(0);

            } else {
                System.out.println("ERROR: Please enter 'Y' or 'N'." + "\n"
                        + "Would you like to start your habit tracker program? If"
                        + " so, enter 'Y', if not enter 'N'.");
                strStartHabitTracker = scnMyKeyboard.nextLine();
            }
        }
        /*
         * In this code block, I created a while loop using a boolean variable called
         * blnNumberOfGoodHabitsIsInteger, which will loop while
         * blnNumberOfGoodHabitsIsInteger is false. This is so that I can make the
         * program loop until the user either enters an integer to determine how many
         * good habits they would like to track. Also, I created an if statemement that
         * will continue to the next for loop and allow the user to start tracking
         * habits if the user enters a 'Y' or a 'y' and presses enter. Additionally, I
         * created an else statement so that if the user enters a string or non-integer
         * data type, then the program will display an error message telling them to
         * please enter an integer.
         */
        while (blnNumberOfGoodHabitsIsInteger == false) {
            System.out.println("Enter the number of good habits that you " + "would like to track: ");
            if (scnMyKeyboard.hasNextInt()) {
                blnNumberOfGoodHabitsIsInteger = true;
                break;
            } else {
                System.out.println("ERROR: Please enter an integer.");
                scnMyKeyboard.nextLine();
            }
        }
        /*
         * In this code block, the intArraySize variable holds the number of good habits
         * that the user enters. Therefore, the intArraySize will determine the size of
         * teh arrays named strarrGoodHabitArray, intarrGoodHabitFreq, and
         * locdatearrHabitCompletionDates.
         */
        intArraySize = scnMyKeyboard.nextInt();
        scnMyKeyboard.nextLine();

        /*
         * In this code block, I created a String array named strarrGoodHabitArray,
         * which will hold the names of the good habits that the user enters. Next, I
         * created an integer array named intarrGoodHabitFreq, which will hold how
         * frequently the user would like to complete each habit that they enter. Third,
         * I created the LocalDate array named locdatearrHabitCompletionDates, which
         * will hold completion dates of each habit that they user enters based on each
         * habit's frequency. Lastly, I created the LocalDate variable named
         * locdateTodaysDate, which holds today's date and will be used to calculate the
         * date of completion for each habit.
         */
        String[] strarrGoodHabitArray = new String[intArraySize];
        int[] intarrGoodHabitFreq = new int[intArraySize];
        LocalDate[] locdatearrHabitCompletionDates = new LocalDate[intArraySize];
        LocalDate locdateTodaysDate = LocalDate.now();

        /*
         * In this code block, I created a for loop, which will loop until the loop
         * counter variable is no longer less than the intArraySize variable. Also, the
         * counter variable will increase by 1 every time that the loop is completed.
         * Next, each time that the for loop loops, the program will prompt the user to
         * enter the first habit name, the second habit name, and so on until they have
         * reached the number of habits that they specified. Lastly,
         * scnMyKeyboard.nextLine() will make the cursor go to the next line after the
         * program prompts the user to enter the name of each habit.
         */
        for (int counter = 0; counter < intArraySize; counter++) {
            System.out.println("Enter the name of the habit " + (counter + 1));
            strarrGoodHabitArray[counter] = scnMyKeyboard.nextLine();

            /*
             * In this code block, I created a while loop that will loop while the boolean
             * variable named blnNumberOfGoodHabitsIsInteger is false. Next, this for loop
             * will prompt the user to enter the frequency in days that they would like to
             * complete each habit. Third, I created an if and else statement that will
             * check to see if the user entered an integer. If the user enters an integer,
             * then the program will exit the while loop. If the user doesn't enter an
             * integer, then the program will print an error message and prompt them to
             * enter an integer.
             */
            blnNumberOfGoodHabitsIsInteger = false;
            while (blnNumberOfGoodHabitsIsInteger == false) {
                System.out.println(
                        "Enter the frequency in days that you would " + "like to complete habit " + (counter + 1));
                if (scnMyKeyboard.hasNextInt()) {
                    blnNumberOfGoodHabitsIsInteger = true;
                } else {
                    System.out.println("ERROR: Please enter an integer.");
                    scnMyKeyboard.nextLine();
                }
            }
            /*
             * In this code block, the integer variable named intFreqOfHabitCompletion will
             * hold the frequency that the user would like to complete each habit. Also, the
             * integer array named intarrGoodHabitFreq[counter] will hold the frequency of
             * each habit that the user would like to complete. Lastly, the localdate array
             * named locdatearrHabitCompletionDates[counter], will hold the completion dates
             * of each habit.
             */
            intFreqOfHabitCompletion = scnMyKeyboard.nextInt();
            intarrGoodHabitFreq[counter] = intFreqOfHabitCompletion;
            locdatearrHabitCompletionDates[counter] = (locdateTodaysDate.plusDays(intFreqOfHabitCompletion));
            scnMyKeyboard.nextLine();
        }

        /*
         * In this code block, I created a while loop that will loop while the boolean
         * named blnEntryIsQ is false. Next, the integer variable named
         * intHabitPeriodCounter will increment each time that the while loop loops so
         * that the program can print out, which period of habit completion the user is
         * in. Third, I created a for loop, which will loop until the loop 'counter'
         * variable is no longer less than the intArraySize variable. Also, the counter
         * variable will increase by 1 every time that the loop is completed. This is so
         * that the program will ask the user if they completed each habit that is in
         * the array named strarrGoodHabitArray[counter]. Next, each time that the for
         * loop loops, the program will print out the name of each habit that the user
         * entered.
         */
        while (blnEntryIsQ == false) {
            intHabitPeriodCounter++;
            System.out.println("\nHabit Period " + (intHabitPeriodCounter));

            for (int counter = 0; counter < intArraySize; counter++) {
                System.out.println("Did you complete the habit named " + (strarrGoodHabitArray[counter]) + "? "
                        + "If so, enter 'Y', if not enter 'N', or enter 'Q' to " + "quit the program.");
                strHabitCompletionYorN = scnMyKeyboard.nextLine();
                blnEntryIsYorN = false;

                /*
                 * In this code block, I created a while loop that will loop while the boolean
                 * named blnEntryIsYorN is false.
                 */
                while (blnEntryIsYorN == false) {
                    if (strHabitCompletionYorN.equalsIgnoreCase("Y")) {
                        System.out.println("Good job! The next date to complete " + "this habit is on: "
                                + locdatearrHabitCompletionDates[counter]);
                        blnEntryIsYorN = true;

                    } else if (strHabitCompletionYorN.equalsIgnoreCase("N")) {
                        System.out.println("Make sure that you get back on track."
                                + " The next date to complete this habit is on: "
                                + locdatearrHabitCompletionDates[counter]);
                        blnEntryIsYorN = true;

                    } else if (strHabitCompletionYorN.equalsIgnoreCase("Q")) {
                        blnEntryIsQ = true;
                        System.exit(0);

                    } else {
                        System.out.println("ERROR: Please enter 'Y' or 'N'." + "\n" + "Did you complete habit "
                                + (counter + 1) + "? " + "If so, enter 'Y', if not enter 'N'.");
                        strHabitCompletionYorN = scnMyKeyboard.nextLine();
                    }

                }
            }
        }
    }
}