package Mengjia;

import java.util.*;

public class Q3 {
    public int getSubarrayEqualsToK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int res = 0, sum = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            res += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}
