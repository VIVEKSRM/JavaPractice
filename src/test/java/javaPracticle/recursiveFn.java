package javaPracticle;


public class recursiveFn {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum recursion :-"+result); // recursive Sum method
        System.out.println(" Factorial :- "+factorial(10));

        //recursiveFn rf=new recursiveFn();
        System.out.println(checkAge(45));
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int factorial(int k)
    {
        if (k==0)
        {
            return 1;
        }
        else{
            return k*factorial(k-1);
        }
    }

    static boolean checkAge(int age) {
        boolean flag=true;
        if (age < 18) {
            flag=false;
          throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
        return flag;
    }

}
