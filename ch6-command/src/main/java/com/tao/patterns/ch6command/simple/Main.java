package com.tao.patterns.ch6command.simple;


/**
 * 项目需求
 *
 * 窗口中有几个按钮，用户可自定义按钮的功能
 * 本例中按钮的功能有窗口最小化、打开帮助文档
 */
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
