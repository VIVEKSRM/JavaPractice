package javaPracticle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpression {
    public static void main(String arg[]){

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(n -> n % 2 == 0)   // keep only even numbers
                .forEach(n -> System.out.println(n));  // print them

       numbers.stream().filter(n-> n*n==4).forEach(n->System.out.println(n));
       numbers.stream().forEachOrdered(n->System.out.println(n));


// Example two
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers2.stream()
                .filter(n -> n % 2 == 0)              // Step 1: keep only even numbers
                .map(n -> n * n)                      // Step 2: square each number
                .sorted((a, b) -> b.compareTo(a))     // Step 3: sort in descending order
                .forEachOrdered(n -> System.out.println(n)); // Step 4: print in order


// Example three
        List<String> names = Arrays.asList("Vivek", "Anita", "Rahul");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}
