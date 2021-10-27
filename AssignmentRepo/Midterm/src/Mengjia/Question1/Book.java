package Mengjia.Question1;

public abstract class Book {
    //Fields: String title, double price, String publishYear
    private String title;
    private double price;
    private String publishYear;

    //Book (String title, double price, String publishYear); //Constructor
    public Book(String title, double price, String publishYear) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    //Methods: getter and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    //Add an abstract method to this class called description that will return a string.
    public abstract String description();
}

/*

Fields: String title, double price, String publishYear

Book (String title, double price, String publishYear); //Constructor

Following are the public methods that this class should provide:

Methods: getter and setters

Add an abstract method to this class called description that will return a string.*/