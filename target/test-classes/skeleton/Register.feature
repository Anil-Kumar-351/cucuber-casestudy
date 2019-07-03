Feature: Registration
Scenario: enter valid credentials
Given useropens signup page in testme app
When enters username as "asdfg"
And enters firstname as "anil"
And enters last name as "kumar"
And enters password as "asdf1"				
And enters confirm password as "asdf1"
And select gender
And enters email as "asdf@gmail.com"
And enters mobile number as "9876543210"
And enters DOB as "01/01/2004"
And enters address as "CDC2 tower A peringulathur"
And enter answer as "chennai"
Then click on Register						