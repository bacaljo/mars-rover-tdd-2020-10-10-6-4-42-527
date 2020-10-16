package com.afs.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class RoverCommandExecutor {

    private final Map<String, Command> stringCommandMap;

    private final String MOVE = "M";
    private final String TURN_LEFT = "L";
    private final String TURN_RIGHT = "R";

    private final String EMPTY_STRING = "";
    private final String REGEX_INVALID_COMMANDS = String.format("[^%s|%s|%s]",
            MOVE, TURN_LEFT, TURN_RIGHT);

    public RoverCommandExecutor(MarsRover marsRover) {
        stringCommandMap = new HashMap<>();
        stringCommandMap.put(MOVE, marsRover::move);
        stringCommandMap.put(TURN_LEFT, marsRover::turnLeft);
        stringCommandMap.put(TURN_RIGHT, marsRover::turnRight);
    }

    public void commandRover(String commands) throws CommandNotDefinedException {
        validateCommands(commands);
        List<String> commandList = Arrays.asList(commands.split(EMPTY_STRING));
        commandList.forEach(command -> stringCommandMap.get(command).execute());
    }

    private void validateCommands(String commands) throws CommandNotDefinedException {
        Pattern pattern = Pattern.compile(REGEX_INVALID_COMMANDS);
        boolean hasInvalidCommands = pattern.matcher(commands).find();
        if (hasInvalidCommands) {
            throw new CommandNotDefinedException(String.format("Commands contained unsupported values. Only the following can be used: %s, %s and %s",
                    MOVE, TURN_LEFT, TURN_RIGHT));
        }
    }
}
