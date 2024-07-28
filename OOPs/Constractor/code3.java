class Main {
    public String name;

    Main() {
        System.out.println("Constructor Called");
        name = "Shuvo";
    }
}

public class code3 {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println("My name is " + myObj.name);
    }
}
