# Week 7 - Lab: Refactoring and Inheritance

This lab will help you learn how to refactor code and also to 
modify the code structure using inheritance technique.

The objectives of this week are following:
* Refactoring
* Inheritance using generalization

Lab instructions:
* Lab 1: Refactor all the code from BinaryCalculator to DecimalCalculator
* Lab 2: Create new class, BinaryCalculator, that accept data in binary number
* Lab 3: Generalize DecimalCalculator and BinaryCalculator by creating 
BaseCalculator and let the previous two classes to inherit from it.
* For each lab, commit and tag your code before push the code to server. 
You should do pull-request only when you finish all the labs.

To complete the lab you need to meet following requirements:
* Write the classes according the specifications.
* Write a readable, sensible, usable, beautiful code.
* Pass all the unit tests.

Requirement:
1. For floating point number, only the five digits after dot will be 
considered in the result. The sixth and so on digit should be rounded
to the nearest number, 5 will be always round up. 

2. Only the arguments with non-negative value will be computed, 
otherwise, RuntimeException should be thrown from operators.

2. For division operation, it must throw an ArithmeticException when 
divide by zero.

3. For username, it has to be alphanumeric only, no symbols. The first 
character must be an english alphabet. The username has to be at least 
eight character in length. The method setUserName() must return the
 previous user name, if any, or null. RuntimeException should be  thrown
 if an invalid name is assigned.

4. For password, it has to be alphanumeric only, no symbols. There must
be at least one number and one english alphabet in the password. Also
there must be at least one capitalized character and one non-capitalized
character. The length must be at least 12. The method setPassword() must
return the length of the new password. RuntimeException should be thrown 
 when an invalid password is assigned.
 
5. For Users class, deleteUser must throw runtimeException when deleting 
user does not exists.
