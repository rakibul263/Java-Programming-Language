public class myClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Lunak";
        p1.age = 18;

        Person p2 = new Person();
        p2.name = "Rahim";
        p2.age = 17;

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        p1.eat();
        p1.walk();

        p2.eat();
        p2.walk();
    }
}

class Person {
    String name;
    int age;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void walk() {
        System.out.println(name + " is wolk.");
    }
}