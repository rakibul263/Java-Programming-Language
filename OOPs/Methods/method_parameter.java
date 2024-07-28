class Main {
    public void display(int a) {
        System.out.println("Parameter here...");
    }

    public void display() {
        System.out.println("No-Parameter here...");
    }
}

public class method_parameter {
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.display();
        myObj.display(5);
    }
}
