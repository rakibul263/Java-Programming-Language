class Animal {
    class dog {
        // inner class
        public void displayInfo() {
            System.out.println("This is dog class");
        }
    }

    // static class
    static class bang {
        public void displayInfo() {
            System.out.println("This is bang class");
        }
    }
}

public class static_nasted_class {
    public static void main(String[] args) {
        Animal animal = new Animal();

        // object creation of the non static class || inner class
        Animal.dog newDog = animal.new dog();
        newDog.displayInfo();

        // object creation of the static nested class
        // super class.static nasted class object name = new super class.satatic nasted
        // class
        Animal.bang newBang = new Animal.bang();
        newBang.displayInfo();

    }
}
