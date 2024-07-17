import OOPs.Pakage.bank_account;

//this is our basic class
class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

// this is our derived class
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(.5 * l * h);
    }
}

public class code {
    public static void main(String[] args) {

    }
}
