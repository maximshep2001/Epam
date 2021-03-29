package by.epam.learn.ex1;


import java.util.Scanner;

public class Task2 {
    public static void run() throws NumberFormatException {
        System.out.print("Please, enter the year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.print("Please, enter the month: ");
        int month = scanner.nextInt();
        boolean visok = visok(year);
        days(month, visok, year);
    }

    private static boolean visok(int year){
        boolean visok;
        if (year/4 == 0)
            visok = true;
        else visok = false;
        return visok;
    }

    private static void days(int month, boolean visok, int year) {
        int days;
        switch (month) {

            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
            case 4, 6, 9, 11:
                days = 30;
            case 2:{
                if (visok) days = 29;
                else days = 28;}
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        System.out.println("The amount of days on the "+month+" month of the "+year+" is: "+days);
    }
}
