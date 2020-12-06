# Topic: Behavioral Design Patterns
****
##### Student: Pavlov Alexandru
##### Group: FAF-181
****
## Objectives
****
1. Study about **Behavioral Design Patterns**
2. Expand previous lab and implement as many additional functionalities based on BDP as possible
## Theory
****
In software engineering, **Behavioral patterns** are concerned with the assignment of responsibilities between objects, or, encapsulating behavior in an object and delegating requests to it.

By doing so, these patterns increase flexibility in carrying out communication.

The most known design patterns include:
 * **Blackboard**
 * **Chain of responsibility**
 * **Command**
 * **Interpreter**
 * **Iterator**
 * **Mediator**
 * **Memento**
 * **Null object**
 * **Observer**
 * **State**
 * **Strategy**
 * **Visitor**

## Implemetation
****
Previous lab was expanded, and two suitable patterns were implemented: **Null object** and **Iterator**, based on objects of type **Cookware** and **Stove**

**Iterator** is a design pattern in which an iterator is used to traverse a container and access the container's elements. The iterator pattern decouples algorithms from containers, which, in some cases, are necessarily container-specific and thus cannot be decoupled.

Implementation can be found in the interface **IIteratorCollection** and **CookwareIterator** class, which would allow me to add new objects to the **Kitchen**

For printing kitchen components, a utility method from **Main** class is used, which uses this iterator:
```java
private static void printKitchen(Iterator<ICookware> iterator) {
        System.out.println("kitchen contains");
        while (iterator.hasNext()) {
            ICookware cookware = iterator.next();
            System.out.println(cookware.toString());
        }
    }
```

A **Null Object** is an object with no referenced value or with defined neutral (null) behavior. Since references in object-oriented languages can be null, these references must be checked to ensure they are not null before invoking any methods, because methods typically cannot be invoked on null references.

Null objects can be found in the following classes: **StoveNull** and **CookwareNull**


## Program output
![output](https://github.com/Sdude225/TMPS/blob/main/images/outputlab2.png)
## Program Hierarchy
![structure](https://github.com/Sdude225/TMPS/blob/main/images/Package%20TMPS.png)
