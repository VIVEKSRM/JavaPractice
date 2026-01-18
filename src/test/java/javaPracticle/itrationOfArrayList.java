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

        // We can add element in between the arrays
        arr.add(8,112);
        arr.add(113);

        //Using Iterator
        Iterator arrIterator= arr.iterator();
        while (arrIterator.hasNext())
            System.out.println(arrIterator.next());

        // Using For-Each loop
        for(Integer i: arr )
        {
            System.out.println(i);
        }

        // Using For loop
        for(int j=0; j<arr.size(); j++)
            System.out.println(arr.get(j));

        //Using Lamda Expression
        arr.stream().forEach(n->System.out.println(n));
    }
}
