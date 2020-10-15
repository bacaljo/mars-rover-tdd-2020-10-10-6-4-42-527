package com.afs.tdd;

public class MarsRover {
    private int x;
    private int y;
    private char direction;

    private final char NORTH = 'N';
    private final char WEST = 'W';
    private final char SOUTH = 'S';
    private final char EAST = 'E';

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
        } else if (instructions.equals("R")) {
            turnRight();
        }
    }

    private void turnRight() {
        switch (direction) {
            case NORTH:
                direction = EAST;
                break;
            case EAST:
                direction = SOUTH;
                break;
            case SOUTH:
                direction = WEST;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case SOUTH:
                direction = EAST;
                break;
            case EAST:
                direction = NORTH;
                break;
        }
    }

    private void move() {
        switch (direction) {
            case NORTH:
                y++;
                break;
            case SOUTH:
                y--;
                break;
            case EAST:
                x++;
                break;
        }
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
