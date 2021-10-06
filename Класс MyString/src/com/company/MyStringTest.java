package com.company;

public class MyStringTest {
    public static void MyStringTest(char[] c){
        MyString obj1 = new MyString(c);
        System.out.println(obj1.toString());
        char[] cc;
        cc = new char[]{' ', 'w', 'o', 'r', 'l', 'd', '!'};
        MyString obj2 = new MyString(cc);
        MyString obj3;
        obj3 = obj1.concat(obj2);
        System.out.println(obj3.toString());
        System.out.println(obj3.charAt(8));
        System.out.println(obj1.equals(obj3));
        char[] fake_cc;
        fake_cc = new char[]{' ', 'w', 'o', 'r', 'l', 'd', '!'};
        MyString fake_obj2 = new MyString(fake_cc);
        System.out.println(obj2.equals(fake_obj2));
        MyString obj3_red;
        obj3_red = obj3.trim();
        System.out.println(obj3_red.toString());
        System.out.println(obj3.isEmpty());
        char[] o;
        o = new char[]{' '};
        MyString empty_obj = new MyString(o);
        empty_obj = empty_obj.trim();
        System.out.println(empty_obj.isEmpty());
    }
}