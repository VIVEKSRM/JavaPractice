package abstractionLogic;

public class childClass extends abstractClass{

    @Override
    public void Method1() {
        { System.out.println("From childClass Method 1"); }
    }

    @Override
    public void Method2(String str, int i, String str3) {
        System.out.println("From childClass Method 2 with :- "+str+" int:- "+i+" str2 :- "+str3);
    }

    @Override
    public void Method3(String str) {
        System.out.println("From childClass Method 3: -"+str);
    }

    @Override
    public void Method4(String str, Integer i) {
        System.out.println("From childClass Method 4: -"+str+" int :- "+i);
    }

}
