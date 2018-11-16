package com.tao.patterns.ch6command.undo;

public class AddCommand extends Command {

    private Adder adder = new Adder();


    @Override
    int execute(int value) {
        result =  adder.add(result, value);
        super.num = value;
        System.out.println("+" + value + "=" + result);
        return result;
    }

    @Override
    int undo() {
        result =  adder.add(result, -num);
        return result;
    }
}
