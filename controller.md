

                    Controller Definition:
A controller in software design is a component that acts as an intermediary between the user and the
 system. It handles user inputs, processes them, and directs the necessary actions in the system. 
The controller helps in separating concerns by ensuring that the business logic (Calculator class) 
is not directly accessed by the main program but instead through a dedicated interface 
(CalculatorController).

                    Project Description:
This project is a simple Java-based calculator that performs arithmetic operations such as addition,
 subtraction, multiplication, and division. The project follows the controller principle to manage 
interactions between the main program and the calculator logic.

                    over review
This project demonstrates the use of a controller in a Java-based calculator to separate business 
logic from user interaction, improving maintainability and scalability. It highlights the benefits 
of structured code design by comparing execution with and without a controller.

                    without using controller principle
Direct Interaction:  The Main class directly calls the Calculator class methods.
Mixed Responsibilities:   Business logic and execution logic are combined, reducing code clarity.
Harder Maintenance:  Any change in the Calculator class may require modifications in multiple places.
Less Scalability:  Adding new features or modifying existing ones becomes more complex.
Reduced Flexibility:  It is difficult to replace or extend the logic without affecting the entire program.

                    with using controller principle 
Separation of Concerns: The Controller handles communication between the Main class and the 
Calculator class, keeping logic separate.
Better Maintainability: Changes in the Calculator class do not affect the Main class directly.
Improved Scalability: New features can be added easily without modifying the core logic.
Encapsulation: Direct access to the Calculator class is restricted, improving data control.
Flexibility: The Controller allows modifications to the logic without affecting user interaction, 
making the system more adaptable.






