package com.afs.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static com.afs.tdd.property.Direction.EAST;
import static com.afs.tdd.property.Direction.NORTH;
import static com.afs.tdd.property.Direction.SOUTH;
import static com.afs.tdd.property.Direction.WEST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MarsRoverTest {

    private final String MOVE = "M";
    private final String TURN_LEFT = "L";
    private final String TURN_RIGHT = "R";

    private final String INVALID_COMMAND_LETTER = "F";
    private final String INVALID_COMMAND_NUMBER = "1";

    @Test
    void should_return_x_0_y_1_d_N_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_N_and_M() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(MOVE);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_W_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_N_and_L() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_E_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_N_and_R() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_5_d_S_when_Rover_Command_Executor_command_rover_given_x_0_y_6_d_S_and_M() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 6, SOUTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(MOVE);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(5, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_E_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_S_and_L() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_W_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_S_and_R() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_1_y_0_d_E_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_E_and_M() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(MOVE);

        // then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_N_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_E_and_L() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_S_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_E_and_R() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_5_y_0_d_W_when_Rover_Command_Executor_command_rover_given_x_6_y_0_d_W_and_M() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(6, 0, WEST);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(MOVE);

        // then
        assertEquals(5, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_S_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_W_and_L() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, WEST);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_LEFT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_N_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_W_and_R() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(0, 0, WEST);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(TURN_RIGHT);

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    void should_throw_a_command_not_defined_exception_when_Rover_Command_Executor_command_rover_given_x_0_y_0_d_W_and_invalid_commands() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        Executable executables = () -> {
            roverCommandExecutor.commandRover(INVALID_COMMAND_LETTER);
            roverCommandExecutor.commandRover(INVALID_COMMAND_NUMBER);
            roverCommandExecutor.commandRover(String.format("%s%s%s%s%s%s%s",
                    TURN_RIGHT, MOVE, INVALID_COMMAND_LETTER, MOVE, INVALID_COMMAND_NUMBER, MOVE, TURN_LEFT));
        };

        // then
        assertThrows(CommandNotDefinedException.class, executables);
    }

    @Test
    void should_return_x_4_y_6_d_N_when_Rover_Command_Executor_command_rover_given_x_5_y_5_d_N_and_MLMR() throws CommandNotDefinedException {
        // given
        MarsRover marsRover = new MarsRover(5, 5, NORTH);
        RoverCommandExecutor roverCommandExecutor = new RoverCommandExecutor(marsRover);

        // when
        roverCommandExecutor.commandRover(String.format("%s%s%s%s", MOVE, TURN_LEFT, MOVE, TURN_RIGHT));

        // then
        assertEquals(4, marsRover.getX());
        assertEquals(6, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }
}
