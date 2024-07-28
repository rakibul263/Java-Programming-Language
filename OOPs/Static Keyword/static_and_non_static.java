class staticOrNot {
    int muti(int a, int b) {
        return a * b;
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

public class static_and_non_static {
    public static void main(String[] args) {
        staticOrNot myObj = new staticOrNot();
        System.out.println("multiply 4*4  is : " + myObj.muti(2, 2));
        System.out.println("Sum 2+2 is : " + staticOrNot.sum(2, 5));
    }
}
