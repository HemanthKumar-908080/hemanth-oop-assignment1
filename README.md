# Hemanth OOP Innovative Assignment-I

**Student:** Hemanth
**Course:** Object Oriented Programming

## Problem B
Define an abstract class `Booking` with abstract method `confirmBooking()`. Extend it with a class `HotelBooking`.

## OOP Concepts Used
- Abstract class
- Abstract method
- Inheritance using `extends`
- Method overriding
- Class and object
- Constructor

## Program
The `Booking` class is an abstract class containing the abstract method `confirmBooking()`.
`HotelBooking` extends `Booking` and provides the implementation of `confirmBooking()`.

## Sample Output
```text
Hotel Booking Confirmed
Guest Name: Hemanth
Hotel Name: Grand Palace Hotel
Room Number: 205
```

## Compile and Run
```bash
javac ProblemB.java
java ProblemB
```

## Viva Notes
1. **What is an abstract class?**  
   A class declared using the `abstract` keyword. It can contain abstract and non-abstract methods.

2. **What is an abstract method?**  
   A method declared without a body. The subclass must provide its implementation.

3. **Why is Booking abstract?**  
   It provides a common structure for different types of bookings.

4. **What does extends mean?**  
   It is used to inherit a class.

5. **What is method overriding?**  
   When a subclass provides its own implementation of a parent class method.

6. **Can we create an object of an abstract class?**  
   No. We create an object of its concrete subclass instead.
