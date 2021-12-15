package Mengjia.Question1;

import Mengjia.Main;
import Mengjia.Question1.iRobot;

public final class Roomba implements iRobot {
    int[][] room;
    int i;
    int j;
    Main.Direction dir;

    public Roomba(int[][] room) {
        this.room = room;
        i = 0;
        j = 0;
        dir = Main.Direction.DOWN;
    }

    @Override
    public boolean move() {

        int nextI = 0;
        int nextJ = 0;
        if(dir == Main.Direction.DOWN){
            nextI = i + 1;
        } else if(dir == Main.Direction.UP){
            nextI = i - 1;
        } else if(dir == Main.Direction.LEFT){
            nextJ = j - 1;
        } else{
            nextJ = j + 1;
        }

        //out of boundary or blocked
        if(nextI < 0 || nextI >= room.length || nextJ < 0 || nextJ >= room[0].length || room[nextI][nextJ] == -1){
            return false;
        }
        //can move and move to new position
        else{
            i = nextI;
            j = nextJ;
            return true;
        }

    }

    @Override
    public void turnLeft() {
        if(dir == Main.Direction.DOWN){
            dir = Main.Direction.RIGHT;
        } else if(dir == Main.Direction.UP){
            dir = Main.Direction.LEFT;
        } else if(dir == Main.Direction.LEFT){
            dir = Main.Direction.DOWN;
        } else{
            dir = Main.Direction.UP;
        }
    }

    @Override
    public void turnRight() {
        if(dir == Main.Direction.DOWN){
            dir = Main.Direction.LEFT;
        } else if(dir == Main.Direction.UP){
            dir = Main.Direction.RIGHT;
        } else if(dir == Main.Direction.LEFT){
            dir = Main.Direction.UP;
        } else{
            dir = Main.Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[i][j] = 1;
    }
}
