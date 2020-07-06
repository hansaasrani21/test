Feature: Test Feature

@calculator
Scenario Outline: Test Scenario
Given i have two numbers <n1> <n2>
When i perform mathematical operation "<operation>" on them
Then i print the result

Examples:
|n1|n2|operation|
|2|3|add|