package com.tao.patterns.ch6command.queue;

public class TakenCommand extends Command {

    private TakenHandler handler;

    public TakenCommand() {
        this.handler = new TakenHandler();
    }

    @Override
    public void execute() {
        handler.taken();
    }
}
