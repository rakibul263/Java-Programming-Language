public class methodOverloading {
    public static void display(int a) {
        System.out.println("got integer data");
    }

    public static void display(String st) {
        System.out.println("Got string data");
    }

    public static void main(String[] args) {
        display(5);
        display("Hello!");
    }
}
