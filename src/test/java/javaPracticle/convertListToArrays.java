package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class convertListToArrays {

    @Test
    public void convertListToArraysTest() {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2};
        String[] str = {"test", "test2", "test3"};

        // we can use Arrays.asList to add the data at the time of creating a new array list
        ArrayList<String> ar = new ArrayList<>(Arrays.asList(str));
        ArrayList<Integer> arI = new ArrayList<>(Arrays.asList(arr));

       //We can Use Collections methods also to add
        Collections.addAll(arI, arr);
        Collections.addAll(ar, str);

        // We can use for loop also to add the data
        for (Integer i: arr)
            arI.add(i);

        for(String strS: str)
            ar.add(strS);

        System.out.println("String ------"+ar);
        System.out.println("Integer ----- "+arI);
    }
}
