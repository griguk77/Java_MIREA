import java.util.Scanner;

public class Main {

    public static class Person {
        private final static int MAX_AGE = 200;
        private final static double MAX_HEIGHT = 3.2;
        private int age;
        private double height;
        private String name;

        Person(int age, double height, String name) {
            this.age = age;
            this.height = height;
            this.name = name;
        }
        public void info() {
            System.out.println("age = " + this.age);
            System.out.println("height = " + this.height);
            System.out.println("name = " + this.name);
        }
        public boolean valid() {
            if (this.age > MAX_AGE || this.height > MAX_HEIGHT){
                return false;
            }
            else{
                return true;
            }
        }
        public void SetAge(int age) {
            this.age = age;
        }
        public void SetHeight(double height) {
            this.height = height;
        }
        public void SetName(String name) {
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

    public static void main(String[] args) {
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
        System.out.println("Возраст первого человека: " + one.GetAge());
        System.out.println("Рост первого человека: " + one.GetHeight());
        System.out.println("Имя первого человека: " + one.GetName());
        two.SetAge(15);
        two.SetHeight(2.3);
        two.SetName("Василий");
        System.out.println("Информация о втором человеке (обновлённая)");
        two.info();
        System.out.println("Корректность информации о первом человеке: " + one.valid());
        System.out.println("Корректность информации о втором человеке: " + two.valid());
    }
}
