package by.epam.learn.ex1;
//Даны две точки А(х1, у1) и В(х2, у2).
  //      Составить алгоритм, определяющий, которая из точек находится ближе к началу координат. x y.

import java.math.MathContext;
import java.util.Scanner;

public class Task7 {
    public static void run() throws NumberFormatException{
        System.out.println("Please, enter x1, y1, x2, y2: ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        x1 = Math.abs(x1);
        y1 = Math.abs(y1);
        x2 = Math.abs(x2);
        y2 = Math.abs(y2);
        if (Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2)) < Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2)))
            System.out.println("The first point is closer to the origin! ");
        else if (Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2)) == Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2)))
            System.out.println("Points are equidistant! ");
        else if (Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2)) > Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2)))
            System.out.println("The second point is closer to the origin! ");

    }
}
