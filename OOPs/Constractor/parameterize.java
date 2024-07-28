class parameterize {
    String language;

    parameterize(String lang) {
        language = lang;
        System.out.println(language + " parameterize language.");
    }

    public static void main(String[] args) {
        parameterize myObj1 = new parameterize("Java");
        parameterize myObj2 = new parameterize("CPP");
        parameterize myObj3 = new parameterize("Python");
    }
}
