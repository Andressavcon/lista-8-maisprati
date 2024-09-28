package Polymorphism;

public class Bicycle implements ITransportMeans {
    @Override
    public void accelerate() {
        System.out.println("A bicicleta acelerando!");
    }

    @Override
    public void brake() {
        System.out.println("A bicicleta freando!");
    }
}
