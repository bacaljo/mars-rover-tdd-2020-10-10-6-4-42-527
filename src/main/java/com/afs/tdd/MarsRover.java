package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

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

    public void instructRover(String instructions) throws CommandNotDefinedException {
        validateInstructions(instructions);
        List<String> instructionList = parseInstructions(instructions);
        performInstructions(instructionList);
    }

    private void performInstructions(List<String> instructionList) {
        for (String instruction : instructionList) {
            switch (instruction) {
                case "M":
                    move();
                    break;
                case "L":
                    turnLeft();
                    break;
                case "R":
                    turnRight();
                    break;
            }
        }
    }

    private List<String> parseInstructions(String instructions) {
        return Arrays.asList(instructions.split(""));
    }

    private void validateInstructions(String instructions) throws CommandNotDefinedException {
        boolean isValid = instructions.replace("M", "")
                .replace("L", "")
                .replace("R", "")
                .trim()
                .isEmpty();
        if (!isValid) {
            throw new CommandNotDefinedException();
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
            case WEST:
                direction = NORTH;
                break;
        }
    }

    private void turnLeft() {
        switch (direction) {
            case NORTH:
                direction = WEST;
                break;
            case WEST:
                direction = SOUTH;
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

    public char getDirection() {
        return direction;
    }
}
