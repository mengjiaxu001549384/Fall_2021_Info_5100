package Mengjia;

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
