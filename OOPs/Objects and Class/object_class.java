class pen {
    // properties of this object (pen)
    String color;
    String type; // bolpoint || gel pen

    public void write() {
        System.out.println("This is a new pen");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

public class object_class {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Red";
        pen1.type = "bolpoint";
        // pen1.write();
        pen1.printColor();
        pen1.printType();

        System.out.println();

        pen pen2 = new pen();
        pen2.color = "Green";
        pen2.type = "gelpen";
        pen2.printColor();
        pen2.printType();

    }
}
