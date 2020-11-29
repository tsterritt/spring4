## References

[GOF] Design Patterns, Elements of Reusable Object-Oriented Software. Erich Gamme, Richard Helm, Ralph Johnson, John Vlissides

[SO] https://stackoverflow.com/questions/3578648/type-casting-and-the-factory-pattern, particularly Matt Greer's comment. 

## Creational 
### Abstract Factory

Implementation of GOF Abstract Factory Pattern [GOF]. Key Point - the classes in the pattern can *vary by implementation, but not by interface* [SO]. This means different patterns are implemented when there is variation in the interface of the Product classes.

In the example, Trucks have an additional method than Cars, which means Cars and Trucks *vary by interface*. To adhere to the pattern, distinct Factory/Product interfaces were implemented for Cars and Trucks. 

Trying to encapsulate the common methods of Cars and Truck (e.g. a Vehicle factory/interface assembly) would be an option; however, the client code would require casting down when needing to access the additional method on the Truck class and would violate the goal of the pattern to reveal the interface and not the implementations of the Product classes. 

Reference: GOF page 88.
