public class Student {
    int id;
    String name;
    static String college = "MNIT";

    static void changeCollege(String newCollegeName) {
        college = newCollegeName;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}