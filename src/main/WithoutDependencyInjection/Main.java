package WithoutDependencyInjection;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();

//        to change the engine we need to compile again the whole DependencyInjection.Car class also.
    }
}
