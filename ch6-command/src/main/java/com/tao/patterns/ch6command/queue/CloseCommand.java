package com.tao.patterns.ch6command.queue;

public class CloseCommand extends Command {

    private CloseHandler handler;

    CloseCommand() {
        handler = new CloseHandler();
    }

    @Override
    public void execute() {
        handler.open();
    }
}
