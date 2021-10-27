package Mengjia.Question1;

//This class should extends book class and implement the interface.
public class Fiction extends Book implements iBorrowable {

    //Fiction (String title, double price, String publishYear); //Constructor
    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    //Also implement the abstract method in parent class.
    @Override
    public String description() {
        return this.getTitle() + " all events are imaginary and not based on real facts.";
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

Sample description : “Frankenstein(title) all events are imaginary and not based on real facts”
 */