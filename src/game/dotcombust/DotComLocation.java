package game.dotcombust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aoliu on 2017/7/12.
 */
public class DotComLocation {
    private int gridSize = 49;
    private int gridLenth = 7;
    private String buf = "ABCDEFG";
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    public ArrayList<String> generateDotCom( int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attampts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if((comCount %2) == 1){
            incr = gridLenth;
        }
        while(!success && attampts++ < 200){
            location = (int) (Math.random() * gridLenth);
            int x = 0;
            success = true;
            while(success && x < comSize){
                if(grid[location] == 0){
                    coords[x++] = location;
                    location += incr;
                    if(location >= gridSize){
                        success = false;
                    }
                    if(x>0 &&(location % gridLenth ==0)){
                        success = false;
                    }
                }else{
                    success = false;
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        while(x<comSize){
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLenth);
            column = coords[x] % gridLenth;
            temp = String.valueOf(buf.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        int selectWhitch =(int)(Math.random()*2);
        int selectGrid = (int)(Math.random()*(gridLenth-3));
        int selectNoChange = (int)(Math.random()*gridLenth);
        int row = 0;
        String colum = null;
        int x =0;
        while(x < comSize){
            if(selectGrid ==0){
                colum = String.valueOf(buf.charAt(selectNoChange));
                row= selectGrid++;
            }else{
                colum = String.valueOf(buf.charAt(selectGrid++));
                row = selectNoChange;
            }
            alphaCells.add(colum.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
    public String getUserLocation(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public String getUserLocation1(){
        String inputLine = null;
        System.out.print("Enter a guess ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        }catch (IOException e){
            System.out.println("IOException : "+ e);
        }
        return inputLine;
    }
}
