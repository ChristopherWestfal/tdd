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
        return true;
    }
}
