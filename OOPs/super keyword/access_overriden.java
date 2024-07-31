class Animal {
    public void displayInfo() {
        System.out.println("This is the superclass");
    }
}

class dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("This is the subclass");
    }

    public void printDisplay() {
        displayInfo();
    }
}

public class access_overriden {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.printDisplay();
    }
}
