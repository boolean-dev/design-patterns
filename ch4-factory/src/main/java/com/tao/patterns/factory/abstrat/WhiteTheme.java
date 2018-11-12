package com.tao.patterns.factory.abstrat;

public class WhiteTheme implements ThemeFactory {
    @Override
    public Font createFont() {
        return new FangzhengFont();
    }

    @Override
    public Bubble createBubble() {
        return new WitheBubble();
    }

    @Override
    public Backgroud createBackgroud() {
        return new WitheBackgroud();
    }

    @Override
    public Icon createIcon() {
        return new WhiteIcon();
    }
}
