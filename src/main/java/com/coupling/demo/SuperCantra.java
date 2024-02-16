package com.coupling.demo;

import com.coupling.demo.tigetandloosecoupling.GamingConsole;

public class SuperCantra implements GamingConsole {
    public void left() {
        System.err.println(" Super Cantra going left");
    }

    public void right() {

        System.out.println("Super Cantra goin right");

    }

    @Override
    public void up() {
        System.out.println("Super Cantra jumping");
    }

    @Override
    public void down() {
        System.out.println("Super Cantra going into the whole");
    }
}
