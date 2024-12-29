package javaPracticle;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateFromArrayList {

    @Test
    public void RemoveDuplicateFromArrayList()
    {
        Integer[] arr={1,2,3,4,5,61,2,3,4,5};
        ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(arr));
        ar.add(1);
        ar.add(2);
        System.out.println(ar);
        LinkedHashSet<Integer> lh=new LinkedHashSet<>(ar);
        System.out.println(lh);
        System.out.println("-------------------");
        for(Integer i: lh)
            System.out.print(i);
    }

    @Test
    public void convertArrayListToHashSet()
    {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,4,5,6));
        HashSet<Integer> hs=new HashSet<>(arr);
        System.out.println(hs);
    }


}
