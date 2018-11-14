package com.tao.patterns.ch6command.simple;

public class Button {

    private Command command;
    private String name;

    public Button(String name) {
        this.name = name;
    }

    public void onClick() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
