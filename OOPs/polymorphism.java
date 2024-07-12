class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class polymorphism {
    // function overloading
    public static void main(String[] args) {
        Student s1 = new Student("Rakibul Hasan", 23);
        s1.printInfo(s1.name, s1.age);
    }
}
