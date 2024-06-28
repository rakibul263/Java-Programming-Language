
/* 
 * press 1: fan on
 * press 2: light on
 * press 3: wifi on
 * default: connection lost
 */
import java.util.*;

public class switch_case {
    public static void main(String args[]) {
        System.out.println("Press any Number: ");
        Scanner sc = new Scanner(System.in);
        int press = sc.nextInt();

        switch (press) {
            case 1: {
                System.out.println("Fan ON");
                break;
            }
            case 2: {
                System.out.println("Light ON");
                break;
            }
            case 3: {
                System.out.println("WiFi ON");
                break;
            }
            default: {
                System.out.println("Connection Lost");
                break;
            }
        }
    }
}
