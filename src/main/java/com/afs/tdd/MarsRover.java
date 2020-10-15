package com.afs.tdd;

import com.afs.tdd.property.Direction;

import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private int x;
    private int y;
    private Direction direction;

    private final String MOVE = "M";
    private final String TURN_LEFT = "L";
    private final String TURN_RIGHT = "R";

    private final String EMPTY_STRING = "";

    public MarsRover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void commandRover(String commands) throws CommandNotDefinedException {
        validateCommands(commands);
        List<String> commandList = parseCommands(commands);
        performCommands(commandList);
    }

    private void performCommands(List<String> commandList) {
        for (String command : commandList) {
            switch (command) {
                case MOVE:
                    move();
                    break;
                case TURN_LEFT:
                    turnLeft();
                    break;
                case TURN_RIGHT:
                    turnRight();
                    break;
            }
        }
    }

    private List<String> parseCommands(String commands) {
        return Arrays.asList(commands.split(EMPTY_STRING));
    }

    private void validateCommands(String commands) throws CommandNotDefinedException {
        boolean isValid = commands.replace(MOVE, EMPTY_STRING)
                .replace(TURN_LEFT, EMPTY_STRING)
                .replace(TURN_RIGHT, EMPTY_STRING)
                .trim()
                .isEmpty();
        if (!isValid) {
            throw new CommandNotDefinedException(String.format("Commands contained unsupported values. Only the following can be used: %s, %s and %s",
                    MOVE, TURN_LEFT, TURN_RIGHT));
        }
    }

    private void turnRight() {
        int currentIndex = direction.ordinal();
        int lastIndex = Direction.values().length - 1;

        direction = (currentIndex == lastIndex)
                ? Direction.values()[0]
                : Direction.values()[currentIndex + 1];
    }

    private void turnLeft() {
        int currentIndex = direction.ordinal();
        int lastIndex = Direction.values().length - 1;

        direction = (currentIndex == 0)
                ? Direction.values()[lastIndex]
                : Direction.values()[currentIndex - 1];
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

    public Direction getDirection() {
        return direction;
    }
}
