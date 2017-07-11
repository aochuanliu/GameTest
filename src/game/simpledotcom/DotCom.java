package game.simpledotcom;

import java.util.ArrayList;

/**
 * Created by aoliu on 2017/7/10.
 */
public class DotCom {
    //private int NUM = 3;
    private ArrayList<Integer> point;
    //private boolean[] pointHited = new boolean[NUM];


    public DotCom(ArrayList<Integer> _point){
        //int i;
        //point= new int [] (NUM);
        //pointHited = new int [](NUM);
        point=_point ;
      /*  for(int i= 0; i<NUM;i++){
            pointHited[i] = false;
        }*/
    }
    /*
    public String hitPoint( int enterNum){
        String result;
        for(int i=0;i<NUM;i++){
            if(enterNum == point[i]) {
                if (pointHited[i] == true) {
                    return "already hited";
                }
                pointHited[i] = true;
                for(int j= 0;j <NUM;j++){
                    if(pointHited[j]!=true){
                        return "hit";
                    }
                }
                return "kill";
            }
        }
        return "miss";
    }*/
    public String hitPoint(int entePoint){
        String result = "miss";
        int index=point.indexOf((Integer)entePoint);
        if(index >= 0){
            point.remove(index);
            if(point.isEmpty()){
                result = "kill";
            }else
                result = "hit";
        }
        return result;
    }
}
