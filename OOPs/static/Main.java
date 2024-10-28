public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(0, "joe1");
        Student s2 = new Student(1, "joe2");

        System.out.println(Student.college);

        Student.changeCollege("SKIT");
        System.out.println(Student.college);

    }
}
