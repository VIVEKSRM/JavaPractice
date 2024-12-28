package org.example;

public class StaticLogicTest {
    static String sVar1;
    static int iVar1;
    public static void method1()
    {
        //'static' not allowed here
        String sVar1;
        int iVar1;
    }
    public void method2()
    {
        //'static' not allowed here
        String sVar1;
        int iVar1;
    }

}
