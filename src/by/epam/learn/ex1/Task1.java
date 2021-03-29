package by.epam.learn.ex1;


import java.util.Scanner;

public class Task1 {
    public static void run() throws NumberFormatException{
        System.out.print("Please, enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int squareNumber = square(number);
        int count = countsOfDigits(squareNumber);
        lastValue(squareNumber ,count);
    }
    private static int square(int number){
        int squareNumber = number*number;
        System.out.println("Your number in square is: "+squareNumber);
        return squareNumber;
    }

    private static int countsOfDigits(long number) {
        return String.valueOf(Math.abs(number)).length();
    }

    private static void lastValue(int squareNumber, int count){
        int last = -1;
        for (int i = 0; i < count; i++){
            last = squareNumber % 10;
        }
        if (last != -1)
        System.out.println("The last number is: "+last);
    }
}
