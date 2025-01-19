package polymorphism;

public class classA extends classC{
    public void method1(String str)
    {
        System.out.println("Calling from classA :- " +str);
    }
    public static void method2(){
        System.out.println("Calling from classA Static Method ");
    }
}
