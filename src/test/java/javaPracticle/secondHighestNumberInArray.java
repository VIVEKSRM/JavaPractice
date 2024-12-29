package javaPracticle;

import java.lang.reflect.Array;

public class secondHighestNumberInArray {

    public static void main(String[] agr) {
        int largest=0;
        int secondLargest=0;

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 4, 3, 2};
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
}