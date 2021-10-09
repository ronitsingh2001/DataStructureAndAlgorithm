package OOPS;

public class Basics {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
        // p1.saysHi();
        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
        // p2.saysHi();
        // Person p3 = p1;
        // p3.age=90;
        // p3.saysHi();
        p1.saysHi();
        p2.saysHi();
        swap(p1, p2);
        p1.saysHi();
        p2.saysHi();
    }

    public static void swap(Person p1, Person p2) {
        /// GAME 1
        // Person temp = p1;
        // p1=p2;
        // p2=temp;

        /// GAME 2
        // int age =p1.age;
        // p1.age=p2.age;
        // p2.age=age;
        // String name=p1.name;
        // p1.name=p2.name;
        // p2.name=name;

        // GAME 3
        p1 = new Person();
        int age = p1.age;
        p1.age = p2.age;
        p2.age = age;
        
        p2 = new Person();

        String name = p1.name;
        p1.name = p2.name;
        p2.name = name;
    }

    public static class Person {
        int age;
        String name;

        void saysHi() {
            System.out.println(name + "[" + age + "] Says Hi!");
        }
    }
}
