

## Creational 
### Abstract Factory

Implementation of GOF Abstract Factory Pattern [GOF - page 88]. Key Point - the classes in the pattern can *vary by implementation, but not by interface* [SO1]. This means different patterns are implemented when there is variation in the interface of the Product classes.

In the example, Trucks have an additional method than Cars, which means Cars and Trucks *vary by interface*. To adhere to the pattern, distinct Factory/Product interfaces were implemented for Cars and Trucks. 

### Builder

Implementation of the GOF Builder Pattern [GOF - page 97]. Similar to abtract factory in that it creates complex object structures. In the Builder pattern, the object creation logic requires complicated step by step logic that would be too complex to have in client classes. For example, lots of different constructors or setter calls required before being able to use an object. 

The pattern also doesn't require the use of Abstract Product classes or interfaces. It's assumed that the interfaces ar too complicated to be able to find a common interface between product classes.

## References

[GOF] Design Patterns, Elements of Reusable Object-Oriented Software. Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides

[SO1] https://stackoverflow.com/questions/3578648/type-casting-and-the-factory-pattern, particularly Matt Greer's comment. 
