package javaPracticle;

import java.util.*;
import java.util.stream.Collectors;

public class streamFunctionCodes {


    public static void main(String[] args) {
        //   ********************* Q1. Find duplicate elements in a list.
        System.out.println(" *** Q1. Find duplicate elements in a list : -");
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates);


        //  ********************* Q2. Find the second-highest number.
        System.out.println(" *** Q2. Find the second-highest number : -");
    //below is for java 10+
//        int secondHighest = list.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElseThrow();
//        System.out.println(secondHighest);

        int secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No second-highest element"));

        System.out.println(secondHighest);


        // ********************* Q3 -Hash Map code with stream function.
        System.out.println(" *** Q3 - Hash Map code with stream function. : -");
        String strMain = "My name is My name is Vivek Ranjan";
        String[] str2 = strMain.replace(" ", "").toLowerCase().split("");
        String[] str7 = strMain.toLowerCase().split(" ");
        LinkedHashMap<String, Integer> empMap = new LinkedHashMap<>();

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


        //******************************* Q4 -
         strMain="my name My is vivek is ranjan";
         System.out.println(" *** Q4 - Find all duplicate words and print them only once : -");
        //output = find all duplicate words and print them only once
        // my and is

        String[] str=strMain.toLowerCase().split("\\s+");

        HashMap<String, Integer> hm=new HashMap<>();

        for (int i=0; i<str.length; i++)
        {
            if(hm.containsKey(str[i]))
            {
                int count=hm.get(str[i]);
                hm.put(str[i],count+1);

            }
            else{
                hm.put(str[i],1);
            }

        }
        System.out.println(hm);

        hm.entrySet().stream().filter(n-> n.getValue()>1)
                .forEach(val->System.out.println(val.getKey()));




    }

}
