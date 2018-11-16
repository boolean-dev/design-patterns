package com.tao.patterns.ch6command.undo;

public class CalculatorForm {

    private Command command;

    public CalculatorForm(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void computer(int num) {
        int result = command.execute(num);
        System.out.println("计算结果为:" + result);
    }

    public void undo() {
        int result  = command.undo();
        System.out.println("后退的结果为：" + result);
    }
}
