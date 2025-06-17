      This project is a prototype of a University Transport Management System (UTMS) developed using Java programming. It aims to simulate how students, lecturers, and transport officers request and manage transport services like buses and vans. The project applies Object-Oriented Programming (OOP) concepts to build a flexible, reusable, and organized system.

Implementation of OOP Concepts
In this project, I applied all the core OOP principles: inheritance, encapsulation, abstraction, polymorphism (overriding and overloading), and the use of interfaces.

To demonstrate inheritance, I created a general class called User which contains common attributes and methods for all users in the system. The classes Student, Lecturer, and TransportOfficer inherit from the User class. These subclasses extend the functionality of User by adding their own unique properties or behaviors. This allowed me to reuse the structure and logic defined in the parent class without rewriting the same code.

I implemented encapsulation in the User class and other classes by declaring important data fields such as name, userId, and course as private. To allow safe access and modification of these fields, I created public getter and setter methods. This protects the internal state of each object and ensures that data is controlled and validated before being changed.

To apply abstraction, I defined an abstract class named Vehicle. This class acts as a template for all vehicle types but does not provide full implementation. I then created specific vehicle classes like Bus that extend the Vehicle class and provide full definitions of the abstract methods. I also created interfaces such as Serviceable and Trackable to represent behaviors that can be shared by different vehicle types. These interfaces define methods like serviceVehicle() and trackLocation() which are implemented in the Bus class. This allows different vehicle types to behave consistently while still allowing flexibility in how they implement the behavior.

Method overriding was demonstrated in the requestTransport() method. This method is defined in the base User class but is overridden in both the Student and Lecturer classes to provide user-specific transport request messages. When the program runs, it calls the version of the method that matches the actual object type at runtime, showing polymorphism in action.

Method overloading was used in a separate class called DriverAssignment. we created two versions of the assignDriver() method: one that accepts only a vehicle type as a parameter, and another that accepts both vehicle type and shift time. This allows the method to be used in different ways depending on the available data, without creating multiple method names.
This project is a prototype of a University Transport Management System (UTMS) developed using Java programming. It aims to simulate how students, lecturers, and transport officers request and manage transport services like buses and vans. The project applies Object-Oriented Programming (OOP) concepts to build a flexible, reusable, and organized system.

Implementation of OOP Concepts
In this project, I applied all the core OOP principles: inheritance, encapsulation, abstraction, polymorphism (overriding and overloading), and the use of interfaces.

To demonstrate inheritance, we created a general class called User which contains common attributes and methods for all users in the system. The classes Student, Lecturer, and TransportOfficer inherit from the User class. These subclasses extend the functionality of User by adding their own unique properties or behaviors. This allowed me to reuse the structure and logic defined in the parent class without rewriting the same code.

I implemented encapsulation in the User class and other classes by declaring important data fields such as name, userId, and course as private. To allow safe access and modification of these fields, I created public getter and setter methods. This protects the internal state of each object and ensures that data is controlled and validated before being changed.

To apply abstraction, we defined an abstract class named Vehicle. This class acts as a template for all vehicle types but does not provide full implementation. we then created specific vehicle classes like Bus that extend the Vehicle class and provide full definitions of the abstract methods. I also created interfaces such as Serviceable and Trackable to represent behaviors that can be shared by different vehicle types. These interfaces define methods like serviceVehicle() and trackLocation() which are implemented in the Bus class. This allows different vehicle types to behave consistently while still allowing flexibility in how they implement the behavior.

Method overriding was demonstrated in the requestTransport() method. This method is defined in the base User class but is overridden in both the Student and Lecturer classes to provide user-specific transport request messages. When the program runs, it calls the version of the method that matches the actual object type at runtime, showing polymorphism in action.

Method overloading was used in a separate class called DriverAssignment. I created two versions of the assignDriver() method: one that accepts only a vehicle type as a parameter, and another that accepts both vehicle type and shift time. This allows the method to be used in different ways depending on the available data, without creating multiple method names.

