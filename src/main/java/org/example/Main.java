package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        //map ключ-значение (например толковый словарь)
        //ключем будет стринга имя фрукта, значение кол-во символов в названии фрукта
        //порядок произвольный
        Map<String,Integer> fruits2 = new HashMap<>();
        fruits2.putIfAbsent("apple", 5);

        fruits2.put("apple", 4);
        fruits2.put("peach", 5);
        fruits2.put("pine", 3);
        System.out.println(fruits2);








        //set
        // проядок произвольный, но можно юзать TreeSet для сортировки
        Set<String> fruits1 = new HashSet<>();
        fruits1.add("apple");
        fruits1.add("cherry");
        fruits1.add("peach");
        fruits1.add("pineapple");
        fruits1.add("apple");
        System.out.println(fruits1);


        //list
        // базовый список

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("cherry");
        fruits.add(1, "peach");
        fruits.add("pineapple");
        fruits.add("apple");
        System.out.println(fruits);
    }

}
