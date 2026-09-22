package JavaPractice2;
import java.util.ArrayDeque;
import java.util.Deque;

public class validParenthesis {
            public static boolean isValid(String s) {

                Deque<Character> stack = new ArrayDeque<>();

                for (char ch : s.toCharArray()) {

                    // Opening brackets
                    if (ch == '(' || ch == '[' || ch == '{') {
                        stack.push(ch);
                    }

                    // Closing brackets
                    else if (ch == ')' || ch == ']' || ch == '}') {

                        if (stack.isEmpty()) {
                            return false;
                        }

                        char top = stack.pop();  // Fetch and Remove the char from the Stack and store it in top variable

                        if (ch == ')' && top != '(') {
                            return false;
                        }

                        if (ch == ']' && top != '[') {
                            return false;
                        }

                        if (ch == '}' && top != '{') {
                            return false;
                        }
                    }
                }

                return stack.isEmpty();
            }

            public static void main(String[] args) {

                String input = "([{}])";

                System.out.println(isValid(input));
            }
        }
