Feature: search product
Scenario Outline: User search for a product
Given user opens login page
When enters usernamee as "<unamee>"
And enters passwordd as "<psdd>"
And click on login button
And user search for a product"head"
Then click on find button
Examples:
|unamee|psdd|
|AlexUser|Alex@123|