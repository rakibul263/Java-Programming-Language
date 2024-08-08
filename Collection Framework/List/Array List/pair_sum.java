import java.util.ArrayList;

public class pair_sum {
    public static boolean pairSum(ArrayList<Integer> list, int targetValue) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if ((list.get(i) + list.get(j)) == targetValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targetValue = 11;
        boolean found = pairSum(list, targetValue);
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
