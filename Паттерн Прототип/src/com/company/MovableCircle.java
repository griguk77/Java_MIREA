package com.company;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public MovableCircle prototype() {
        return new MovableCircle(x, y, xSpeed, ySpeed, radius, center);
    }

    public String toString() {
        return ("MovableCircle{" + "x = " + x + ", y = " + y + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed + ", radius = " + radius + ", center = " + center + '}');
    }
}
