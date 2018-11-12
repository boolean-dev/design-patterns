package com.tao.patterns.factory;

import com.tao.patterns.factory.abstrat.Theme;
import com.tao.patterns.factory.abstrat.ThemeFactory;

public class QQClient {
    private ThemeFactory themeFactory;

    public QQClient(ThemeFactory themeFactory) {
        this.themeFactory = themeFactory;
    }

    public Theme createThem() {
        Theme theme = new Theme();
        theme.setBackgroud(themeFactory.createBackgroud());
        theme.setBubble(themeFactory.createBubble());
        theme.setFont(themeFactory.createFont());
        theme.setIcon(themeFactory.createIcon());
        return theme;
    }
}
