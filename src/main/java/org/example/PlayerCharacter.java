package org.example;

public class PlayerCharacter {

    static int x = 0, y = 0;


    public static int getX(){
        return x;
    }

    public static int getY(){
        return y;
    }

    public static boolean move(String direction){
        if(direction.equals("w") || direction.equals("W")){
            y++;
        }
        if(direction.equals("s") || direction.equals("S")){
            y--;
        }
        if(direction.equals("d") || direction.equals("D")){
            x++;
        }
        if(direction.equals("a") || direction.equals("A")){
            x--;
        }

        return y == 1 || y == -1 || x == 1 || x == -1;
    }

    public static void reset(){
        y = 0;
        x = 0;
    }
}
