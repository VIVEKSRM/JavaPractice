package abstractionLogic;

public class baseClass {
    public static void main(String args[]) {
        abstractClass abs = new childClass();
        abs.Method1();
        abs.Method2("firstString",13,"secondString");
        abs.directMethod();
        abs.Method3("method3");
        abs.Method4("Stringdata", 10);
        abs.directMethod2("directMethod");
    }
}
