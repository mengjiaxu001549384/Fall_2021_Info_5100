package Mengjia.Q1;

public class CarDecorator implements Car{

    protected Car baseCar = null;

    public CarDecorator(Car car) {
        this.baseCar = car;
    }

    public void assemble(){
        this.baseCar.assemble();
    }
}
