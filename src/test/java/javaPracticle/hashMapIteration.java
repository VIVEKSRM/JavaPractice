package javaPracticle;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapIteration {
    @Test
    public void hashMapIterationUsingWhile()
    {
        HashMap<Integer,String> hm= new HashMap<>();
        for(int i=0; i<=10; i++)
            hm.put(i,"Test"+i);
        System.out.println(hm);
        Iterator itr=hm.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry me= (Map.Entry) itr.next();
            System.out.println("Map Key is :"+me.getKey()+" Value is :"+me.getValue());
        }
    }
}
