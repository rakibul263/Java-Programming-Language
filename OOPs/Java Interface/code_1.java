interface Polygon {
    void getArea(int height, int breadth);
}

class Rectangle implements Polygon {
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}

public class code_1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(4, 5);
    }

}
