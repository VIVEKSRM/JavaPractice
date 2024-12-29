package javaPracticle;

import org.testng.annotations.Test;

public class reverseAString {
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

}
