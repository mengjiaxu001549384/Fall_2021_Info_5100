package Mengjia;

import java.util.*;
import java.util.GregorianCalendar;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Q1
        Q1 q1 = new Q1();
        q1.setRoomba();

        //Q2
        System.out.println("Q2: get anagrams");
        Q2 q2 = new Q2();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = q2.getAnagrams(strs);
        for(List<String> list: res){
            System.out.println(list);
        }

        System.out.println();
        //Q3
        System.out.println("Q3: number of subarray equals to k");
        Q3 q3 = new Q3();
        System.out.println(q3.getSubarrayEqualsToK(new int[]{1,1,1}, 2));

        System.out.println();

        //Q4
        System.out.println("Q4: Netflix");
        Q4 q4 = new Q4();
        //(1)
        System.out.println("(1) add Classic, and then print out");
        q4.addClassic();
        System.out.println();

        //(2)
        System.out.println("(2) get latest three movies");
        q4.getLatestThreeMovies();
        System.out.println();

        //(3)
        System.out.println("(3) set predicate");
        q4.setPredicate();
        System.out.println();

        //(4)
        System.out.println("(4) add release year to title");
        q4.addReleaseYearToTitle();
        System.out.println();

        //(5)
        System.out.println("(5) sort use comparator");
        System.out.println("Sort by title");
        q4.sortUseComparator();
        System.out.println();


    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }


}
