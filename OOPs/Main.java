public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.performWork();

        Programmer p = new Programmer(); // Progeammer and tester are childern : so it is {Hierarchial Inheritance}
        p.performWork();

        Tester t = new Tester();
        t.performWork();

        // Employee is parent of both Programmer and Tester

    }

}
