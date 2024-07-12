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

public class Inheritence {
    public static void main(String[] args) {
        // Triangle t1 = new Triangle();
        // t1.area(5, 4);
    }
}
