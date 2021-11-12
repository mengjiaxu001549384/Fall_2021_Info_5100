package Mengjia;

public class Main {
    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        LinkedList linkedList = new LinkedList();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    linkedList.addAtPosition(linkedList.size(), i);
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    linkedList.addAtPosition(linkedList.size(), i);
                }
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(linkedList.size());
    }
}
