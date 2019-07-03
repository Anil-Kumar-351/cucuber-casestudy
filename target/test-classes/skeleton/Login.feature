Feature: Login
Scenario Outline: enter valid credentials
Given user opens TestMe app
When user enters use name as "<uname>"
And user enters password as "<psd>"
Then user clicks on login

Examples:

|uname|psd|
|AlexUser|Alex@123|