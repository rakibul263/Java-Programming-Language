import java.util.Scanner;

public class sum_avg_2 {
    public static float sum(int a, int b, float c){
        return a+b+c;
    }
    public static float avg(int a, int b, float c){
        return sum(a,b,c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = sc.nextFloat();

        float s = sum(a,b,c);
        float av = avg(a,b,c);
        System.out.println(s);
        System.out.println(av);
    }
}
