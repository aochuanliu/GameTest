package game.guess;

import game.Game;

import java.util.Scanner;

/**
 * Created by aoliu on 2017/7/1.
 */

public class GuessGame extends Game {
    private static int min = 0;
    private static int max = 9;
    private static int count = 3;
    public GuessGame(){
        super("Gusess Game");
    }
    @Override
    public void gameRule(){
        System.out.println("you have "+count +" players to gusee a num in "+min+" and "+max);
    }
    @Override
    public void startGame(){
        int num = (int)(Math.random()*10);
        int i=0;
        Player[] player = new Player[3];
        System.out.println(" start "+getGameName());

        while(i < count){
            System.out.println("please enter your name :");
            player[i] = new Player();
            Scanner sc = new Scanner(System.in);
            player[i].setPlayerName(sc.nextLine());
            player[i].guess();
            i++;
        }
        i=0;
        System.out.println("the num is "+ num);
        while(i < count){
            System.out.println("the player :"+player[i] + " gusee "+player[i].getGuessNumber());

            if(player[i].getGuessNumber() == num){
                System.out.println(" guess the num");
            }else{
                System.out.println(" failed!");
            }
            i++;

        }
    }
}
