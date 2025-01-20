package interfaceLogic;

import static interfaceLogic.interface2.interfaceStaticMethod;

public class baseClass {
    public static void main(String arg[]) {
        interface2 inter2 = new childClassInterface();
        childClassInterface inter = new childClassInterface();
        inter2.method1();
        inter2.method3(inter.testing, inter.a);
        inter2.method3("String",inter.a, 54);
        inter2.method3();
        inter2.interface2Method1("testing interface 2");
        inter2.interface2Method1();
        interfaceStaticMethod(); // we can call it but via import proper path of the file in import statement
    }
}
