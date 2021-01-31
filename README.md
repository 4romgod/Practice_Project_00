# Purpose
This project is meant to be used to practice important Java concepts. The concepts practiced in this project includes the following:
1. Maven Concepts
2. Error handling (Exceptions)
3. Logging (java logging and sl4j)
4. Unit Testing (JUnit)

# Project Description
This project will be composed of multiple packages, each with a different App.
1. calculator - I created a simple calculator with addition, subraction, multiplication, and division functionalities.
2. file reader - I created an application that reads text files and prints the contents on the console.
3. image reader - I created an application that reads an image and displays it.

# Maven Concepts
* This project uses Maven as the build tool.
* I used a Maven Archetype (Template) which auto generates the structure of the project.
* I downloaded maven, added maven's bin directory on the PATH environment variable.

# Error Handling
Error Handling is one of the most important concepts in software development, yet it is poorly practiced.
I am using this project to help myself learn and practice some of the best practices of error handling.
* Throw Early, Catch late.
* Checked vs Unchecked Exceptions
* Checked Exceptions are checked at compile time, and should be handled with try-catch, or declared using throws keyword.
* Unchecked Exceptions are not checked at compile time. Judge and Handle the conditions that could throw these Runtime Exceptions.
* For resources that implements AutoClose, consider using try-with-resources to release them, instead of a finally block.

# Logging
To avoid the most commonly used 'System.out.print', I will use some of the most common logging libraries and logging principles.
I will be using java.util.logging and sl4j to log messages.
* slf4j is not a real logger. It is just an interface that depends on real loggers.
* There are a number of loggers that work well with [slf4j](https://examples.javacodegeeks.com/enterprise-java/slf4j/slf4j-tutorial-beginners/), the most common being...
1. java logger
2. log4j
3. logback
4. simple logger

# Unit Testing
Test Driven Development states that we first write the unit tests, then create implementation around those tests.

[README.md syntax](https://guides.github.com/features/mastering-markdown/)