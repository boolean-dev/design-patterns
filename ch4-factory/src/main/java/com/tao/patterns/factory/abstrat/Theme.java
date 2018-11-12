package com.tao.patterns.factory.abstrat;

public class Theme {

    private Font font;
    private Backgroud backgroud;
    private Icon icon;
    private Bubble bubble;

    public void display() {
        font.display();
        backgroud.display();
        icon.display();
        bubble.display();
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Backgroud getBackgroud() {
        return backgroud;
    }

    public void setBackgroud(Backgroud backgroud) {
        this.backgroud = backgroud;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public Bubble getBubble() {
        return bubble;
    }

    public void setBubble(Bubble bubble) {
        this.bubble = bubble;
    }
}
