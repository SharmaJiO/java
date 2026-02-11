import java.util.*;
public class PassByReference {
    //creating a new data type
    public static class student {
        String name;

    }

    public static void change(student o) {
        o.name = "Sunny";
    }

    public static void main(String[] args) {
        student x = new student(); // declaration
        x.name = "Sumit";

        System.out.println(x.name);
        change(x);
        System.out.println(x.name);
    }
}

