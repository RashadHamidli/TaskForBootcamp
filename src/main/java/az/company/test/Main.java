package az.company.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("one");
        list.add(2);
        list.add("three");
        list.add(4);
        list.add("five");
        list.add(6);

        list.forEach(System.out::println);
        for (Object o : list) {
            if (o instanceof String)
                System.out.println("String value: " + o);
            else
                System.out.println("integer value: " + o);
        }
    }
}

