package com.tao.patterns.ch6command.simple;

public class Main {

    public static void main(String[] args) {
        Window window = new Window("窗口title");



        Button button1 = new Button("按钮1");
        button1.setCommand(new MiniCommand());
        Button button2 = new Button("按钮2");
        button2.setCommand(new HelpCommand());

        window.addButton(button1);
        window.addButton(button2);

        window.display();

        button1.onClick();
        button2.onClick();
    }
}
