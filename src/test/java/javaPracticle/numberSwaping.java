package javaPracticle;

import org.testng.annotations.Test;

public class numberSwaping {
    @Test
    public void numberSwapingWithThirdNumber()
    {
       int x=1;
       int y=4;
       int z ;

       z=y+x;
       y=z-y;
       x=z-x;

        System.out.println(" Printing new Y: -"+y+" Printing new X:- "+x);
    }
    @Test
    public void numberSwapingWithOutThirdNUmber()
    {
        int x=1;
        int y=4;

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println(" Printing new Y: -"+y+" Printing new X:- "+x);
    }
}
