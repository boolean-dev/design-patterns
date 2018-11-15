package com.tao.patterns.ch6command.queue;

/**
 * 命令队列的实现
 *
 * 把冰箱关进冰箱的三件事情
 * 1.打开冰箱门
 * 2.把大象放入冰箱
 * 3.关闭冰箱门
 */
public class Main {

    public static void main(String[] args) {

        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(new OpenCommand());
        commandQueue.addCommand(new TakenCommand());
        commandQueue.addCommand(new CloseCommand());

        Invoker invoker = new Invoker(commandQueue);
        invoker.call();
    }
}
