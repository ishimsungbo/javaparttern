package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapMerge {
    public static void main(String[] args) {

        HashMap<String, Integer> fruits1 = new HashMap<>();
        fruits1.put("apple",100);
        fruits1.put("kiwi",200);
        fruits1.put("grape",300);

        System.out.println("HashMap : " +fruits1);

        HashMap<String, Integer> fruits2 = new HashMap<>();
        fruits1.put("banana",400);
        fruits1.put("kiwi",500);
        fruits1.put("melon",600);

        fruits1.putAll(fruits2);
        System.out.println("Updating HashMap: " + fruits1);

        fruits1.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("--");

        List<Fruis> fruis = new ArrayList<>();

        fruits1.forEach((k,v)->{
            //System.out.println(k);
            Fruis f = new Fruis(k,v);
            fruis.add(f);
        });

        System.out.println("--");

        System.out.println("값은 : "  + fruis.toString() );

    }
}

class Fruis{
    String name;
    int key;

    public Fruis(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
