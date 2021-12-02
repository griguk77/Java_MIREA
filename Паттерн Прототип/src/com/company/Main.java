package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovablePoint mp1 = new MovablePoint(2, 1, 3, -4);
        mp1.moveUp();
        mp1.moveDown();
        mp1.moveLeft();
        mp1.moveRight();
        MovablePoint mp2 = new MovablePoint(0,0,0,0);
        System.out.println(mp1.toString());
        System.out.println(mp2.toString());
        mp2 = mp1.prototype();
        System.out.println(mp1.toString());
        System.out.println(mp2.toString());

        System.out.println();

        MovableCircle mc1 = new MovableCircle(2, 1, 3, -4, 5, mp1);
        mc1.moveUp();
        mc1.moveDown();
        mc1.moveLeft();
        mc1.moveRight();
        MovablePoint mp0 = new MovablePoint(0,0,0,0);
        MovableCircle mc2 = new MovableCircle(0,0,0,0,0, mp0);
        System.out.println(mc1.toString());
        System.out.println(mc2.toString());
        mc2 = mc1.prototype();
        System.out.println(mc1.toString());
        System.out.println(mc2.toString());
    }
}
