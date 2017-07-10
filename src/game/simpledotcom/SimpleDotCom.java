package game.simpledotcom;

import game.Game;

import java.util.Scanner;

/**
 * Created by aoliu on 2017/7/10.
 */
public class SimpleDotCom  extends Game {
    private final int numMax = 7;
    private final int allPoint = 3;
    private int enterCount;
    private int hitedNum;
    public SimpleDotCom(){
        super("Simple Dot Com game");
        hitedNum = 0;
        enterCount = 0;
    }

    @Override
    public void startGame() {
        int startPointNum = numMax-allPoint;
        int getRandomNum = ((int)(Math.random()*10)% startPointNum);
        DotCom dotCom = new DotCom(getRandomNum);
        do{
            System.out.println("please enter a number in 0-6");
            Scanner sc = new Scanner(System.in);

            if(dotCom.hitPoint(sc.nextInt())){
                hitedNum++;
                System.out.println(" hit ");
            }else{
                System.out.println("miss");
            }
            enterCount++;
        }while(hitedNum < allPoint);
        System.out.println("kill");
        System.out.println("you took "+ enterCount +" hit the Dot Com");
    }

    @Override
    public void gameRule() {
        System.out.println("you need hit a Dot Com, which need three serial points in 0-6 ");
    }

}
