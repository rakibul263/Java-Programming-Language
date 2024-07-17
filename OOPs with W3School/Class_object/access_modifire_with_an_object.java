public class access_modifire_with_an_object {
    public void fullThrottle() {
        System.out.println("Hello Java");
    }

    public void maxSpeed(int speed) {
        System.out.println("Max Speed " + speed);
    }

    public static void main(String[] args) {
        access_modifire_with_an_object a1 = new access_modifire_with_an_object();
        a1.fullThrottle();
        a1.maxSpeed(45);
    }
}
