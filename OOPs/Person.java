public class Person {
    String name;
    int age;

    // to access the below code(constructor) : we have to make a default constructor
    Person() {
        this.name = "";
        this.age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person name : " + name + "\nage : " + age);
    }
}
