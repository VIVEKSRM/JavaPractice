package interfaceLogic;

public class secondChildClass implements interface2{
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

    }

    @Override
    public void method3() {

    }

    @Override
    public void interface2Method1() {

    }

    @Override
    public void interface2Method1(String str) {

    }
}
