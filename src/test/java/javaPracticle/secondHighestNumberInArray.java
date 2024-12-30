package javaPracticle;

import org.testng.annotations.Test;

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
}