package Question1;

//This class should extends book class and implement the interface.
public class NonFiction extends Book implements iBorrowable {

    //NonFiction (String title, double price, String publishYear); //Constructor
    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    //Also implement the abstract method in parent class.
    @Override
    public String description() {
        String d = this.getTitle() + " all events are true and based on real facts.";
        return d;
    }

    @Override
    public void setBorrowDate(int day) {

    }

    @Override
    public void setReturnDate(int day) {

    }

    @Override
    public boolean isAvailable(int day) {
        return false;
    }
}


/*
This class should extends book class and implement the interface.



Fiction (String title, double price, String publishYear); //Constructor



Also implement the abstract method in parent class.



Sample description : “Anne Frank(title) all events are true and based on real facts.”
 */