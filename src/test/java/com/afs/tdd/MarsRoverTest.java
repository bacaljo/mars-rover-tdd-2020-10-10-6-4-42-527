package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    private final char NORTH = 'N';
    private final char WEST = 'W';
    private final char SOUTH = 'S';
    private final char EAST = 'E';

    @Test
    void should_return_x_0_y_1_d_N_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_N_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.instructRover("M");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(1, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_W_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_N_and_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.instructRover("L");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_E_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_N_and_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        // when
        marsRover.instructRover("R");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_5_d_S_when_Mars_Rover_instruct_rover_given_x_0_y_6_d_S_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 6, SOUTH);

        // when
        marsRover.instructRover("M");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(5, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_E_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_S_and_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        // when
        marsRover.instructRover("L");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_W_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_S_and_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        // when
        marsRover.instructRover("R");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(WEST, marsRover.getDirection());
    }

    @Test
    void should_return_x_1_y_0_d_W_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_E_and_M() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        // when
        marsRover.instructRover("M");

        // then
        assertEquals(1, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(EAST, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_N_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_E_and_L() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        // when
        marsRover.instructRover("L");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(NORTH, marsRover.getDirection());
    }

    @Test
    void should_return_x_0_y_0_d_S_when_Mars_Rover_instruct_rover_given_x_0_y_0_d_E_and_R() {
        // given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        // when
        marsRover.instructRover("R");

        // then
        assertEquals(0, marsRover.getX());
        assertEquals(0, marsRover.getY());
        assertEquals(SOUTH, marsRover.getDirection());
    }
}
