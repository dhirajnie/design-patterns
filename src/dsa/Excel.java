package dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Excel {

    public static void main(String[] args) {
        Consumer<String> c =(a)-> System.out.println(a);
        Consumer<String> b =(a)-> System.out.println(a.toUpperCase());
        Consumer<String> combined = c.andThen(b);
        List<String> list = new ArrayList<>();
        list.add("Dhiraj");
        list.forEach(c.andThen(b));

}
