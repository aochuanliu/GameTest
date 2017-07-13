package game.dotcombust;

import game.Game;

import java.util.ArrayList;

/**
 * Created by aoliu on 2017/7/9.
 */
public class DotComBust extends Game {
    DotComLocation location = new DotComLocation();
    ArrayList<DotCom> dotComs = new ArrayList<DotCom>();

    public DotComBust(){
        super("Dot Com Bust");
    }
    @Override
    public void gameRule(){
        System.out.println("you goal is to sink a dot coms:Pets.com ");
    }
    public void addDotCom(String name){
        DotCom dotCom1 = new DotCom();
        //dotCom1.setLocalDots(location.generateDotCom(3));
        dotCom1.setLocalDots(location.placeDotCom(3));
        dotCom1.setDotName(name);
        dotComs.add(dotCom1);
    }
    public void checkUserGuess(String location){
       // DotCom dot = new DotCom();
        String result = new String();
        for(DotCom dot : dotComs){
            result = dot.hitDot(location);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                System.out.println("the dot name : " + dot.getDotName());
                dotComs.remove(dot);
                break;
            }
        }
        System.out.println(result);
    }

    @Override
    public void startGame(){
        addDotCom("Pets.com");
        addDotCom("eToys.cpm");
        addDotCom("Go2.com");
        int count = 0;
        while(!dotComs.isEmpty()){
            String userEnter = location.getUserLocation1();
            checkUserGuess(userEnter);
            count++;
        }
        System.out.println("you took " + count +" times to guess");
    }
}
