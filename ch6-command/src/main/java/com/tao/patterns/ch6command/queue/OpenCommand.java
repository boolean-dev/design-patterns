package com.tao.patterns.ch6command.queue;

public class OpenCommand extends Command {

    private OpenHandler handler;

    public OpenCommand() {
        this.handler = new OpenHandler();
    }

    @Override
    public void execute() {
        handler.open();
    }
}
