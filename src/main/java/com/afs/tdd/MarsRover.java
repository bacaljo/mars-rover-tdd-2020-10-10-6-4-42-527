package com.afs.tdd;

import com.afs.tdd.property.Direction;

public class MarsRover {
    private int locationX;
    private int locationY;
    private Direction direction;

    public MarsRover(int locationX, int locationY, Direction direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public void turnRight() {
        int nextLogicalIndex = (direction.ordinal() + 1) % Direction.values().length;
        direction = Direction.values()[nextLogicalIndex];
    }

    public void turnLeft() {
        int length = Direction.values().length;
        int nextLogicalIndex = (direction.ordinal() - 1 + length) % length;
        direction = Direction.values()[nextLogicalIndex];
    }

    public void move() {
        int index = direction.ordinal();
        int directionCount = Direction.values().length;

        locationY += (index % 2 == 0) ? ((index + 2) % directionCount) - 1 : 0;
        locationX += (index % 2 == 1) ? ((index + 1) % directionCount) - 1 : 0;
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public Direction getDirection() {
        return direction;
    }
}
