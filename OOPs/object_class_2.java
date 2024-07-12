class Student {
    String name;
    int age;

    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // without parameterize constractor
    Student() {
        System.out.println("Constractor Called");
    }

    // parameterize constractor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constractor |
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class object_class_2 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Rakibul Hasan";
        // s1.age = 24;
        Student s1 = new Student("Rakibul Hasan", 25);
        Student s2 = new Student(s1);
        s2.printData();
    }
}
