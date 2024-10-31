public class Main {
    public enum dayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public static void printDays() {
            for (dayOfWeek day : values()) {
                System.out.println(day);
            }
        }
    }

    public static void doSomething(dayOfWeek day) {
        if (day == dayOfWeek.SUNDAY || day == dayOfWeek.SATURDAY) {
            System.out.println("Enjoy the weekend");
        } else {
            System.out.println("Work hard!");
        }
    }

    public static void main(String[] args) {
        doSomething(dayOfWeek.SUNDAY);
        doSomething(dayOfWeek.FRIDAY);
        System.out.println();

        System.out.println("Days are : ");
        dayOfWeek.printDays();
    }
}
