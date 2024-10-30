public class Main {
    public static void main(String[] args) {

        Box<Integer> b = new Box<>();
        b.setContent(4);
        System.out.println(b.getContent());

        Box<String> bs = new Box<>();
        bs.setContent("Hello");
        System.out.println(bs.getContent());
    }
}
