package com.company;

public class PersonEx {
    private final static int MAX_AGE = 200;
    private final static double MAX_HEIGHT = 3.2;
    private int age;
    private double height;
    private String name;

    PersonEx(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void SetAge(int age) throws Exception {
        if (age > MAX_AGE || age <= 0) {
            throw new Exception("Возраст некорректен");
        }
        this.age = age;
    }
    public void SetHeight(double height) throws Exception {
        if (height > MAX_HEIGHT || height <= 0) {
            throw new Exception("Возраст некорректен");
        }
        this.height = height;
    }
    public void SetName(String name) throws Exception {
        if (name.isEmpty()){
            throw new Exception("Строка пуста");
        }
        this.name = name;
    }
    public int GetAge() {
        return this.age;
    }
    public double GetHeight() {
        return this.height;
    }
    public String GetName() {
        return this.name;
    }
}