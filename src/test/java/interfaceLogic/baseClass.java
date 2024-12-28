package interfaceLogic;

public class baseClass {
    public static void main(String arg[]) {
        childClassInterface inter = new childClassInterface();
        inter.method1();
        inter.method3(inter.testing, inter.a);
        inter.method3("String",inter.a, 54);
        inter.method3();
        inter.interface2Method1("testing interface 2");
        inter.interface2Method1();
    }
}
