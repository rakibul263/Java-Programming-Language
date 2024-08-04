class Student {
    public void displayInfo() {
        System.out.println("This is the Student class.");
    }
}

class Teacher {
    public void anonymousClass() {
        // creation of anonymous class extending class Student
        Student studentObj = new Student() {
            @Override
            public void displayInfo() {
                System.out.println("This this the anoymous class");
            }
        };
        studentObj.displayInfo();
    }
}

public class anonymous_class_01 {
    public static void main(String[] args) {
        Teacher newClass = new Teacher();
        newClass.anonymousClass();
    }

}
