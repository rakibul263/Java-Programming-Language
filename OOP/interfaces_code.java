interface Animal {
    int eyes = 2;

    void walk();
}

interface Harvibore {

}

class Horse implements Animal, Harvibore {
    public void walk() {
        System.out.println("Horse on 4-legs");
    }
}

public class interfaces_code {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        // System.out.println(horse.eyes);
    }
}
