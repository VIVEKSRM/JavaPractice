package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class secondHighestNumberInArray {

    @Test
    public void secondHighestNumberInArrayTest() {
        int largest = 0;
        int secondLargest = 0;
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2};

        for (int j = 0; j <= arr.length - 1; j++) {
            if (arr[j] > largest) {
                secondLargest = largest;
                largest = arr[j];
            } else if (arr[j] > secondLargest) {
                secondLargest = arr[j];
            }
        }
        System.out.println(secondLargest);

        //========================== Best Way =============
       int[] arr1 = {10, 5, 20, 8, 20, 15};

        int secondHighest = Arrays.stream(arr1)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Array must contain at least two distinct numbers"));

        System.out.println("Best Way: -"+secondHighest);

    }
    @Test
    public void compareTwoNumberWithoutIfLoop(){
        Integer a=200;
        Integer b=100;
        Integer highestNumber=a>b?a:b; //Ternary Iterator
        System.out.println(highestNumber);

    }

    @Test
    public void findlargestnumbers()
    {
        int k=3;
        Integer[] i ={1,4,2,8,6,45,55};
        LinkedHashSet<Integer> hs=new LinkedHashSet<>(Arrays.asList(i));
        ArrayList<Integer> arr=new ArrayList<>(hs);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(" Number is :-"+ arr.get(k));


//            Integer[] j= hs.toArray(new Integer[hs.size()]);
//        System.out.println(j[k]);
    }
}