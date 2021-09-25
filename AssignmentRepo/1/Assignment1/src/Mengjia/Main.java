package Mengjia;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Question 1:
        int[] nums1 = {1,1,4,5,7,5,4,7,2,9};
        int[] nums2 = {8,34,6,4,234,54,54,123,234};
        System.out.println("Question 1: ");
        System.out.println(uniqueSum(nums1));
        System.out.println(uniqueSum(nums2));

        //Question 2:
        int[] nums3 = {-4,-1,0,3,10};
        int[] nums4 = {-5,-3,-1,2,4,6,7,8};
        System.out.println("Question 2: ");
        printArray(squaresSort(nums3));
        printArray(squaresSort(nums4));

        //Question 3:
        int[] nums5 = {2,3,4,2,2,3,5,7};
        int[] nums6 = {4,6,7,4,3,5,8,2};
        System.out.println("Question 3: ");
        System.out.println(findNonRepeat(nums5));
        System.out.println(findNonRepeat(nums6));

        //Question 4:
        String ransomNote1 = "aa", magazine1 = "aab";
        String ransomNote2 = "asdfg", magazine2 = "asdqwertyuio";
        System.out.println("Question 4: ");
        System.out.println(cutMagazine(ransomNote1, magazine1));
        System.out.println(cutMagazine(ransomNote2, magazine2));

        //Question 5:
        String str1 = "1A3d4s5t";
        String str2 = "A2bb2d4";
        System.out.println("Question 5: ");
        System.out.println(check(str1));
        System.out.println(check(str2));
    }


    //Question 1:
    //You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
    //Return the sum of all the unique elements of nums.

    public static int uniqueSum(int[] nums){
        Map<Integer, Integer> map = new HashMap();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int sum = 0;
        for(int key: map.keySet()){
            if(map.get(key) == 1) sum += key;
        }
        return sum;
    }


    //Question 2:
    //Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
    public static int[] squaresSort(int[] nums){
        int[] res = new int[nums.length];
        int start = 0, end = nums.length - 1, i = nums.length - 1;
        while(i >= 0){
            int left = nums[start] * nums[start];
            int right = nums[end] * nums[end];
            if(left > right){
                res[i--] = left;
                start++;
            } else{
                res[i--] = right;
                end--;
            }
        }
        return res;
    }

    public static void printArray(int[] nums){
        for(int i: nums) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }

    //Question 3
    // Find first non repeated integer in an array.
    public static int findNonRepeat(int[] nums){
        Map<Integer, Integer> map = new HashMap();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i: nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1;
    }

    //Question 4:
    //Given two stings and, return true if can be constructed from magazine and false otherwise.

    public static boolean cutMagazine(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            map.put(c, count - 1);
        }
        return true;
    }

    //Question 5:
    //Letter followed by Digit: Given a string str write a function which will check if the string no letter followed by another letter, and no digit followed by another digit.

    public static boolean check(String str){
        boolean prev = Character.isDigit(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            boolean cur = Character.isDigit(str.charAt(i));
            if(prev == true){
                if(cur){
                    return false;
                }
            } else{
                if(!cur){
                    return false;
                }
            }
            prev = cur;
        }
        return true;
    }
}