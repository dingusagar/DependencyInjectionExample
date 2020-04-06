# DependencyInjectionExample
Simplest java program to demonstrate the significance of  dependency injection principle using car and car-engine analogy


## WTH is it?
Dependency injection is a programming technique that makes a class independent of its dependencies.

## Give me an example please

Let's see an example where there is no dependency injection used first.

Look inside `WithoutDependencyInjection` folder. There is a class called `Car`. If you see inside `Car`, there is an object of `DieselEngine` class. Here `Car` is the high level class and `DieselEngine` is the low level class. The high level class is dependent on the low level class. What this means is that whenever the `DieselEngine` class changes, the high level class `Car` should be recompiled. If we choose to change the engine to petrol by writing a new `PetrolEngine` class, then all instances of `DieselEngine` class inside `Car` class should be changed to `PetrolEngine`. 



