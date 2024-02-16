package com.coupling.demo;

import com.coupling.demo.tigetandloosecoupling.GamingConsole;

public class SuperMario implements GamingConsole {

    public void left() {
        System.err.println("Mario going left");
    }

    public void right() {

        System.out.println("Mario goin right");

    }

    @Override
    public void up() {
        System.out.println("Mario jumping");
    }

    @Override
    public void down() {
        System.out.println("Mario going into the whole");
    }

}
