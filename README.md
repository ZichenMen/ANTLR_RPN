# ANTLR-Based Multi-Mathematical Notation Calculator

## Introduction

The **ANTLR-Based Multi-Mathematical Notation Calculator** is an advanced computing tool developed using ANTLR and Java. This project is designed to interpret and evaluate a wide range of mathematical expressions, including those in Reverse Polish Notation (RPN), traditional infix notation, and others. It seamlessly handles arithmetic operations, trigonometric functions, logarithmic calculations, and more, demonstrating the versatility of ANTLR for parsing complex inputs. Utilizing Maven for dependency management ensures a streamlined build process and easy library integration.

## Features

- **Comprehensive Mathematical Operations:** Supports arithmetic operations, trigonometric functions (including inverse and hyperbolic), logarithmic functions, factorial calculations, and constants like π and e.
- **Reverse Polish Notation:** Specialized in evaluating expressions in RPN, optimizing the calculation process by eliminating the need for parentheses.
- **Maven Dependency Management:** Utilizes Maven for efficient management of dependencies, simplifying the build and execution of the project.
- **Precision Handling:** Calculates expressions up to the 5th decimal place, intelligently omitting unnecessary trailing zeros for a cleaner output.

## Prerequisites

Ensure you have the following installed before proceeding:

- **Java Development Kit (JDK)** version 8 or later.
- **Maven** version 3.6 or newer, essential for building and managing the project dependencies.

## Getting Started

1. **Clone the Repository:** Obtain a local copy of the project repository.
2. **Build with Maven:** In the project directory, execute `mvn clean install` to build the project, leveraging Maven for dependency resolution.
3. **Run the Application:** Launch the application. It is designed to read infix expressions from standard input, processing one expression per line.

## Input/Output Format

The application adheres to the following I/O conventions:

- **Input:** Accepts one infix mathematical expression per line through standard input.
- **Output:** Provides three lines in response to each input:
  1. The original infix expression.
  2. The converted Reverse Polish Notation expression, with space-separated operators and operands.
  3. The evaluated result, formatted to up to 5 decimal places when necessary.

## Contributing

Contributions are encouraged, whether they involve expanding the calculator's functionality, enhancing precision, or improving code quality. Your expertise and suggestions are invaluable to the project's growth.

## License

This project is released under the MIT License, promoting open collaboration and sharing.
