# JUnit-UT
Assetrttion : a process to check if the expectation is same as the reality.

AssertEquals : compare expected and reality :  
  documentation : https://junit.org/junit4/javadoc/latest/org/junit/Assert.html
  
# Maven SureFire
Helps to execute Junit files using maven commend

# Lifecycle Hooks
Determines method to run each time before execution
1) @BeforeAll 2)@AfterAll 3)@BeforeEach 4)@AfterEach

# Default TestInstance Behavior
@TestInstance(Lifecycle.PER_METHOD) : instanciates this class for each METHOD (Default)
@TestInstance(Lifecycle.PER_CLASS) : instanciates this class for each CLASS 

# DisplayName and Disabled annotations 
@DisplayName : Changes the name of a test Method : Easy to Identify error
@Disabled : makes the JUnit skips the method 

# Conditional executions and assumptions
executions : Verifies and executes if the condition is satisfied.

assumptions : handling external factors

# AssertAll 
Uses lambda : https://youtu.be/-K2UBjMM23U?list=PLqq-6Pq4lTTa4ad5JISViSb2FVG8Vwa4o

# Nesting : grouping test cases
1) Executes all
2) Executes group

# Supplier for assert messages
It allows to write a lambda expression as soon as the MATHOD Fails; rather building the part again and again
https://youtu.be/S-hk1jFdZfA?list=PLqq-6Pq4lTTa4ad5JISViSb2FVG8Vwa4o
