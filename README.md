# Specification-Based-Testing-and-Specification-Based-Testing
Project 1: Specification-Based Testing (Part 1)
Purpose
Part 1 of this project will help you reinforce the topics discussed in the class including categories of testing, equivalence partitioning, boundary value, and cause and effect testing.
Objectives
Learners will be able to:
● Apply equivalence partitioning, boundary value and cause-effect testing techniques.
Technology Requirements
● Java 17 or above
Project Description
In this project, you will gain hands-on experience in software testing methodologies. You will focus on three essential techniques:
● Equivalence Partitioning: Learn how to group inputs into classes and design test cases that cover each class efficiently.
● Boundary Value Analysis: Explore the edges of input ranges to uncover potential defects and create precise test cases.
● Cause and Effect Testing: Identify input conditions and their corresponding effects to build targeted test scenarios.
Throughout the project, you will apply these techniques to a provided software program, developing a set of well-structured test cases. By executing these tests, you will validate the program's functionality and ensure it meets the desired specifications.
 
1
To complete Part 1, you will use equivalence partitioning, boundary value, and cause/effect analysis techniques to develop a set of test cases for the provided program and execute the tests.
Directions
Download the provided files located in the “Project Overview” page in the Welcome and Start Here section, then carefully review the directions before starting your work:
● Project 1 Part 1_Test Case Spreadsheet.xlsx
● Jar Files and Project1Script.zip
In this project, we have developed a database to gather information and provide discounts about a product and its users depending on a variety of factors given. The jar file with the program is given to you, but contains at least 10 seeded defects. Using equivalence partitioning, boundary value, and cause/effect analysis techniques discussed in the lecture, please develop a set of test cases for this program and execute the tests following the instructions below:
Running Jar Files
There are three options to run your test cases for black box testing. Please make sure to have java installed on your computer to run the jar file.
Using the GUI
● project1GUI.jar opens up the GUI where you can manually input your test cases and view the output
● To run: Open in Command Prompt or Terminal and enter “java -jar project1GUI.jar” and the GUI will open up
Using Terminal or Command Prompt
● CSE565P1.jar contains the program that runs your test cases
● The jar file takes in arguments corresponding to <name> <age> <user status> <reward member status> <season bought> <product category> <rating of the product>
○ i.e.: java -jar <PATH to jar file> 24 Returning Silver Spring Electronics 5
○ The only values that will be accepted for User Status, Rewards Member Status, Season Bought, Product Category are below.
■ User Status
● New or Returning ■ Rewards Member Status
● Bronze, Silver or Gold ■ Season Bought
● Winter, Spring, Summer or Fall ■ Product Category
● Unknown or Electronics
○ To run: Open in Command Prompt or Terminal and enter “java -jar CSE565P1.jar Peter 24 Returning Silver Spring Electronics 5” and the output will be given
Running tests automatically (Linux/ Bash for Windows/Mac)
● CSE565P1.jar contains the program that runs your test cases.
● Project1Script is a bash script where you can input your test cases, and Project1Script will automatically run them.
● To add a test case and run:
a. OpenProject1Scriptinvimoraneditor
b. Addinatestcasebydoing:java-jar<PATHtojarfile>Peter24ReturningSilverSpring Electronics 5
c. Exit out of vim or the editor
d. Ifneeded,openinBashorTerminalandmakeProject1Scriptanexecutablebyrunning “chmod u+x Project1Script”
e. IntheBashorTerminal,run“./Project1Script”andtheoutputforeachtestcasewillbe given
Requirements
Input requirements
1. User Name (string)
1.1. Can be 5-10 characters long
1.2. Only contain characters (no numbers)
1.3. Cannot contain a hyphen (-) or underscore (_)
2. Age (Integer)
2.1. Must be 18 or over
3. User Status (do not test for invalids) 3.1. New or Returning
4. Rewards Member Status (do not test for invalids) 4.1. Bronze, Silver or Gold
5. Season Bought (do not test for invalids) 5.1. Winter, Spring, Summer or Fall
6. Product Category (do not test for invalids) 6.1. Unknown or Electronics
7. Rating of Product (Integer)
7.1. Rating must be between 1 – 10
Output requirements
8. Error messages for incorrect username, age, and rating.
9. Discounts Given based on:
9.1. New users cannot be given any discounts regardless of reward status, product, and
season
9.2. If product category is unknown, user gets no discount
9.3. If bought in Summer:
9.3.1. Returning users who are gold members who bought Electronics get a 15%
discount voucher
9.4. If bought in Spring:
9.4.1. Returning users who are bronze members who bought Electronics get a 10%
discount voucher
9.5. If bought in Winter:
9.5.1. Returning users who are gold members who bought Electronics get a 25%
discount voucher
9.6. If bought in Fall:
9.6.1. Returning users who are silver members who bought Electronics get a 15%
discount voucher
9.7. Any other combination of returning user, reward status, product, and season does not get a discount.
Remember in equivalence partitioning, you can only test one (1) invalid partition at a time.
Project 1: Specification-Based Testing (Part 2 - Design of Experiments)
Purpose
Through this project, you will demonstrate your understanding of DOE principles, your ability to utilize appropriate tools and your proficiency in generating effective pairwise combination test cases for mobile application.
Objectives
Learners will be able to:
● Apply design of experiments to develop tests
● Research and identify a suitable tool for DOE testing
● Develop pairwise combination test cases
Technology Requirements
● None
Project Description
In Part 2 of this project, we continue to build upon the principles learned in Part 1, where we explored specification-based testing techniques like equivalence partitioning, boundary value analysis, and cause and effect testing. While Part 1 focused on deriving test cases from system specifications to cover various scenarios effectively, Part 2 implements an advanced specification-based testing technique called Design of Experiments (DOE) which takes a more systematic approach, employing statistical methods to design test cases and comprehensively analyze the effects of multiple input factors on the system's behavior.
Directions
You are asked to develop test cases using pairwise combination Design of Experiments (DOE) technique using a tool of your choice. Below is the specification of the application that you should use when creating the test cases.
Your team has created a new mobile application, and you are tasked with using Design of Experiments to create pairwise combination test cases based upon the following requirements. Research and identify a tool that supports DOE and utilize the tool to develop test cases for the given specifications.
Mobile Application Testing Specifications:
Type of Phone
Parallel Tasks Running
Connectivity
Memory
Battery Level
iPhone X
Yes
Wireless
1 GB
< 20 %
iPhone 8
No
3G
2 GB
20 - 39%
Samsung S9
4G
4 GB
40 - 59%
Huawei Mate
Edge
6 GB
60 - 79%
Google Pixel 3
80 - 100%
To complete this project, you will use the design of experiments tool and pairwise combination testing to develop test cases for the provided mobile application specifications.
Project 2: Structural-Based Testing Purpose
The goal of this project is to explore and analyze code coverage using structural-based testing techniques.
Objectives
Learners will be able to:
● Analyze code coverage using statement and decision coverage techniques.
● Develop a set of test cases based on specified requirements.
● Learn about different data flow anomalies.
Technology Requirements
● Java 17 or above
Project Description
In this project, you will focus on two vital aspects of software testing and code analysis. The project consists of two distinct parts, each geared towards honing your skills in specific areas.
In Part 1, you will explore code coverage analysis for a Vending Machine application. You will learn how to assess code coverage using statement and decision coverage techniques, enabling you to identify untested areas and enhance the test suite's efficiency.
In Part 2, the focus shifts to data flow analysis in Static Analysis code. You will develop the ability to detect data flow anomalies, such as data leaks and uninitialized variables.
Directions
Download the provided files located in the “Project Overview” page in the Welcome and Start Here section, then carefully review the directions before starting your work:
 
