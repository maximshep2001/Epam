package by.epam.learn.ex1;
//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Task9 {
    public static void run() throws NumberFormatException{
        System.out.print("Please, enter your radius: ");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double okr = 2*PI*radius;
        double square = PI*pow(radius,2)/2;
        System.out.println("Circumference is "+okr+" and area of a circle is "+square);
    }

}
