public class basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        // p1.color = "Blue";
        // System.out.println(p1.color);
        // p1.tip = 5;
        // System.out.println(p1.tip);
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(4);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}