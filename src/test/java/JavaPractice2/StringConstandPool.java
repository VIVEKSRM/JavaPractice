package JavaPractice2;

import java.util.Arrays;

public class StringConstandPool {
    public static void main(String[] args) {

        //Both str1 and str2 point to the same String Constant Pool (SCP) entry "Test2".
        String str1 = "Test2";
        String str2 = "Test2";
        System.out.println(str1.equals(str2)); // true



        //Example 2 :
            //equals() in arrays does not compare contents.
            //In Java, arrays don’t override Object.equals().
            //So str1.equals(str2) is basically the same as str1 == str2 → it checks reference equality (whether both variables point to the same array object in memory).
        String[] str3 = {"Test", "Test2"};
        String[] str4 = {"Test", "Test2"};
        System.out.println(str3.equals(str4)); // false
        System.out.println(Arrays.equals(str3, str4)); // true
        System.out.println(Arrays.asList(str3).equals(Arrays.asList(str4))); // true



        //Example 3 :- DeepEquals
        String[][] arr1 = { {"A", "B"} };
        String[][] arr2 = { {"A", "B"} };
        System.out.println(Arrays.deepEquals(arr1, arr2)); // true


        //Example 4 :- DeepEquals
        String a = new String("Test2");   // stored in heap
        String b = new String("Test2");   // another heap object

        System.out.println(a == b);       // false (different heap objects)
        System.out.println(a.equals(b));  // true  (same content)

    // Now use intern()
            //intern() forces a string into the String Constant Pool (SCP).
            //If the pool already contains an identical string, it returns the reference from the pool.
            //If not, it adds the string to the pool and returns that reference.
        String c = a.intern();
        String d = b.intern();

        System.out.println(c == d);       // true (both point to SCP "Test2")
        System.out.println(c.equals(d));  // true



    }

}