1
● VendingMachine.java ● StatisticAnalysis.java
Part 1:
You are expected to research and experiment with a tool that provides statement and decision code coverage.
You are given a Java file called VendingMachine.java and you are asked to develop a set of test cases for this code based on the following requirements:
● Takes in an integer input
● Allows users to select between three products: Candy (20 cents), Coke (25 cents), Coffee (45 cents)
● Returns the selected product and any remaining change
● If there is not enough money to buy the product, displays the amount necessary to buy the product and other products to purchase.
You are expected to execute the program with your test cases, observe and report out the code coverage of your test cases. The goal is to reach 100% in statement and 90% in decision coverage. You should be changing your test cases until you reach the desired coverage
Part 2:
You are expected to research and experiment with a static source code analysis tool. You are given a Java file called StaticAnalysis.java which contains two different data flow
anomalies.
The inputs to this code are:
● the weight of the package as an integer
● the length of the package as an integer
● the type of product as a String
You are expected to execute the tool you selected and analyze the report generated for StaticAnalysis.java code. You need to analyze the findings of the tool on this code and comment on how well the tool has performed in identifying the two built in anomalies.
FInally, you are expected to assess the tool in your own words in terms of:
● Features and functionalities provided by the tool
● Type of anomalies covered by the tool
● Ease of use
