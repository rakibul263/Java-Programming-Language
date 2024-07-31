class Animal {
    protected void display() {
        System.out.println("This is the super class");
    }
}

class dog extends Animal {
    @Override
    public void display() {
        super.display();
        System.out.println("This is the subclass.");
    }
}

public class access_specifier {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();
    }
}
