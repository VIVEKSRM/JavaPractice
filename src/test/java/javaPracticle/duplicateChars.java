package javaPracticle;

import org.testng.annotations.Test;

public class duplicateChars {
    @Test

    public void duplicateCharsInString()
    {
        String str="My name is vivek Ranjan";
        char[] chars=str.toCharArray();
        int count=0;
        for (int i=0; i<=str.length()-1; i++) {
            for(int j=i+1; j<=str.length()-1; j++) {
                if(chars[i]==chars[j]) {
                System.out.println(chars[j]+" is duplicate");
                    count++;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = new String("Sakkett");
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");
        for (int i=0; i<=str.length()-1;i++) {
            for(int j=i+1; j<=str.length()-1;j++) {
                if (chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
    }

}


