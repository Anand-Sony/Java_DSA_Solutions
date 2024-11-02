public class Main {
    public static void main(String[] args) {
        Address address = new Address("Mumbai", "India", "B-2 Andheri-East", 123);
        Person p = new Person("Person1", 21, address);

        System.out.println("Name : " + p.getName());
        System.out.println("Address : " + p.address.getCountry() + ", " + p.address.getCity() + ", "
                + p.address.getStreet() + ", " + p.address.getPostNumber());

    }

}
