package javaPracticle;


public class recursiveFn {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum recursion :-"+result); // recursive Sum method
        System.out.println(" Factorial :- "+factorial(10));
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


}
