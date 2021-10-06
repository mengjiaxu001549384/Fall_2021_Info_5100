package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    //LeetCode

    // 1)

    public int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }


    // 2)

    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int i1 = -1, i2 = -1;
        int minDistance = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                i1 = i;
                if(i2 != -1){
                    minDistance = Math.min(minDistance, Math.abs(i1 - i2));
                }
            } else if (wordsDict[i].equals(word2)) {
                i2 = i;
                if(i1 != -1){
                    minDistance = Math.min(minDistance, Math.abs(i1 - i2));
                }
            }
        }
        return minDistance;
    }

    // 3)

    public void moveZeroes(int[] nums) {
        int j = 0;
        for( int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
    }

    // 4)

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int left = 0, right = n - 1;
        while(left < right){
            for(int i = 0; i < right - left; i++){
                int temp = matrix[left + i][left];
                matrix[left + i][left] = matrix[right][left + i];
                matrix[right][left + i] = matrix[right - i][right];
                matrix[right - i][right] = matrix[left][right - i];
                matrix[left][right - i] = temp;
            }
            left++;
            right--;
        }
    }

    // 5)

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList();
        int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
        int d = 0;
        int i = 0, j = 0;
        res.add(matrix[i][j]);
        matrix[i][j] = - 101;
        while(res.size() < matrix.length * matrix[0].length){
            int x = i + dir[d][0];
            int y = j + dir[d][1];
            while(x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length && matrix[x][y] >= -100){
                res.add(matrix[x][y]);
                matrix[x][y] = -101;
                x += dir[d][0];
                y += dir[d][1];
            }
            i = x - dir[d][0];
            j = y - dir[d][1];
            d++;
            if(d > 3) d = 0;
        }
        return res;
    }

    // 6)

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] map = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map[a] == 0) {
                map[a] = b;
            } else if (map[a] != b) {
                return false;
            }
        }

        Arrays.fill(map, 0);
        for (int i = 0; i < t.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map[b] == 0) {
                map[b] = a;
            } else if (map[b] != a) {
                return false;
            }
        }

        return true;
    }

    // 7)

    public String addStrings(String num1, String num2) {
        int prev = 0;
        StringBuilder sb = new StringBuilder();
        int p1 = num1.length() - 1, p2 = num2.length() - 1;
        while(p1 >= 0 || p2 >= 0){
            int a = prev;

            if(p1 >= 0){
                a += num1.charAt(p1) - '0';
            }

            if(p2 >= 0){
                a += num2.charAt(p2) - '0';
            }

            prev = a / 10;
            sb.append(a % 10);
            p1--;
            p2--;
        }

        if(prev != 0){
            sb.append(prev);
        }

        return sb.reverse().toString();
    }

    // 8)

    public boolean isPalindrome(String s) {
        List<Character> c = new ArrayList<Character>();
        for(char a: s.toLowerCase().toCharArray()){
            if((a>='a' && a<='z')||(a>='0' && a<='9')){
                c.add(a);
            }
        }
        int i = 0, j = c.size() - 1;
        while(i < j){
            if(c.get(i++) != c.get(j--)){
                return false;
            }
        }
        return true;
    }

    // 9)

    public String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            String word = arr[i];
            sb.append(arr[i]);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    // 10)

    public int compress(char[] chars) {
        int p1 = 0, p2 = 0;
        char prev = ',';
        int count = 1;
        while(p2 < chars.length){
            if(chars[p2] == prev){
                count++;
            } else{
                if(count != 1){
                    char[] times = help(count);
                    for(char c: times) chars[p1++] = c;
                    count = 1;
                }
                chars[p1++] = chars[p2];
                prev = chars[p2];
            }
            p2++;
        }
        if(count != 1){
            char[] times = help(count);
            for(char c: times) chars[p1++] = c;
        }
        return p1;
    }

    public char[] help(int count){
        return Integer.toString(count).toCharArray();
    }


    //print
    public void printTestResult(){
        System.out.println("Q1 Transpose Matrix: ");
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input: ");
        for(int[] m: matrix){
            System.out.println(Arrays.toString(m));
        }
        System.out.println();
        System.out.println("Output: ");

        matrix = this.transpose(matrix);
        for(int[] m: matrix){
            System.out.println(Arrays.toString(m));
        }


        System.out.println("================================================================");
        System.out.println("Q2 Shortest Word Distance: ");
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        System.out.println("Input: ");

        System.out.println("wordsDict: " + Arrays.toString(wordsDict));

        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
        System.out.println();
        System.out.println("Output: ");

        int ans = this.shortestDistance(wordsDict, word1, word2);
        System.out.println(ans);

        System.out.println("================================================================");
        System.out.println("Q3 Move Zeroes : ");
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Input: ");

        System.out.println("nums: " + Arrays.toString(nums));


        System.out.println();
        System.out.println("Output: ");

        this.moveZeroes(nums);
        System.out.println("nums: " + Arrays.toString(nums));

        System.out.println("================================================================");

        System.out.println("Q4 Rotate Image: ");
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        System.out.println("Input: ");
        for(int[] m: matrix2){
            System.out.println(Arrays.toString(m));
        }
        System.out.println();
        System.out.println("Output: ");
        this.rotate(matrix2);
        for(int[] m: matrix2){
            System.out.println(Arrays.toString(m));
        }

        System.out.println("================================================================");

        System.out.println("Q5 Spiral Matrix : ");
        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println("Input: ");
        for(int[] m: matrix3){
            System.out.println(Arrays.toString(m));
        }
        System.out.println();
        System.out.println("Output: ");
        List<Integer> list = this.spiralOrder(matrix3);
        for(int a : list){
            System.out.print(a + "->");
        }
        System.out.println();
        System.out.println("================================================================");

        System.out.println("Q6 Isomorphic Strings : ");
        String s = "egg", t = "add";

        System.out.println("Input: ");
        System.out.println("s: " + s);
        System.out.println("t: " + t);
        System.out.println();
        System.out.println("Output: ");

        System.out.println(this.isIsomorphic(s, t));

        System.out.println("================================================================");

        System.out.println("Q7 Add Strings : ");
        String a = "456", b = "77";

        System.out.println("Input: ");
        System.out.println("num1: " + a);
        System.out.println("num2: " + b);
        System.out.println();
        System.out.println("Output: ");

        System.out.println(this.addStrings(a, b));

        System.out.println("================================================================");

        System.out.println("Q8 Valid Palindrome : ");

        String string = "A man, a plan, a canal: Panama";

        System.out.println("Input: ");
        System.out.println(string);
        System.out.println();
        System.out.println("Output: ");

        System.out.println(this.isPalindrome(string));

        System.out.println("================================================================");

        System.out.println("Q9 Reverse words in a String : ");

        string = " hello world ";

        System.out.println("Input: ");
        System.out.println(string);
        System.out.println();
        System.out.println("Output: ");

        System.out.println(this.reverseWords(string));

        System.out.println("================================================================");

        System.out.println("Q10  String Compression : ");

        char[] chars = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        System.out.println("Input: ");
        System.out.println(Arrays.toString(chars));
        System.out.println();
        System.out.println("Output: ");
        int len = this.compress(chars);
        System.out.println(Arrays.toString(chars));
        System.out.println("length: " + len);
    }
}
