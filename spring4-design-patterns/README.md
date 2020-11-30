

## Creational 
### Abstract Factory

Implementation of GOF Abstract Factory Pattern [GOF - page 88]. Key Point - the classes in the pattern can *vary by implementation, but not by interface* [SO1]. This means different patterns are implemented when there is variation in the interface of the Product classes.

In the example, Trucks have an additional method than Cars, which means Cars and Trucks *vary by interface*. To adhere to the pattern, distinct Factory/Product interfaces were implemented for Cars and Trucks. 

### Builder

Implementation of the GOF Builder Pattern [GOF - page 97]. Similar to abtract factory in that it creates complex object structures. The key differences between builder and Abstract Factory:

 - object creation is step by step, and construction and getting the result are separated
 - there may be variation in the the step by step construction requirements for each scenario, which means Abstract Product classes would be difficult. The complexity is hidden behind a contruct method; the implementation hides all of the construction variety instead of forcing the Client to call constuctors or getter/setters in a specific order. 

## References

[GOF] Design Patterns, Elements of Reusable Object-Oriented Software. Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides

[SO1] https://stackoverflow.com/questions/3578648/type-casting-and-the-factory-pattern, particularly Matt Greer's comment. 
