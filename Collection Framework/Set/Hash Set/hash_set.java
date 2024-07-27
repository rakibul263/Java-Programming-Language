import java.util.*;

//  hash set print the value rendom order

public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(534);
        hs.add(43);
        hs.add(43);
        hs.add(43);

        System.out.println(hs);

        hs.remove(43);
        System.out.println(hs);

        System.out.println("543 here : " + hs.contains(534));

        hs.clear();
        System.out.println(hs);

        // check empty || nor
        System.out.println("Empty : " + hs.isEmpty());
    }
}
