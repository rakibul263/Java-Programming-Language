import java.util.*;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(123);
        adq.addFirst(34);
        adq.addLast(43);

        System.out.println(adq);
    }
}
