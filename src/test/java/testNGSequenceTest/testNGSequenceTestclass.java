package testNGSequenceTest;

import org.testng.annotations.Test;

public class testNGSequenceTestclass {

    @Test(priority = 1)
   public void method1()
    {
        System.out.println("From method 1");
    }

    @Test
    public void method2()
    {
        System.out.println("From method 2");
    }

    @Test(priority = -1)
    public void method3()
    {
        System.out.println("From method 3");
    }

    @Test(priority = 5)
    public void method4()
    {
        System.out.println("From method 4");
    }

    @Test(priority = 0)
    public void method5()
    {
        System.out.println("From method 5");
    }
    //3,2,5,1,4
}
