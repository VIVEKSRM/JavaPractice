package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class secondHighestNumberInArray {

    @Test
    public void secondHighestNumberInArrayTest(String[] agr) {
        int largest=0;
        int secondLargest=0;
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2};

        for (int j = 0; j <= arr.length - 1; j++) {
            if (arr[j] > largest) {
                secondLargest=largest;
                largest=arr[j];
            }
            else if (arr[j]>secondLargest){
                secondLargest=arr[j];
            }
        }
        System.out.println(secondLargest);
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
        Collections.sort(arr);
        System.out.println(" Number is :-"+ arr.get(k));


//            Integer[] j= hs.toArray(new Integer[hs.size()]);
//        System.out.println(j[k]);
    }
}