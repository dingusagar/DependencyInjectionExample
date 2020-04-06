package DependencyInjection;

/**
    Dependencies like PetrolEngine, DieselEngine classes are abstracted with an interface called Engine
    and these are injected to the Car class through  the constructor

 **/

public class Main {

    public static void main(String[] args) {

        Car car = new Car(new DieselEngine());
        car.drive();

        /**
         * When the lower level class of Engines change, the higher level class Car need not change.
         * The dependencies are decoupled and managed by the abstraction (Engine interface ) at runtime.
         * */

        Car car2  = new Car(new PetrolEngine());
        car2.drive();

    }

}
