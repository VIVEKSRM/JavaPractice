package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortingOfCollections {
    @Test
    public void sortingOfCollectionsTest(){
        String[] str={"Test5","Test2","Test3","Test4"};
        Integer[] i={1,2,5,3,2,5,6,3,2};
        ArrayList<String> arr=new ArrayList<>(Arrays.asList(str));
        Collections.sort(arr);
        System.out.println(arr);

        ArrayList<Integer> in=new ArrayList<>(Arrays.asList(i));
        Collections.sort(in, Collections.reverseOrder());
        //Collections.reverse(in);
        System.out.println(in);
        System.out.println(Collections.min(in));
        System.out.println(Collections.max(in));
    }
}
