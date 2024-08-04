interface Student {
    public void displayInfo();
}

class Teacher {
    public void anonymousClass() {
        // creation of anonymous class extending class Student
        Student studentObj = new Student() {
            public void displayInfo() {
                System.out.println("This this the anoymous class");
            }
        };
        studentObj.displayInfo();
    }
}

public class anonymous_class_02 {
    public static void main(String[] args) {
        Teacher newClass = new Teacher();
        newClass.anonymousClass();
    }

}
