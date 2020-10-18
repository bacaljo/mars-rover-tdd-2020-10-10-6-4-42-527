package com.afs.tdd.command;

import com.afs.tdd.Command;
import com.afs.tdd.MarsRover;

public class TurnRightCommand implements Command {
    private final MarsRover marsRover;

    public TurnRightCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnRight();
    }
}
