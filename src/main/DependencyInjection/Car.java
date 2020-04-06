package DependencyInjection;

/**
 Notice that there is no dependency of PetrolEngine or DieselEngine inside this class.
 All dependencies are abstracted to the Engine interface.

 **/

public class Car {

    public Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive()
    {
        engine.start();

        // code for driving car

        System.out.println("Car is driving..");

    }
}
