public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();
        /*
         * myObj.name = "Shuvo";
         * System.out.println(myObj.name);
         */
        myObj.setName("Shuvo");
        System.out.println(myObj.getName());
    }
}
// we cannot access the name;