package game.guess;

/**
 * Created by aoliu on 2017/7/9.
 */
public class Player {
    private String playerName;
    private int guessNumber;

    public void setPlayerName(String name){
        playerName = name;
    }
    public void guess(){
        System.out.println(" player: "+playerName+" is guessing");
        guessNumber = (int)(Math.random()*10);
    }
    public int getGuessNumber(){
        return guessNumber;
    }

    @Override
    public String toString() {
        return playerName;
    }
};
