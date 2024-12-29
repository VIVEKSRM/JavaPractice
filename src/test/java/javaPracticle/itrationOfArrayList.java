package javaPracticle;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class itrationOfArrayList {

    @Test
    public void itrationOfArrayListUsingLoops()
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i =0; i<=10; i++)
            arr.add(i);

        Iterator arrIterator= arr.iterator();
        while (arrIterator.hasNext())
            System.out.println(arrIterator.next());

        for(Integer i: arr )
        {
            System.out.println(i);
        }

        for(int j=0; j<=arr.size(); j++)
            System.out.println(j);
    }
}
