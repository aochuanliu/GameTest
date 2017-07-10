package game.simpledotcom;

/**
 * Created by aoliu on 2017/7/10.
 */
public class DotCom {
    private int point1;
    private int point2;
    private int point3;

    public DotCom(int point){
        point1 = point;
        point2 = ++point;
        point3 = ++point;
    }
    public boolean hitPoint( int enterNum){
        if(enterNum == point1){
            return true;
        }else if(enterNum == point2){
            return true;
        }else if(enterNum == point3){
            return true;
        }
        return false;
    }
}
