package Mengjia;

import Mengjia.Q1.BasicCar;
import Mengjia.Q1.Car;
import Mengjia.Q1.LuxuryCar;
import Mengjia.Q1.SportsCar;
import Mengjia.Q2.ShapeMaker;
import Mengjia.Q3.CreditCard;
import Mengjia.Q3.Item;
import Mengjia.Q3.PayPal;
import Mengjia.Q3.ShoppingCart;

public class Main {

    public static void main(String[] args) {
        System.out.println("Q1:");
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();

        System.out.println();
        System.out.println();
        System.out.println("Q2: ");

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        System.out.println();
        System.out.println("Q3: ");

        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);
        cart.addItem(item1); cart.addItem(item2);
        cart.pay(new PayPal("myemail@example.com"));
        cart.pay(new CreditCard( "1234567890123456"));
    }
}
