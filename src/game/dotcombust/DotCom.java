package game.dotcombust;

import java.util.ArrayList;

/**
 * Created by aoliu on 2017/7/12.
 */
public class DotCom {
    private ArrayList<String> localDots;
    private String dotName;
    public void setLocalDots(ArrayList<String> loc){
        System.out.println(loc);
        localDots = loc;
    }
    public void setDotName(String name){
        dotName = name;
    }
    public String hitDot(String userInput){
        String result = "miss";
        int index = localDots.indexOf(userInput);
        if(index >=0){
            localDots.remove(index);
            if(localDots.isEmpty()){
                result = "kill";
            }else{
                result = "hit";
            }
        }
        return result;
    }
    public String getDotName(){
        return dotName;
    }

}
