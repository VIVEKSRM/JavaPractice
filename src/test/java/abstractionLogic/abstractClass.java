package abstractionLogic;

//we can create abstract class as public and default
 public abstract class abstractClass {
    public abstractClass()
    {
        System.out.println("From abstractClass Constructor Called");
    }
    abstract public void Method1();
    abstract public void Method2(String str, int i, String str2);
    abstract public void Method2(String str);
    abstract public void Method4(String str, Integer i);

    public void directMethod()
    {
        System.out.println("From abstractClass directMethod");
    }
    public void directMethod2( String str)
    {
        System.out.println("From abstractClass directMethod:- "+str);
    }
    public static void staticMethod(){
        System.out.println("From abstractClass staticMethod");
    }
}
abstract class abstractPublicClass {
    abstract public void Method1();
    abstract public void Method2();
}
