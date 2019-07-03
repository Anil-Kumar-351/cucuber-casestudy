Feature: Addto xcart
Scenario Outline: verify where addtocart available or NOT
Given open TestMeApp
When enter username as "<name1>"
 And enter password as "<pasd1>"
 And click on login
 And click on search button
 And click on find buttons
 Then search for addtocart
 
 Examples:
 |name1|pasd1|
 |AlexUser|Alex@123|