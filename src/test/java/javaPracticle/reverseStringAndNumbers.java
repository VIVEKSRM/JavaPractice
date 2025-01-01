package javaPracticle;

import org.testng.annotations.Test;

import java.util.Scanner;

public class reverseStringAndNumbers {
    @Test
    public void ReverseAString() {
        String finalString = "";
        String str = "i am vivek ranjan";

        // with inbuilt reverse StringBuilder function
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse of a String using StringBuilder:- " + sb.reverse());

        // WithOut inbuilt reverse StringBuilder function
        char[] ch = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--)
        {
            finalString = finalString + ch[i];
            System.out.print(ch[i]);

        }
        System.out.println("");
        System.out.println("Reverse of a String without inbuilt function:- "+finalString);

        //Clearing finalString variable
        finalString="";

        // By using Split function
        String[] strSplit=str.split("");
        for(int j=strSplit.length-1; j>=0; j--)
            finalString=finalString+strSplit[j];
        System.out.println("Reverse of a String with split:- "+finalString);

        //Clearing finalString variable
        finalString="";

        //Using charAt function
        for(int k=str.length()-1; k>=0; k--)
            finalString=finalString+str.charAt(k);
        System.out.println("Reverse of a String with charAt fn():- "+finalString);

    }


    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for reverse: -");
        int num =sc.nextInt();
        sc.close();
        int reverse=0;
        while(num!=0)
        {
            reverse = reverse*10;
            reverse=reverse+num%10;
            num=num/10;
        }
        System.out.print(reverse);

    }

}
