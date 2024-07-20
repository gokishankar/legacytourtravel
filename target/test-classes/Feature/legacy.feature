Feature: To validate the login functionality of legacytourtravel application

Background:
#Given To open the browser and launch legacytourtravel application(due to hooks)

@smoke
Scenario: To validate the login by giving Valid username and invalid password

When User have to enter Valid username and invalid password
# 1D LIST ...without header
|Apple|apple@123|orange|orange@123|grapes|grapes@123|

And user have to get current url
And User have to click login button
Then To validate the user whether they get into login or not 

@sanity @regression
Scenario Outline: To validate the login by giving invalid username and invalid password

When User have to enter invalid username "<name>" and invalid password "<pass>"

And user have to get current url
And User have to click login button
Then To validate the user whether they get into login or not 

Examples:
      |name      |pass|
      |anu       |anu@!23|
      |bahubali  |bahu@234|
@regression @morning
Scenario: To validate the login by giving valid username and valid password

When User have to enter Valid username and valid password
# 2D LIST ...without header
|Apple |apple@123 |orange|orange@123|grapes|grapes@123|
|banana|banana@123|mango |mango@123|Ajay   |Ajay@345  |
And user have to get current url
And User have to click login button
Then To validate the user whether they get into login or not 
      