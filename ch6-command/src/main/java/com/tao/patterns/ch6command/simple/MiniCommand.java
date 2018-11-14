package com.tao.patterns.ch6command.simple;

public class MiniCommand extends Command {

    private WindowHandler windowHandler = new WindowHandler();

    @Override
    void execute() {
        windowHandler.minimize();
    }
}
