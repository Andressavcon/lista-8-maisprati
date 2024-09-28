package Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ITransportMeans[] transportMeans = new ITransportMeans[3];

        transportMeans[0] = new Car();
        transportMeans[1] = new Bicycle();
        transportMeans[2] = new Train();

        for (ITransportMeans transport : transportMeans) {
            transport.accelerate();
            transport.brake();
            System.out.println();
        }

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
