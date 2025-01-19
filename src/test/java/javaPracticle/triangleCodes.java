package javaPracticle;

import org.testng.annotations.Test;

public class triangleCodes {

    @Test
    public void TriangleCOdeTest0(){
/*
* * * * *
* * * *
* * *
* *
*/
        int number=5;
        for(int i = 0; i<=number; i++)
        {
            for (int j=i+1; j<=number; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    @Test
    public void triangleCodeTest1()
    {
        /*
               *
             * *
           * * *
         * * * *
         */
        //String str="*";
        int n = 5;
        for (int i=0 ; i<n; i++)  //2
        {
            for (int j=2*(n-i); j>0; j--){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    @Test
    public void triangleCodeTest2()
    {
        /*
        *
        * *
        * * *
        * * * *
         */
        //String str="*";
        int n = 5;
        for (int i=0 ; i<n; i++)
        {
            for (int j =0 ; j<i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    @Test
    public void triangleCodeTest3()
    {
        /*
               *
              * *
             * * *
            * * * *
         */
        //String str="*";
        int n=5;
        for(int i=0; i<=5; i++)
        {
            for(int k=n-i; k>0; k--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*      * * * * *
         * * * *
          * * *
           * *
            *
     */


    @Test
    public void invertedTriangle()
    {
        int number=5;
        for(int i = 0; i<=number; i++)
        {
            for(int k=i-1; k>=0; k--){
                System.out.print(" ");
            }

            for(int j=i+1;j<=number; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
