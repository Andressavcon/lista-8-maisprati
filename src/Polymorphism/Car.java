package Polymorphism;

public class Car implements ITransportMeans {
    @Override
    public void accelerate() {
        System.out.println("O carro acelerando!");
    }

    @Override
    public void brake() {
        System.out.println("O carro freando!");
    }
}
