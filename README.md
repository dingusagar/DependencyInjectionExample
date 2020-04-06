# DependencyInjectionExample
Simplest java program to demonstrate the significance of  dependency injection principle using car and car-engine analogy


## WTH is it?
Dependency injection is a programming technique that makes a class independent of its dependencies.

## Give me an example please

#### Let's see an example where there is no dependency injection used first.

Look inside `WithoutDependencyInjection` folder. There is a class called `Car`. If you see inside `Car`, there is an object of `DieselEngine` class. Here `Car` is the high level class and `DieselEngine` is the low level class. The high level class is dependent on the low level class. What this means is that whenever the `DieselEngine` class changes, the high level class `Car` should be recompiled. If we choose to change the engine to petrol by writing a new `PetrolEngine` class, then all instances of `DieselEngine` class inside `Car` class should be changed to `PetrolEngine`. Run the `Main` class and check the java comments for better clarity.

#### Let's see if we can solve the problem using dependency injection techniques.

Look inside `DependencyInjection` folder. So the main problem was the tight coupling of lower level classes like `DieselEngine` with the higher level class `Car`. Here we remove that coupling by introducing an abstraction called `Engine`. `Engine` is an java interface. Now here `DieselEngine` and `PetrolEngine` are written as implementations of this interface. And in the `Car` class we refer only to this abstact concept called `Engine`. We have removed the tight coupling of `DieselEngine` from `Car`. Now we use the constructor of the `Car` class to inject (insert) the dependency. Notice the argument in the `Car` constructor is `Engine`. This means at runtime we can pass any implementation of `Engine` interface and it will work fine. This means the `Car` class is only working with the abstaction called `Engine` and not its detailed implementation like `DieselEngine` or `PetrolEngine`. The specific implementation is passed at the runtime throught the constructor of `Car`. Check out the code and comments for better clarity. 

