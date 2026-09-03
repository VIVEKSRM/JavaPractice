package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashMapCountTheNumberOfWordsInString {

    @Test
    public void countTheNumberOfWordsInStringUsingHashMap() {
        String str = "my name is vivek ranjan";
        String[] split = str.replaceAll(" ", "").split("");
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            if (hm.containsKey(split[i])) {
                // Integer count = hm.get(split[i]);
                hm.put(split[i], hm.get(split[i]) + 1);
            } else
                hm.put(split[i], 1);
        }
        System.out.println(hm);

    String strMain = "My name is My name is Vivek Ranjan";
    String[] str2 = strMain.replace(" ", "").toLowerCase().split("");
    String[] str7 = strMain.toLowerCase().split(" ");
    LinkedHashMap<String, Integer> empMap = new LinkedHashMap<>();

// empMap.put("Vivek", 10);
// empMap.put("Rahul", 20);
// empMap.put("Amit", 30);
// empMap.put("Raj", 40);

for(int i = 0; i<str7.length; i++)
    {
        if (empMap.containsKey(str7[i])) {
            int count = empMap.get(str7[i]);
            empMap.put(str7[i], count + 1);

        } else {
            empMap.put(str7[i], 1);
        }
    }

empMap.entrySet()
                .stream()
                .filter(n->n.getKey().startsWith("R"))
                .filter(n ->n.getKey().endsWith("l"))
                .forEachOrdered(n->System.out.println(n.getKey()+" "+n.getValue()));

empMap.entrySet().stream()
    .filter(n->n.getValue()==2)
    .forEach(n->System.out.println(n));
    ArrayList<String> arr = new ArrayList<>();
    empMap.entrySet().stream().forEach(n->arr.add(n.getKey()));

System.out.println(arr);
Collections.reverse(arr);
System.out.println(arr);

for(String st :arr)
    {
        System.out.print(st + " ");
    }
}
}