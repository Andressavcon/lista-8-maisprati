package Polymorphism;

public class Train implements ITransportMeans {
    @Override
    public void accelerate() {
        System.out.println("O trem acelerando!");
    }

    @Override
    public void brake() {
        System.out.println("O trem freando!");
    }
}
