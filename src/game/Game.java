package game;

import game.guess.GuessGame;
import game.simpledotcom.SimpleDotCom;

/**
 * Created by aoliu on 2017/7/9.
 */
public class Game {
    private String gameName;
    public static Game selectGame(int choose){
        switch (choose) {
            case 1: {
                System.out.println("you select a Guees game");
                return new GuessGame();
            }
            case 2:{
                System.out.println(" you select a Simple Dot Com");
                return new SimpleDotCom();
            }
            default:
                return null;
        }
    }
    public static void gameInfo(){
        System.out.println( "welcome to Game function");
        System.out.println("please select game number");
        System.out.println("1. Guess");
        System.out.println("2. Simple Dot Com");
        System.out.println("0. Exit");
    }
    public Game(String name){
        gameName = name;
    }
    public String getGameName(){
        return gameName;
    }
    public void gameRule(){}
    public void startGame(){
        System.out.println("this is a null game");
    }

    @Override
    public String toString() {
        return gameName;
    }

    public void overGame(){
        System.out.println("the game "+toString()+" is over");
    }
}
