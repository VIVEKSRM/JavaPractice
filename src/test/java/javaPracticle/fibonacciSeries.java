package javaPracticle;

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] arg) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number :- ");
//        int number = sc.nextInt();
//        sc.close();
//        int a = 0;
//        int b = 1;
//        int temp;
//        System.out.print(a + ", " + b + ", ");
//        for (int i = 0; i <= number - 3; i++) {
//            temp = a + b;
//            System.out.print(temp + ", ");
//            a = b;
//            b = temp;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }


    }

}
