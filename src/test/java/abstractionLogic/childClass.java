package abstractionLogic;

public class childClass extends secondChildClass{
public childClass()
{
    System.out.println("From childClass Constructor Called");
}
    @Override
    public void Method1() {
        { System.out.println("From childClass Method 1"); }
    }
    @Override
    public void Method2(String str) {
        System.out.println("From childClass Method 2: -"+str);
    }

    @Override
    public void Method4(String str, Integer i) {
        System.out.println("From childClass Method 4: -"+str+" int :- "+i);
    }
    @Override
    public void directMethod(){
        System.out.println("From childClass directMethod");
    }

    //Static Method cant be over ride
    public static void staticMethod(){
        System.out.println("From childClass staticMethod");
    }
}
