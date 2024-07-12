class shape {
    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends shape {
    public void area(int l, int h) {
        System.out.println(.5 * l * h);
    }
}

class Circle extends shape {
    public void area(int r) {
        System.out.println((3.1416) * r * r);
    }
}

public class Hierarchial_Inheritance {
    public static void main(String[] args) {

    }
}
