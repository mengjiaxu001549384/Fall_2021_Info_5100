package com.company;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        B b = new B();
        System.out.println((b instanceof B));
        System.out.println((b instanceof A));
        System.out.println((b instanceof C));
        /*int res = countWays(30, 5);
        System.out.println(res);
        int ans = countWaystoDivide(30, 5);
        System.out.println(ans);
        System.out.println(get_gcd(30, 40));*/
    }

    public static int findLocation(int[] people, int[] x, int[] y){
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();
        for(int i = 0; i < people.length; i++){
            int count = people[i];
            while(count> 0){
                rows.add(x[i]);
                cols.add(y[i]);
                count--;
            }
        }
        Collections.sort(rows);
        Collections.sort(rows);
        int midX = rows.get(rows.size()/2);
        int midY = cols.get(cols.size()/2);
        int ans = 0;
        for(int i = 0; i < people.length;  i++){
            ans += people[i] * cost(midX, midY, x[i], y[i]);
        }
        return ans;
    }

    public static int cost(int x, int y, int a, int b){
        return (Math.abs(x-a)+Math.abs(y-b));
    }

    public static int countWays(int n, int k){
        if(n < k) return 0;
        if(n == k) return 1;
        return dc(n, k, 1);
    }

    public static int dc(int n, int k, int start){
        if(n / k < start) return 0;
        if(k == 1) return 1;
        int ans = 0;

        for(int i = start; i <= n / k; i++){
            ans += dc(n - i, k - 1, i);
        }

        return ans;
    }

    public static int calculate(int k, int start, int n, int [][][]dp ) {
        // Base Case
        if (k == 1){
            if (n >= start) return 1;
            else return 0;
        }

        if (dp[k][start][n] != 0)
            return dp[k][start][n];

        int ans = 0;

        for (int i = start; i <= n / k; i++){
            ans += calculate(k - 1, i, n - i,  dp);
        }
        //divide n into k, start with start
        dp[k][start][n] = ans;

        return ans;
    }

    public static int countWaystoDivide(int n, int k){
        //dp[a][b][c] meaning: divide c into a, start with b
        int [][][]dp = new int[k + 1][n][n + 1];
        return calculate(k,1, n,  dp);
    }

    public static int get_gcd(int n1, int n2) {
        int gcd = 0;
        if (n1 < n2) {// 交换n1、n2的值
            return get_gcd(n2, n1);
        }
        if (n1 % n2 == 0) {
            return n2;
        }
        else {
            return get_gcd(n1 % n2, n2);
        }
    }
}


