@morning @regression
Feature: To validate the Forgotten password in legacytour travel application

Scenario: To validate the Invalid email for forgotten password

#Given User have to launch the legacytour travel application through chrome browser(due to hooks)

When User have to click the forgotten password

And User have to enter Invalid email
# 1D MAP... WITH HEADER
       |fruits|pine@123|
       |actor|suriya@46|
       |flower|jasmine@567|


And User have to click reset password button
Then User have to reach reset password page

Scenario: To validate the valid email for forgotten password

#Given User have to launch the legacytour travel application through chrome browser(due to hooks)

When User have to click the forgotten password

And User have to enter valid email
# 2D MAP... WITH HEADER
           |S.NO     |NAME  |EMAIL|
          |NO ONE   |fruits|pine@123|
          |NO TWO   |actor|suriya@46|
          |NO THRE  |flower|jasmine@567|



And User have to click reset password button
Then User have to reach reset password page



