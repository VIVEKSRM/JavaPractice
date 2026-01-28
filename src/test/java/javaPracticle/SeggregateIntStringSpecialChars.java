package javaPracticle;

public class SeggregateIntStringSpecialChars {

        public static void main(String[] args) {
            String str = "Hello@Vivek#2026!";

            StringBuilder letters = new StringBuilder();
            StringBuilder numbers = new StringBuilder();
            StringBuilder specials = new StringBuilder();

            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    letters.append(ch);
                } else if (Character.isDigit(ch)) {
                    numbers.append(ch);
                } else {
                    specials.append(ch);
                }
            }

            System.out.println("Letters: " + letters.toString());
            System.out.println("Numbers: " + numbers.toString());
            System.out.println("Specials: " + specials.toString());
        }
}
