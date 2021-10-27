package Mengjia.Question1;

//This class should extends book class.
public class Reference extends Book {
    //Fields: String category (example: dictionaries, encyclopedia)
    String category;

    //Reference (String title, double price, String publishYear, String category); //Constructor
    public Reference(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    //Method: getter and setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //Also implement the abstract method in parent class.
    @Override
    public String description() {
        String d = this.getTitle() + " all information is real.";
        return d;
    }
}

/*
This class should extends book class.



Fields: String category (example: dictionaries, encyclopedia)

Fiction (String title, double price, String publishYear, String category); //Constructor

Method: getter and setter

Also implement the abstract method in parent class.

Sample description : “World Maps(title) all information is real.”
 */
