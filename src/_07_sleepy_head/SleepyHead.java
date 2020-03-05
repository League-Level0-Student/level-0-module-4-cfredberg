package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * 
         */
    
        int day = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int trip = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Vacation", JOptionPane.YES_NO_OPTION);
        if (day == 1) {
        	isWeekday = false;
        }else {
        	isWeekday = true;
        }
        
        if (trip == 1) {
        	isVacation= false;
        }else {
        	isVacation = true;
        }
        
        if (isWeekday && isVacation == true) {
        	System.out.println("Sleeep in");
        }else if (isWeekday == true) {
        	System.out.println("Get up lazybones");
        }else {
        	System.out.println("Sleep in");
        }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
