package com.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayTest {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Paris");
        items.add("Seoul");
        items.add("Tokyo");
        items.add("Washington");

        items.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println("--");

        items.forEach(name -> System.out.println(name));
    }
}
