package Mengjia.Question1;

import Mengjia.Question1.Roomba;

public class Q1 {
    public void setRoomba(){
        int[][] room = new int[][]{
                {0,0,0,0,0,0,0},
                {0,1,0,0,0,-1,0},
                {0,0,1,0,0,1,0},
                {0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,-1,0,0,0,0},
                {0,0,0,0,-1,0,0}};
        Roomba roomba = new Roomba(room);
    }
}
