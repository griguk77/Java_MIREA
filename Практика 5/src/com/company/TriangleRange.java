package com.company;

public class TriangleRange {
    public static void launch (int n){
        if (n < 1){
            System.out.println("Элементы отстутствуют");
            return;
        }
        if (n != 1){
            launch(n-1);
        }
        for (int i = 0; i < n; i++){
            System.out.print(n + " ");
        }
    }
}
