package com.tao.patterns.ch6command.undo;

/**
 * 命令模式的undo
 *
 * 一个加减法计算器
 * 可连续进行加减，但是undo只能进行一次，否则数据会出现错误
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.fun1();

    }

    private void fun1() {
        Command command = new AddCommand();


        CalculatorForm calculatorForm = new CalculatorForm(command);
        calculatorForm.computer(10);
        calculatorForm.computer(5);
        calculatorForm.undo();

        command = new SubCommand();
        calculatorForm.setCommand(command);
        calculatorForm.computer(3);
        calculatorForm.computer(4);
        calculatorForm.undo();
        //undo只能后退一步
//        calculatorForm.undo();


    }
}
