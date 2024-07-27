import java.util.*;

//  linked hash set print the value in samne order of the input && remove the duplicate value

public class treeSet {
    public static void main(String[] args) {
        Set<Integer> hs = new TreeSet<>();
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
