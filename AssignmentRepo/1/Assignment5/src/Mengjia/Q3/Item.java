package Mengjia.Q3;

public class Item {
    public String Id;
    public int price;

    public Item(String id, int price) {
        this.Id = id;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public int getPrice() {
        return price;
    }
}
