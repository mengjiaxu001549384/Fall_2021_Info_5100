package Mengjia;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Question 1:
        int[] nums1 = {1,1,4,5,7,5,4,7,2,9};
        int[] nums2 = {8,34,6,4,234,54,54,123,234};
        System.out.println(uniqueSum(nums1));
        System.out.println(uniqueSum(nums2));
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
}