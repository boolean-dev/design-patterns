package com.tao.patterns.ch6command.simple;

public class HelpCommand  extends Command{

    private HelpHandler helpHandler = new HelpHandler();

    public HelpCommand() {
    }

    @Override
    void execute() {
        helpHandler.display();
    }
}
