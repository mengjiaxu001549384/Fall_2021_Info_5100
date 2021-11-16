package Mengjia.Q3;

import java.util.*;

public class ShoppingCart {

    public List<Item> itemList;

    public ShoppingCart() {
        itemList = new ArrayList();
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : itemList){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(this.calculateTotal());
    }
}
