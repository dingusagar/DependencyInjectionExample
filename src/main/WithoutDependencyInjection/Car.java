package WithoutDependencyInjection;


/**
 * Notice the tight coupling of the dependency class DieselEngine in the Car class. If anything in the dependent class changes,
 * this class has to be changed (or recompiled)
 *
 * Here class is the higher module and DieselEngine is the lower module. And the higher module class Car is dependent on the lower
 * module class DieselEngine.
 *
 * In Dependency Inversion, we try to inverse this relationship of higher module depending on the lower module.
 */

class Car {

    DieselEngine dieselEngine = new DieselEngine();

    public void drive(){

        dieselEngine.start();
        // code for driving

        System.out.println("Car is driving..");
    }
}
