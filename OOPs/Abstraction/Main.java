public class Main {
    public static void main(String[] args) {

        // Circle c = new Circle();

        Shape c = new Circle(); // we use this because it is more flexible and later on we can change the object
                                // also
        c.draw();
        c.printDetail();

        System.out.println();

        Shape s = new Square();
        s.draw();
        s.printDetail();
    }
}
