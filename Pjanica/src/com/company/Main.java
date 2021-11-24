package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> deck1 = new ArrayList<Integer>();
        ArrayList<Integer> deck2 = new ArrayList<Integer>();
        System.out.println("Введите 5 карт игрока 1:");
        for (int i = 0; i < 5; i++) {
            deck1.add(sc.nextInt());
        }
        System.out.println("Введите 5 карт игрока 2:");
        for (int i = 0; i < 5; i++) {
            deck2.add(sc.nextInt());
        }
        boolean f = false;

        for (int i = 0; i < 106; i++) {
            if (((deck1.get(0) > deck2.get(0)) && !((deck1.get(0) == 9) && (deck2.get(0) == 0))) || ((deck1.get(0) == 0) && (deck2.get(0) == 9))) {
                deck1.add(deck1.get(0));
                deck1.add(deck2.get(0));
            } else if (((deck1.get(0) < deck2.get(0)) && !((deck1.get(0) == 0) && (deck2.get(0) == 9))) || ((deck1.get(0) == 9) && (deck2.get(0) == 0))) {
                deck2.add(deck1.get(0));
                deck2.add(deck2.get(0));
            }
            deck1.remove(0);
            deck2.remove(0);
            if (deck1.size() == 0) {
                System.out.println("second " + (i+1));
                f = true;
                break;
            }
            if (deck2.size() == 0) {
                System.out.println("first " + (i+1));
                f = true;
                break;
            }
        }
        if (!f) {
            System.out.println("botva");
        }
    }
}
