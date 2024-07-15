class Person {
    String name;
    int age;
    static int count;

    public Person() {
        count++;
        System.out.println("Constractor is created");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void eat() {
        System.out.println(name + " is eating");
    }

}

public class code {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Shuvo";
        p1.age = 24;

        Person p2 = new Person();
        p2.name = "Rakibul";
        p2.age = 32;

        p1.walk();
        p1.eat();

        p2.walk();
        p2.eat();

        System.out.println(Person.count);

    }
}
