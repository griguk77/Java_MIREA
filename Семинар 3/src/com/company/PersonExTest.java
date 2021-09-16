package com.company;

import java.util.Scanner;

public class PersonExTest {
    public static void testPersonEx() throws Exception {
        System.out.println("Тестирование класса PersonEx:");
        Scanner sc = new Scanner(System.in);
        int age;
        double height;
        String name;
        System.out.println("Введите возраст первого человека");
        age = sc.nextInt();
        System.out.println("Введите рост первого человека");
        height = sc.nextDouble();
        System.out.println("Введите имя первого человека");
        name = sc.next();

        PersonEx one = new PersonEx(age, height, name);
        PersonEx two = new PersonEx(0, 0, "");
        System.out.println("Возраст первого человека: " + one.getAge());
        System.out.println("Рост первого человека: " + one.getHeight());
        System.out.println("Имя первого человека: " + one.getName());
        System.out.println("Возраст второго человека: " + two.getAge());
        System.out.println("Рост второго человека: " + two.getHeight());
        System.out.println("Имя второго человека: " + two.getName());
        two.setAge(15);
        two.setHeight(2.3);
        two.setName("Иван");
        System.out.println("Информация о втором человеке (обновлённая)");
        System.out.println("Возраст второго человека: " + two.getAge());
        System.out.println("Рост второго человека: " + two.getHeight());
        System.out.println("Имя второго человека: " + two.getName());
    }
}