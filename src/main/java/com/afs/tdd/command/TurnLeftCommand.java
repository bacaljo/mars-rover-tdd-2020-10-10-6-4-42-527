package com.afs.tdd.command;

import com.afs.tdd.Command;
import com.afs.tdd.MarsRover;

public class TurnLeftCommand implements Command {
    private final MarsRover marsRover;

    public TurnLeftCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnLeft();
    }
}
