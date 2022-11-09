 Feature: As a user, I should be able to log in.
@US2
Scenario Outline: Verify user login fail with invalid credentials
Given user on the login page
When user enter invalid "<username>" and "<password>"

And user click the login button1
Then verify "<message>" message should be displayed
Examples:
| username | password | message |
| User9    | Wrong    | Wrong username or password. |
