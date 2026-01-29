package javaPracticle;

import java.util.regex.*;
public class extractNumericAndStringfromText {
    String str="me name is vivek";
        public static void main(String[] args) {
// Check if the String is Numeric or not
            String str = "1234573204";
            System.out.println("Check if the String is Numeric or not-------------");
            System.out.println(str.matches("\\d+")); //output : True
            str = "vivek123ranjan456test";
// Fetch only String values from AlphaNumeric String
            String[] strarr = str.split("\\d+");
            System.out.println("Fetch only String values from String-------------");
            for (String str1 : strarr)
                System.out.println(str1); // output : vivek ranjan test
// Fetch only Numeric from the text
            System.out.println("Fetch only String from the text-------------");
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(matcher.group()); // output : 123 456
            }
// Split with spaces
            String text = "Hello world this is Vivek";
            System.out.println("Split by spaces-------------");
            String[] words = text.split(" ");
            for (String word : words) {
                System.out.println(word); // output : Hello world this is Vivek
            }
// Split with tabs, multiple spaces
            text = "Hello world this is Vivek";
            System.out.println("Split by spaces,tabs, multiple spaces -------------");
            words = text.split("\\s+"); // here '\\s' will replace only one space and '\\s+' will replace multiple spaces
            for (String word : words) {
                System.out.println(word); // output : Hello world this is Vivek
            }
// Split by lines
            text = "Hello world\nThis is Vivek\nAutomation rocks";
            String[] lines = text.split("\n");
            System.out.println("Split by lines-------------");
            for (String line : lines) {
                words = line.split(" ");
                for (String word : words) {
                    System.out.println(word); // output : Hello world This is Vivek Automation rocks
                }
            }

//Using Chars
            String sample = "Vivek123Ranjan456Test$#%@";
            StringBuilder letters = new StringBuilder();
            StringBuilder numbers = new StringBuilder();
            for (char ch : sample.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters.append(ch);
                } else if (Character.isDigit(ch)) {
                    numbers.append(ch);
                } else {
                    System.out.println("Special Character: " + ch);
                }
            }
            System.out.println("Using Chars-------------");
            System.out.println("Letters: " + letters.toString()); // output : VivekRanjanTest
            System.out.println("Numbers: " + numbers.toString()); // output : 123456
        }
}
