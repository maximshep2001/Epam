package by.epam.learn.ex1;


import java.util.Scanner;

public class Task4 {
    public static void run() throws NumberFormatException{
        System.out.print("Please, enter A: ");
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        System.out.print("Please, enter B: ");
        int B = scanner.nextInt();
        System.out.print("Please, enter C: ");
        int C = scanner.nextInt();
        System.out.print("Please, enter D: ");
        int D = scanner.nextInt();
        boolean[] arr= new boolean[4];
        for (int i = 0; i < 4; i++){
            arr[i] = true;
        }

        if (A%2 == 1) arr[0] = false;
        if (B%2 == 1) arr[1] = false;
        if (C%2 == 1) arr[2] = false;
        if (D%2 == 1) arr[3] = false;

        boolean key;
        int c=0;
        for(int j = 0; j<4; j++) {
        if (arr[j]) c++;
        }
            if (c>=2) key = true;
            else key = false;

        System.out.println("Среди заданных целых чисел А, В, С, D есть хотя бы два четных: "+key);
    }

}
