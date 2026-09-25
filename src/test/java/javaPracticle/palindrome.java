package javaPracticle;

public class palindrome {
    public static void main (String[] str1) {
        String str = "madam";

        boolean palindrome = str.equals(
                new StringBuilder(str).reverse().toString()
        );

        System.out.println(palindrome);
    }
}
