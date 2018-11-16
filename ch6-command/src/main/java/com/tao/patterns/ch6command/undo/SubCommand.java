package com.tao.patterns.ch6command.undo;

public class SubCommand extends Command{

    private Suber suber = new Suber();

    @Override
    int execute(int value) {
        super.num = value;
        result = suber.subtraction(result, value);
        System.out.println("-" + value + "=" + result);
        return result;
    }

    @Override
    int undo() {
        result =  suber.subtraction(result, -num);
        return result;
    }
}
