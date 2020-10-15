package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private char direction;

    public MarsRover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void instructRover(String instructions) {
        if (instructions.equals("M")) {
            move();
        } else if (instructions.equals("L")) {
            turnLeft();
        }
    }

    private void turnLeft() {
        if (direction == 'N') {
            direction = 'W';
        }
    }

    private void move() {
        y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }
}
