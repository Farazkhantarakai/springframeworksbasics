package com.coupling.demo;

public class GameRunner {
    // this is tight coupling example
    SuperMario game;

    GameRunner(SuperMario gameGoing) {
        game = gameGoing;
    }

    public void run() {
        game.left();
        game.right();
        game.top();
        game.bottom();
    }

}
