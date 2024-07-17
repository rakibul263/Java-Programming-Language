public class public_vs_static {
    static void myStaticMain() {
        System.out.println("Static method can be called without creating a object");
    }

    public void myPublicMain() {
        System.out.println("Public method can not be call without creating a object");
    }

    public static void main(String[] args) {
        myStaticMain();
        public_vs_static p1 = new public_vs_static();
        p1.myPublicMain();
    }
}
