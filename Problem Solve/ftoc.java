import java.util.Scanner;

public class ftoc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int E = scanner.nextInt();
        int W = scanner.nextInt();

        for (int F = S; F <= E; F += W) {

            double C = (F - 32) * 5.0 / 9.0;

            int roundedCelsius;
            if (C >= 0) {
                roundedCelsius = (int) Math.floor(C);
            } else {
                roundedCelsius = (int) Math.ceil(C);
            }

            System.out.println(F + "\t" + roundedCelsius);
        }
    }
}
