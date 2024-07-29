class final_keyword {
    public final void display() {
        System.out.println("This is the final keyword");
    }
}

// Cannot override the final method from final_keyword
class final_keyword2 extends final_keyword {
    public final void display() {
        System.out.println("This code is error!!");
    }
}

public class code_2 {
    public static void main(String[] args) {

    }
}
