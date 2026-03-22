# Task S1.09

## Level 1 Exercise 1
**Description**: 
Demonstrates Java `enum` behavior with abstract methods. `Day` 
defines an `isLaborable()` flag per day, `Level` maps a priority 
to a color, and `Task` shows behavior based on its `Level`. The 
`Main` class runs examples, including normalizing a string and 
converting it to a `Day` value.

## Level 2 Exercise 1
**Description**: Practices the Java Time API. It creates and prints
`LocalDate`, `LocalTime`, and `LocalDateTime`, calculates `Period`
and `Duration`, adds and subtracts time units, formats dates with
multiple patterns, checks whether a date is in the past, and lists 
upcoming appointments in chronological order.

## Technologies
- Backend: Java - Maven

## Installation and Execution
1. Clone the repository: `git clone https://github.com/Quint3in/Tasca_S1.09.git`
2. Go into the project folder: `cd Tasca_S1.09`
3. Build the module you want (from the root). Example for `n2exercici1`:
   `mvn -pl n2exercici1 -am package`
4. Run it (from the root):
   `java -cp n2exercici1/target/classes org.example.Main`
