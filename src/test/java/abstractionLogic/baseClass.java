package abstractionLogic;

public class baseClass {
    public static void main(String args[]) {
        abstractClass abs = new childClass();
       // childClass abs = new childClass();
        abs.Method1();  //child
        abs.Method2("firstString",13,"secondString");  //secondchild
        abs.directMethod(); // from child class
        abs.Method2("method2"); // child class
        abs.Method4("Stringdata", 10);  //child class
        abs.directMethod2("directMethod"); //parent abstract class
        abs.staticMethod();//At the time of object creation what ever class name is on left side, Static method will be called from that

        childClass.staticMethod();
    }
}
