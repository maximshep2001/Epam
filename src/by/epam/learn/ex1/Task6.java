package by.epam.learn.ex1;

import java.util.Scanner;

public class Task6 {
    public static void run() throws NumberFormatException{
        int maxVal = 60*60*24;
        System.out.print("Please, enter your number of seconds (0<n<"+maxVal+"): ");
        Scanner scanner = new Scanner(System.in);
        int numberSecond = scanner.nextInt();
        int hours = (numberSecond/3600);
        int minutes = (numberSecond - (hours*3600))/60;
        int seconds = (numberSecond - hours*3600 - minutes*60);
        System.out.println("Hours: "+hours+", minutes: "+minutes+", seconds: "+seconds);
    }
}
