package Mengjia;

class Printer {

    private static Printer instance;
    private static Object obj = new Object();
    private Printer() {
    }

    public static Printer getInstance() {
        if(instance == null){
            synchronized (obj){
                if(instance == null) {
                    instance = new Printer();
                }
            }
        }

        return instance;
    }

    public String getConnection(){
        return "Your Printer is working";
    }
}

