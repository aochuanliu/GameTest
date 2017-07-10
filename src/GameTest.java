import game.Game;


import java.util.Scanner;

/**
 * Created by aoliu on 2017/7/1.
 */
public class GameTest {
    private int gameChoose;
    private void runGame( Game game){
        if(game != null){
            game.gameRule();
            game.startGame();
            game.overGame();
        }else{
            System.out.println("the game  is not supported");
            System.out.println("please select game again");
        }
    }
    private void runTest(){
        Game.gameInfo();
        selectgame();
        if(gameChoose<= 0){
            System.out.println(" exit game");
            return;
        }
        Game game = Game.selectGame(gameChoose);
        runGame(game);
        runTest();
     }
     private void selectgame(){
         Scanner choose = new Scanner(System.in);
         gameChoose = choose.nextInt();
         System.out.println("gameChoose:"+gameChoose);
     }
    public static void main(String[] args) {
        GameTest gameTest = new GameTest();
        gameTest.runTest();
    }
}
