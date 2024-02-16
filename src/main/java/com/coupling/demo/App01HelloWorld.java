package com.coupling.demo;

public class App01HelloWorld {

    public static void main(String[] args) {

        // var game1 = new SuperMario();
        var game = new SuperCantra();
        var game3= new Pacman();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }

}
