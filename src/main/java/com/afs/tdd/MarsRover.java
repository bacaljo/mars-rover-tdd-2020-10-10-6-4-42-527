package com.afs.tdd;

import com.afs.tdd.property.Direction;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnRight() {
        int currentIndex = direction.ordinal();
        int lastIndex = Direction.values().length - 1;

        direction = (currentIndex == lastIndex)
                ? Direction.values()[0]
                : Direction.values()[currentIndex + 1];
    }

    public void turnLeft() {
        int currentIndex = direction.ordinal();
        int lastIndex = Direction.values().length - 1;

        direction = (currentIndex == 0)
                ? Direction.values()[lastIndex]
                : Direction.values()[currentIndex - 1];
    }

    public void move() {
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
            case WEST:
                x--;
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
