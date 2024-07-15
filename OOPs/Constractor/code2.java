class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getinfo() {
        System.out.println(this.name + " " + this.age);
    }
}

public class code2 {

    public static void main(String[] args) {
        Person p1 = new Person("Shuvo", 24);
        p1.getinfo();
    }
}