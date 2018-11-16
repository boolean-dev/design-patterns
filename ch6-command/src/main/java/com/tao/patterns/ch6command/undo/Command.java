package com.tao.patterns.ch6command.undo;

public abstract class Command {
    protected static int result = 0;
    protected int num = 0;

    abstract int execute(int num);
    abstract int undo();
}
