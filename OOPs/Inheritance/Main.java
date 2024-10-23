public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();
        e.submitTimesheet();
        e.bookVacation();

        System.out.println();

        Programmer p = new Programmer(); // Progeammer and tester are childern : so it is {Hierarchial Inheritance}
        p.writeCode();
        p.submitTimesheet();
        p.bookVacation();
        p.writeCode();

        System.out.println();

        Tester t = new Tester();
        t.submitTimesheet();
        t.bookVacation();
        t.testCode();

        // Employee is parent of both Programmer and Tester

    }

}
