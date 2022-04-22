# SOLID Principles

### <font color="red"> **Note**</font>    every example has 2 versions: 


-   **satisfaction**: which satitsfies the principle. ✅ ✅
- **violation**: which violates the principle. ❌❌

----

## **What does SOLID stand for?**

    S  –  Single responsibility principle
    O  –  Open closed principle
    L  –  Liskov substitution principle
    I  –  Interface segregation principle
    D  –  Dependency Inversion principle

----

## [**Single Responsibility Principle (SRP)**](https://github.com/omarhosny206/SOLID-Principles/tree/master/srp):
> A class should have one and only one reason to change, meaning that a class should have only one job.

### Why is it useful?
- **Readability** – As your applications grow in size and complexity, readability becomes one of the top priorities. Code that is not readable, will lead to several failure points. The Single Responsibility Principle, ensures that your code is clean and readable at all times.

- **Testability** –  Breaking down your code into small modules, that do only one thing, makes them easy to test.

- **Reusability** – Your code is now tested, and clean which means that they can be reused in several parts of your code.
  
-  **Maintainability** – Code written with this principle in mind is easy to maintain on a long run.

----

## [**Open Closed Principle (OCP)**](https://github.com/omarhosny206/SOLID-Principles/tree/master/ocp):
> Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

### Why is it useful?
- **Agile** – By being open to adding new features, the development process is agile. Much time won’t be spent on refactoring the code to add new features.

- **Reliable** –  This principle ensures reliability, that adding new features will not introduce new bugs, since the code is closed to modification.

----

## [**Liskov Substitution Principle (LSP)**](https://github.com/omarhosny206/SOLID-Principles/tree/master/lsp):
> A superclass object should be replaceable with a subclass object without breaking the functionality of the software.

----

## [**Interface Segregation Principle (ISP)**](https://github.com/omarhosny206/SOLID-Principles/tree/master/isp):
> A client should never be forced to implement an interface that it doesn’t use or clients shouldn’t be forced to depend on methods they do not use.

----

## [**Dependency Inversion Principle (DIP)**](https://github.com/omarhosny206/SOLID-Principles/tree/master/dip):
> Entities must depend on abstractions not on concretions. It states that the high level module must not depend on the low level module, but they should depend on abstractions.