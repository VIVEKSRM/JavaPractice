package javaPracticle;

import org.testng.annotations.Test;

public class multiDimentionalArrays {
    @Test
    public void multiDimentionalArraysTest(){
        //Array 1
        int[][] arr=new int[2][2];
        arr[0][0]=2;
        arr[0][1]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);

        // Array 2
        int[][][] arr1=new int[2][2][3];
        arr1[0][0][0]=2;
        arr1[0][0][1]=3;
        arr1[0][0][2]=3;
        arr1[0][1][0]=4;
        arr1[0][1][1]=5;
        arr1[0][1][2]=3;
        arr1[1][0][0]=2;
        arr1[1][0][1]=3;
        arr1[1][0][2]=3;
        arr1[1][1][0]=4;
        arr1[1][1][1]=5;
        arr1[1][1][2]=3;
        System.out.println(arr1);
        System.out.println(arr1[0][0][1]);
        System.out.println(arr1[1][0][2]);

        //Array 3
        int b[][]={{1,2},{3,4}};
        int u[][]={{1},{3}};
        int c[][]={{1,2,6,8},{3,4,5,7}};
        //int d[][][]={{1,2,6,7},{3,4,5,9},{9,8,7,5}};
        for(int i=0; i<c.length; i++)
        {
            for(int k=0; k<=3; k++)
            {
                System.out.print(c[i][k]+" ");
            }
            System.out.println("");
        }

    }
}
