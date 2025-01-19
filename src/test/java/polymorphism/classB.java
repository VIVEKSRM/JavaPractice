package polymorphism;

public class classB extends classC{
    public void method1(String str)
    {
        System.out.println("Calling from classB:- "+str);
    }
    public static void method1(){
        System.out.println("Calling from classB Static Method ");
    }
}
