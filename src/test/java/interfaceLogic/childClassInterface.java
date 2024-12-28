package interfaceLogic;

public class childClassInterface implements interface2 {
    @Override
    public void method1() {
    System.out.println("Calling from method 1");
    }

    @Override
    public void method3(String str, int i) {
        System.out.println("Calling from method 2 :-"+str+" int :- "+i);
    }

    @Override
    public void method3(String str, int i, int r) {
        System.out.println("Calling from method 3 :-"+str+" int :- "+i+" second int:- "+r);
    }

    @Override
    public void method3() {
        System.out.println("Calling from method 3");
    }

    @Override
    public void interface2Method1() {
        System.out.println("Calling from interface2Method1");
    }

    @Override
    public void interface2Method1(String str) {
        System.out.println("Calling from interface2Method1 :- "+str);
    }
}
