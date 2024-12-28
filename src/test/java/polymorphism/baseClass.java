package polymorphism;


public class baseClass {
    public static void main (String arg[])
    {
        classA aa= new classA();
        classC cb= new classB(); // parent is classC and child is CLassB
        classC ca=new classA();// parent is classC and child is CLassA
        classC cc=new classC();
aa.method1("testingAA");
cb.method1("testingCB");
ca.method1("testingCA");
ca.method1("testing");
cc.method1("testingCC");

    }

}
