package javaPracticle;

import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.*;
public class numberIsPrimeOrNot {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int j;
        boolean prime=true;
        System.out.println(" Please Enter a Number --: ");
        int number=sc.nextInt();
        sc.close();
        for (int i=2; i<=number/2; i++) {
            j = number % i;
            if (j==0) {
                prime = false;
                break;
            }
        }
            if(prime)
                System.out.println("Given Number is Prime");
            else
                System.out.println("Given Number is not Prime");
    }
}
