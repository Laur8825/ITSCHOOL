package session12.practice.has_a;

public class Car {

    private Engine engine;   //using composition, Car HAS-A engine

    public Car(Engine engine){
        this.engine=engine;
    }

    void start(){
        engine.start();
    }

    void drive(){
        System.out.println("Car is driving");
    }
}
