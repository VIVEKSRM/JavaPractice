package polymorphism;


public class baseClass {
    public static void main (String arg[])
    {
        classA aa= new classA();
        classC cb= new classB(); // parent is classC and child is CLassB
        classC ca=new classA();// parent is classC and child is CLassA
        classC cc=new classC();
aa.method1("testingAA"); //A
cb.method1("testingCB"); //B
ca.method1("testingCA"); //A
ca.method1("testing"); //A
cc.method1("testingCC"); //C

        // Static methods will be called from parent clas
        cb.method2();
        ca.method2();
        cc.method2();
        aa.method2();

    }

}
