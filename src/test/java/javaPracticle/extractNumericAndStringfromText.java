package javaPracticle;

import java.util.regex.*;
public class extractNumericAndStringfromText {
        public static void main(String[] args) {
//Check if the String is Numeric or not
            String str = "1234573204";
            System.out.println(str.matches("\\d+"));

            str = "vivek123ranjan456test";
// Fetch only Numeric values from String
            String[] strarr = str.split("\\d+");

            for(String str1:strarr)
                System.out.println(str1);

// Fetch only String from the text
            Pattern pattern=Pattern.compile("\\d+");
            Matcher matcher=pattern.matcher(str);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }

}
