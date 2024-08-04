class book {
    class physics {
        public void displayInfo() {
            System.out.println("Physics is a very hard subject for HSC student");
        }
    }

    // static nasted class
    static class Math {
        public void displayInfo() {
            System.out.println("Math is my frvt subject");
        }
    }
}

public class static_nasted_class_2 {
    public static void main(String[] args) {
        book newBook = new book();

        // for inner class
        book.physics newPhy = newBook.new physics();
        newPhy.displayInfo();

        // for nasted class
        book.Math newMath = new book.Math();
        newMath.displayInfo();
    }
}
