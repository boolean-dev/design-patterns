package com.tao.patterns.factory.abstrat;

public interface ThemeFactory {
    Font createFont();
    Bubble createBubble();
    Backgroud createBackgroud();
    Icon createIcon();
}
