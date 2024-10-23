class Human{
    int age;
    String name;
    int salary;
    boolean married;

    public Human(int umar , String naam , int kamaya , boolean shadi){
        this.age = umar;
        this.name = naam;
        this.salary = kamaya;
        this.married = shadi;
        /* 
        if you don't use "this" and intialize details of human x then
        when you intialize details of y then it will affect the details of x because they are not independent objects.
        */
    }
    public static void main(String[] args) {
        Human h = new Human(25, "Joe", 500000, true);
        System.out.println(h.name + " is " + h.age + " years old and earns " + h.salary + " dollars per year" + " and he is " + h.married + " in marriage.");
    }
}