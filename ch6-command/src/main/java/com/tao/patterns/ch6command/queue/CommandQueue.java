package com.tao.patterns.ch6command.queue;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {

    private List<Command> commands;

    public CommandQueue() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
