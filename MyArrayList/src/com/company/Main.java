package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList x1 = new MyArrayList();
        System.out.println("Размер массива: " + x1.size());
        System.out.println(x1.toString());
        System.out.println(x1.isEmpty());
        x1.add(3);
        x1.add(5);
        x1.add(9);
        System.out.println(x1.toString());
        x1.add('e', 1);
        x1.add("ops", x1.size());
        System.out.println(x1.toString());
        x1.clear();
        System.out.println("Размер массива: " + x1.size());
        System.out.println(x1.toString());
        x1.add('e', 0);
        x1.add("ops", x1.size());
        System.out.println("Размер массива: " + x1.size());
        System.out.println(x1.toString());

        MyArrayList x2 = new MyArrayList(3);
        System.out.println("Размер массива: " + x2.size());
        System.out.println(x2.toString());
        System.out.println(x2.isEmpty());
        x2.add(3);
        x2.add(5);
        x2.add(9);
        System.out.println(x2.toString());
        x2.add('e', 1);
        x2.add("ops", x2.size());
        System.out.println(x2.toString());
        x2.clear();
        System.out.println("Размер массива: " + x2.size());
        System.out.println(x2.toString());
        x2.add('e', 0);
        x2.add("ops", x2.size());
        System.out.println("Размер массива: " + x2.size());
        System.out.println(x2.toString());
    }
}
