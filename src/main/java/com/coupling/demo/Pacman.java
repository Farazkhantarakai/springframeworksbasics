package com.coupling.demo;

import com.coupling.demo.tigetandloosecoupling.GamingConsole;

public class Pacman implements GamingConsole {

    @Override
    public void up() {
        System.err.println("Pacman going up");
    }

    @Override
    public void down() {
        System.err.println("Pacman going into whole");
    }

    @Override
    public void left() {
        System.err.println("Pacman going left");
    }

    @Override
    public void right() {
        System.err.println(" Pacman going right");
    }

}
