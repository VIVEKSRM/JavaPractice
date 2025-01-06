package javaPracticle;

import java.util.*;

public class ObjectInArrayList {
//https://www.geeksforgeeks.org/how-objects-can-an-arraylist-hold-in-java/

    public static void main(String[] args) {
        // Make Person data-type objects
        Person p1 = new Person(15,"Aditya", 19, "US");
        Person p2 = new Person(19,"Shivam", 19, "UK");
        Person p3 = new Person(27, "Anuj", 15, "Canada");

        // Create an ArrayList object
        //(Declaring List of Person type)
        ArrayList<Person> names = new ArrayList<Person>();

        // Adding objects to the ArrayList
        names.add(p1);
        names.add(p2);
        names.add(p3);

        // Print and display the elements of adobe ArrayList
        // using get() method
        for (int i=0; i<names.size(); i++){

            if (names.get(i).age==19)
                System.out.println(names.get(i).name +" has age as :"+names.get(i).age);

            if ((names.get(i).name).equals("Anuj"))
                System.out.println(names.get(i).name +" has age as :"+names.get(i).age);

            if (names.get(i).age<19)
                System.out.println("Employee ID :"+names.get(i).id+" with Name: "+names.get(i).name +" has age less than 19 :"+names.get(i).age);

        }
/*        System.out.println(names.get(0).name);
        System.out.println(names.get(0).age);
        System.out.println(names.get(1).name);
        System.out.println(names.get(1).age);
        System.out.println(names.get(2).name);
        System.out.println(names.get(2).age);*/

        // New Line
        System.out.println();

        // Optional Part for better understanding
        System.out.println(
                "Optional Part Added For Better Understanding");

        // (Optional)
        // Displaying what happens if printed by simply
        // passing List object as parameter
        System.out.println(names);
    }
}

// Class user-defined
class Person {

    // Random properties associated with the person
    // Person name
    String name;
    // Person age
    int age;
    String country;
    int id;

    // Constructor for class Person
    // for initializing objects
    Person(int id, String name, int age, String country)
    {
        // This keyword for efering to current object
        this.name = name;
        this.age = age;
        this.id = id;
        this.country = country;
    }
}