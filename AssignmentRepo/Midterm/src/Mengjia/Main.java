package Mengjia;

import Mengjia.Question1.Book;
import Mengjia.Question1.Fiction;
import Mengjia.Question1.NonFiction;
import Mengjia.Question1.Reference;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Question 1:
        System.out.println("Question 1: ");
        Book harryPotter = new Fiction("Harry Potter", 50, "2003");
        harryPotter.setPrice(20);
        System.out.println("Book name: " + harryPotter.getTitle());
        System.out.println("Price: " + harryPotter.getPrice());
        System.out.println("Publish year: " + harryPotter.getPublishYear());
        System.out.println("Description:" + harryPotter.description());
        System.out.println();

        NonFiction math = new NonFiction("Math", 35, "2021");
        math.setBorrowDate(23);
        System.out.println("Book name: " + math.getTitle());
        System.out.println("Price: " + math.getPrice());
        System.out.println("Publish year: " + math.getPublishYear());
        System.out.println("Description:" + math.description());
        System.out.println();

        Book worldMaps = new Reference("World Maps", 12, "2016");
        System.out.println("Book name: " + worldMaps.getTitle());
        System.out.println("Price: " + worldMaps.getPrice());
        System.out.println("Publish year: " + worldMaps.getPublishYear());
        System.out.println("Description:" + worldMaps.description());
        System.out.println();

        //Question 2:
        System.out.println("Question 2: ");
        Printer p1;
        // refers to the only object of Database
        p1= Printer.getInstance();
        System.out.println(p1.getConnection());
        System.out.println();

        //Question 3:
        System.out.println("Question 3: ");
        int[] array = {1,2,4,4,6,7,3,3,3,0,9,7};
        System.out.println(getSum(array));
        System.out.println();

        //Question 4:
        System.out.println("Question 4: ");
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println();
    }

    public static int getSum(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);

            if(map.getOrDefault(array[i], 0) == 2){
                sum += array[i];
            }

        }
        return sum;
    }

    public static String lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0, start = 0, end = 0, len = 0;

        int i = 0, j = 0;

        while(end < s.length()){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);

            if(map.get(c) > 1){
                count++;
            }

            end++;
            while(count > 0){
                char l = s.charAt(start);
                if(map.get(l) > 1){
                    count--;
                }
                map.put(l, map.get(l) - 1);
                start++;
            }
            if(end - start > len){
                i = start;
                j = end;
                len = end - start;
            }
            len = Math.max(len, end - start);
        }
        return s.substring(i,j);
    }
}

