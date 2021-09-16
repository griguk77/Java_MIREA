package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //PersonTest.testPerson();
        //PersonExTest.testPersonEx();
        ClientTest.testClient();
        /*int age;
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
        /*System.out.println("Информация о первом человеке");
        one.info();
        System.out.println("Информация о втором человеке");
        two.info();*/
        /*System.out.println("Возраст первого человека: " + one.getAge());
        System.out.println("Рост первого человека: " + one.getHeight());
        System.out.println("Имя первого человека: " + one.getName());
        two.setAge(15);
        two.setHeight(2.3);
        try {
            two.setName("");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(two.getName());
        }
        /*System.out.println("Информация о втором человеке (обновлённая)");
        two.info();
        System.out.println("Корректность информации о первом человеке: " + one.isValid());
        System.out.println("Корректность информации о втором человеке: " + two.isValid());*/
    }
}