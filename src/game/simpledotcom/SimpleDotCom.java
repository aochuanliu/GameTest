package game.simpledotcom;

import game.Game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aoliu on 2017/7/10.
 */
public class SimpleDotCom  extends Game {
    private final int numMax = 7;
    private final int allPoint = 3;
    private int enterCount;
    public SimpleDotCom(){
        super("Simple Dot Com game");;
        enterCount = 0;
    }

    @Override
    public void startGame() {
        //int startPointNum = numMax-allPoint;
        int getRandomNum = (int)(Math.random()*5);
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add((Integer)getRandomNum);
        array.add((Integer)getRandomNum+1);
        array.add((Integer)getRandomNum+2);
        DotCom dotCom = new DotCom(array);
        Scanner sc = new Scanner(System.in);
        String result;
        do{
            System.out.println("please enter a number in 0-6");

            result = dotCom.hitPoint(sc.nextInt());
            System.out.println(result);
            enterCount++;
            if(result.equals("kill")){
                System.out.println("you took "+ enterCount +" hit the Dot Com");
                break;
            }
        }while(true);

    }

    @Override
    public void gameRule() {
        System.out.println("you need hit a Dot Com, which need three serial points in 0-6 ");
    }

}
