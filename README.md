# solid-exercise
## Overview
This repository contains exercises demonstrating the **SOLID Principles** in object-oriented programming. Each exercise includes the problem scenario that violates a principle and a refactored version applying the correct principle.

## Exercises
### 1. Single Responsibility Principle (SRP)
**Description**:
- Ensures that a class has **only one reason to change**.
- Each class should have a single, well-defined responsibility.

**Example**:
- **Before**: A `Pet` class handles both attributes and behaviors.
- **After**: Split into `Pet` (attributes) and `PetBehavior` (interface for behaviors).

### 2. Open/Closed Principle (OCP)
**Description**:
- Classes should be **open for extension but closed for modification**.
- Avoid modifying existing code; instead, allow behavior extension via inheritance or polymorphism.

**Example**:
- **Before**: `Customer` class uses `if-else` to determine discount.
- **After**: Introduced `DiscountStrategy` interface with `StudentDiscount`, `SeniorDiscount`, etc.

### 3. Interface Segregation Principle (ISP)
**Description**:
- Clients should **not be forced** to implement interfaces they don't use.
- Instead of one large interface, create multiple **specific interfaces**.

**Example**:
- **Before**: A `Smartphone` interface forces `BasicPhone` to implement web browsing & camera features.
- **After**: Split interfaces into smaller ones: `CallAndSMS`, `WebBrowsing`, and `Camera`.

### 4. Dependency Inversion Principle (DIP)
**Description**:
- **High-level modules should not depende on low-level modules.**
- Depend on **abstractions, not concrete implementations**.

**Example**:
- **Before**: `PaymentProcessor` directly depends on `EWallet` and `CreditCard` classes.
- **After**: Introduced `PaymentMethod` interface, and classes like `EWalletPayment` and `CreditCardPayment` implement it.
