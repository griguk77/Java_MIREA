package com.company;

public class ABRange {
    public static void launch(int a, int b){
        if (a == b){
            System.out.print(a + " ");
        }
        if (a < b){
            launch(a, b-1);
            System.out.print(b + " ");
        }
        else if (a > b){
            launch(a, b+1);
            System.out.print(b + " ");
        }
    }
}