package org.example;

public class ClassLogicTest {
    // we cannot create final and abstract classes inside a class
    private static class ClassTest
    {
        final class FinalClassTest {
            //Class inside Class - we cant create public class
            abstract class ClassTest2 { }
            class PlainClass{ }
        }
        static abstract class ClassTest2 { }
        static final class finalClassTest {}
    }
    public static class ClassTest3
    {    static final class ClassTest {
        //Class inside Class - we cant create public class
        static abstract class ClassTest2 { }
        class PlainClass{

        }
    }}
    static class ClassTest6
    { }
    private class ClassTest4
    { }
    public class ClassTest5
    { }
    class ClassTest2
    { }
    public void method1()
    {
        //inside methods if we create a public class it will not be created. only plain/final/abstract classes we can create
        class ClassTest {
            //Class inside Class - we cant create public class
            class ClassTest2 { }
        }
        abstract class ClassTest3 {
            //Class inside Class - we cant create public class
            final class ClassTest4 { }
        }   } }
//we cant create public class in the same java file, normal only class we can create in the same java file.
class Class2inSameFile{
    public void method1()
    {
        //inside methods if we create a public class it will not be created. only plain/final/abstract classes we can create
        final class ClassTest {
            //Class inside Class - we cant create public class
            abstract class ClassTest2 { }
        }
    }
}
