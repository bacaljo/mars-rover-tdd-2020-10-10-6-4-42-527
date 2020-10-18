package com.afs.tdd.command;

import com.afs.tdd.Command;
import com.afs.tdd.MarsRover;

public class MoveCommand implements Command {
    private final MarsRover marsRover;

    public MoveCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.move();
    }
}
