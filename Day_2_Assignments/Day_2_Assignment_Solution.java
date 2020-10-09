package com.Batch_1.Day_2_Assignments;

// Java Essentials 
// Batch 1 Day 2 Assignment

//Assignment Description ---
// Make a Class called Employee
// Make three variable name, age, city
// Then make a function name 'display()' to display this all variables
// In manner like 'Name Of Employee: Ramesh'
// Make two objects of the Employee class in main and assign different-different values to variables
// Use the function on both of this objects

// Solution For The Assignment -----
public class Day_2_Assignment_Solution {
    public static void main(String[] args) {
        System.out.println("-----> Java Essentials Batch 1 Day 2 Assignments <-----");
        System.out.println("Result ----");
        // Making a object of Employee class
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // Setting variables for emp1 object
        emp1.name = "Jayesh Patel";
        emp1.age = 30;
        emp1.city = "Gujarat";
        
        // Setting variables for emp2 object
        emp2.name = "Rakesh Patil";
        emp2.age = 45;
        emp2.city = "Maharashtra";

        // Running the function
        emp1.display();
        emp2.display();

    }
}
