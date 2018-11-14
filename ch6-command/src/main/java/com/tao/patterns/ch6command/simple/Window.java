package com.tao.patterns.ch6command.simple;

import java.util.ArrayList;
import java.util.List;

public class Window {

    private String title;
    private List<Button> buttons = new ArrayList<>();

    public Window(String title) {
        this.title = title;
    }

    public void addButton(Button button) {
        buttons.add(button);
    }

    public void removeButton(Button button) {
        buttons.remove(button);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }


    public void display() {
        System.out.println(title);
        for (Button button : buttons) {
            System.out.println(button.getName());
        }

        System.out.println("------------------");
    }
}
