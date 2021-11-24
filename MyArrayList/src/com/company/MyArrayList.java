package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrayList {
    private Object[] a;
    private int size = 0;

    public MyArrayList() {
        a = new Object[size];
    }

    public MyArrayList(int size) {
        Scanner sc = new Scanner(System.in);
        a = new Object[this.size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + i + " элемент массива:");
            Object obj;
            obj = sc.next();
            add(obj);
        }
    }

    public void add(Object obj) {
        Object[] a1 = new Object[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            a1[i] = a[i];
        }
        a = a1;
        a[size] = obj;
        size++;
    }

    public void add(Object obj, int index) {
        Object[] a1 = new Object[a.length + 1];
        for (int i = 0; i < index; i++) {
            a1[i] = a[i];
        }
        a1[index] = obj;
        for (int i = index + 1; i < a.length + 1; i++) {
            a1[i] = a[i - 1];
        }
        a = a1;
        size++;
    }

    public void clear() {
        a = new Object[0];
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(a);
    }
}
