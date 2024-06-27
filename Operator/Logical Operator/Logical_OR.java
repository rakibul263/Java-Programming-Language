public class Logical_OR {
    public static void main(String args[]) {
        // logical OR
        System.out.println("Logical AND: ");
        System.out.println("one statement True and One Statement True : " + ((5 > 2) || (3 < 10)));
        System.out.println("one statement True and One Statement False : " + ((5 > 2) || (5 < 2)));
        System.out.println("one statement False and One Statement True : " + ((5 < 2) || (5 > 2)));
        System.out.println("one statement False and One Statement False : " + ((5 < 2) || (5 < 2)));
    }
}
