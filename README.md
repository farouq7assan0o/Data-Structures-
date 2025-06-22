# Data Structures and Algorithms Project

## Overview

This project demonstrates practical applications of foundational data structures and algorithms in Java. It includes the implementation and analysis of sorting algorithms, shortest path algorithms, stack-based problems, recursion, and abstract data types. The project also covers performance benchmarking and theoretical analysis to compare algorithmic efficiencies.

## Components

### Part 1: Min-Priority Queue Using Linked List

- A custom priority queue is implemented using a singly linked list.
- Each node stores data and an associated priority.
- Operations include:
  - Insert (O(n))
  - Get minimum (O(1))
  - Remove minimum (O(1))
- Common application: job/task scheduling systems

### Part 2: Sorting Algorithm Analysis

- Algorithms compared: Selection Sort vs Merge Sort
- Data sets: sorted and reversely sorted arrays of size 5,000 to 500,000
- Benchmarks:
  - Selection Sort: O(n^2)
  - Merge Sort: O(n log n)
- Merge Sort outperforms Selection Sort in both best and worst-case scenarios

### Part 3: Stack Applications and Recursion

- Palindrome checker using a stack
- Custom stack ADT implemented with push, pop, peek, isEmpty, size
- Explanation of call stack behavior in recursive functions
- Illustration of execution flow using recursion and return values

### Part 4: Data Structure Suitability and Complexity Analysis

- Comparative complexity table for:
  - Linked lists
  - Unsorted arrays
  - Sorted arrays

- Use case analysis:
  - Spell checker: Sorted array (binary search)
  - Priority queues: Linked list (fast insertions and deletions)

- Theoretical complexity:
  - Recursive function with three calls: O(3^n)

- Abstract Data Type principles:
  - Encapsulation
  - Modularity
  - Reusability
  - Inheritance and polymorphism connections with OOP

## Key Algorithms Implemented

- Min-Priority Queue using Linked List
- Selection Sort
- Merge Sort
- Dijkstra’s Algorithm
- Bellman-Ford Algorithm
- Stack-based palindrome checker
- Recursively defined functions and call stack simulation

## Code Files

- TaskNumber3.java
- TaskPart2.java
- TaskNumber9and10.java
- TaskNumber9n10.java

Each file contains Java implementations for parts of the project, including sorting, shortest path simulation, and stack manipulation.

## What I Learned

- Algorithm complexity analysis through practical testing
- Implementation of multiple sorting and shortest path algorithms
- Use of stacks to solve character-based problems like palindrome detection
- Application of Abstract Data Types and Object-Oriented Programming principles
- Performance trade-offs in algorithm selection
- Theoretical vs practical algorithm efficiency comparison
- Recursive logic and call stack behavior

## Author

Farouq Hassan  
Spring 2023  
HTU – Data Structures and Algorithms  
Instructor: Dr. Malek Al-Lozi
