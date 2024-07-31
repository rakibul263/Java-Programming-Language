class Animal {
    public void displayInfo() {
        System.out.println("This is the Animal super class");
    }
}

class dog extends Animal {
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is the subclass.");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.displayInfo();
    }

}
