package com.tao.patterns.factory.abstrat;

public class BlueTheme implements ThemeFactory {
    @Override
    public Font createFont() {
        return new SongFont();
    }

    @Override
    public Bubble createBubble() {
        return new BlueBubble();
    }

    @Override
    public Backgroud createBackgroud() {
        return new BlueBackgroud();
    }

    @Override
    public Icon createIcon() {
        return new BlueIcon();
    }
}
