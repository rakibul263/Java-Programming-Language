import java.util.*;

public class stack_code {
    public static void main(String[] args) {
        Stack<String> Animal = new Stack<>();
        Animal.push("Tiger");
        Animal.push("Horse");
        Animal.push("Dog");
        Animal.push("Cat");

        System.out.println(Animal);

        System.out.println(Animal.peek());
        Animal.pop();
        System.out.println(Animal);

        System.out.println(Animal.peek());
    }
}
