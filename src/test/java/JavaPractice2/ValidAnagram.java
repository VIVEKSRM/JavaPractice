package JavaPractice2;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

                String s = "anagram";
                String t = "nagaram";

                if (s.length() != t.length()) {
                    System.out.println(false);
                    return;
                }

                Map<Character, Integer> map = new HashMap<>();

                for (char ch : s.toCharArray()) {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }

                for (char ch : t.toCharArray()) {

                    if (!map.containsKey(ch)) {
                        System.out.println(false);
                        return;
                    }

                    map.put(ch, map.get(ch) - 1);
                }

                for (int count : map.values()) {
                    if (count != 0) {
                        System.out.println(false);
                        return;
                    }
                }

                System.out.println(true);
    }
}
