package Mengjia.Q3;

public class PayPal implements PaymentStrategy{
    public String email;

    public PayPal(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount){
        System.out.println("Paypal : $" + amount);
    }
}