class Animal {
    public void displayInfo() {
        System.out.println("amimal class is a base class");
    }
}

class dog extends Animal {
    @Override // annotation
    public void displayInfo() {
        System.out.println("Dog class is the child class of the animal class.");
    }
}

public class override_code {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.displayInfo();
    }
}
