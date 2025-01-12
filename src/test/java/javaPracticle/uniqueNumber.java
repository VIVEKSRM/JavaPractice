package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class uniqueNumber {
    @Test
    public void uniqueNumberTest()
    {
    int num[]={4,4,5,6,7,2,2,7,6,8};
        ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0; i<num.length; i++)
    {
        int k=0;
        if(!arr.contains(num[i])) {
            arr.add(num[i]);
            k++;
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    k++;
                }
            }
        }
        if(k==1){
            System.out.println("Print unique Number :"+num[i]);
        }
    }

    }
}
