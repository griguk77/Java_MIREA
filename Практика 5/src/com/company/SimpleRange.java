package com.company;

public class SimpleRange {
    public static void launch(int n) {
        if (n < 1){
            System.out.println("Элементы отстутствуют");
            return;
        }
        if (n != 1){
            launch(n-1);
        }
        System.out.print(n + " ");
    }
}
