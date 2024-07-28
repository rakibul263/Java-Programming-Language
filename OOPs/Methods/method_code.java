class Main {
    public int addNum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class method_code {
    public static void main(String[] args) {
        int num1, num2;
        num1 = 25;
        num2 = 54;

        Main myObj = new Main();
        int result = myObj.addNum(num1, num2);
        System.out.println(result);
    }
}
