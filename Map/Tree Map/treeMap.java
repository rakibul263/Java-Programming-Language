import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new TreeMap<>(); // sorting large to small
        // log (N)
        numbers.put("one", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Five", 5);
        numbers.put("Four", 4);

        numbers.putIfAbsent("Two", 23);

        System.out.println(numbers);

        // Iterration
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e);
            System.out.println();
        }

        System.out.println();

        for (String key : numbers.keySet()) {
            System.out.println(key);
        }
        for (Integer Value : numbers.values()) {
            System.out.println(Value);
        }

    }
}
