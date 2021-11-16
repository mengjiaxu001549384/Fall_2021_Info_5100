package Mengjia.Q1;

public class LuxuryCar extends CarDecorator{


    public LuxuryCar(Car car) {
        super(car);
    }
    public void assemble(){
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
