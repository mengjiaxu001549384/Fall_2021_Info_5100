package Mengjia;

import Q1.Happy;
import Q1.Moody;
import Q1.Psychiatrist;
import Q1.Sad;
import Q2.AddOperation;
import Q2.Context;
import Q2.MultiplyOperation;
import Q2.SubtractOperation;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody happy = new Happy();
        Moody sad = new Sad();

        System.out.println("Q1: ");
        psychiatrist.examine(happy);
        System.out.println();
        psychiatrist.observe(happy);
        System.out.println();
        psychiatrist.examine(sad);
        System.out.println();
        psychiatrist.observe(sad);
        System.out.println();

        System.out.println();
        System.out.println("Q2: ");
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15));
        // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40));
        // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25));
        // Expects 100
    }
}
