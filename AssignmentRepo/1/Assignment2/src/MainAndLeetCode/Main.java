package MainAndLeetCode;

import LeetCode.Solution;
import Q1Shape.ShapeTester;
import Q2Sum.Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Q1
        System.out.println();
        System.out.println("Q1: Create a Shape class and two sub classes Rectangle and Square");
        System.out.println();

        ShapeTester st = new ShapeTester();

        System.out.println("================================================================");
        //Q2

        System.out.println();
        System.out.println("Q2: Create a Sum class with methods to get desired output. Use the below function to test the output.");
        System.out.println();

        Sum sum = new Sum();
        System.out.println(sum.add(2, 3)); //output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4

        System.out.println("================================================================");

        //LeetCode
        System.out.println("LeetCode: ");
        System.out.println();
        Solution solution = new Solution();
        solution.printTestResult();


    }
}