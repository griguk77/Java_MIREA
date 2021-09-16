package com.company;

import java.util.Scanner;

public class PersonTest {
    public static void testPerson() {
        System.out.println("Тестирование класса Person:");
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

        Person one = new Person(age, height, name);
        Person two = new Person(0, 0, "");
        System.out.println("Информация о первом человеке");
        one.info();
        System.out.println("Информация о втором человеке");
        two.info();
        System.out.println("Возраст первого человека: " + one.getAge());
        System.out.println("Рост первого человека: " + one.getHeight());
        System.out.println("Имя первого человека: " + one.getName());
        two.setAge(15);
        two.setHeight(2.3);
        two.setName("Иван");
        System.out.println("Информация о втором человеке (обновлённая)");
        two.info();
        System.out.println("Корректность информации о первом человеке: " + one.isValid());
        System.out.println("Корректность информации о втором человеке: " + two.isValid());
    }
}