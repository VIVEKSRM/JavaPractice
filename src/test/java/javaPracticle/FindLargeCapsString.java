package javaPracticle;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindLargeCapsString {

    @Test
    public void FindLargeCapsStringTest() {
        String str = "My Name is Vivek Ranjan";
        Integer smallCapsCount=0,largeCapsCount=0;
        ArrayList<Character> largeArr=new ArrayList<>();
        ArrayList<Character> smallArr=new ArrayList<>();
        char[] ch = str.toCharArray();
        System.out.println(" Small and Large Caps Numbers");
        for (int i = 0; i <= ch.length-1; i++) {
            if (ch[i] > 65 && ch[i] < 90) {
                largeArr.add(ch[i]);
                largeCapsCount++;
            }
            else{
                smallArr.add(ch[i]);
                smallCapsCount++;
            }
        }
        System.out.println("Total Small caps Numbers :-"+smallCapsCount);
        System.out.println(" Below are Characters :- "+smallArr);
        System.out.println("Total Large caps Numbers :-"+largeCapsCount);
        System.out.println(" Below are Characters :- "+largeArr);
    }
}
