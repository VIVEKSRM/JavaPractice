package javaPracticle;

import org.testng.annotations.Test;

import java.util.HashMap;

public class countTheNumberOfWordsInString {

    @Test
    public void countTheNumberOfWordsInStringUsingHashMap() {
        String str = "my name is vivek ranjan";
        String[] split = str.split("");
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i <= split.length - 1; i++) {
            if (hm.containsKey(split[i])) {
                Integer count = hm.get(split[i]);
                hm.put(split[i], count + 1);
            } else
                hm.put(split[i], 1);
        }
        System.out.println(hm);
    }
}