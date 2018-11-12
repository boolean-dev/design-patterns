package com.tao.patterns.factory.abstrat;

import com.tao.patterns.factory.QQClient;

public class Main {
    public static void main(String[] args) {
        QQClient qqClient = new QQClient(new WhiteTheme());
        Theme theme = qqClient.createThem();
        theme.display();

    }
}
