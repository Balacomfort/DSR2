Feature: Feature to verify the Adding users in Admin page


@A28
Scenario Outline: Validate the system user to add the new users
Given User is Launch the browser with Chrome
Then User giving the credentials Username as "<username>" and Password as "<password>"
And User clicking on the Login button
Then User Clicks on Admin
Then user selects the users from user management dropdown
And Click on add button
Then User select the user from userrole dropdown
And User enters the employee name
Then User select the status of employee
And User enters the username
Then User enters the password
And User enters the confirm password
Then Clicks on save button
And Teardown the browser.

Examples:
| username | password |
| Admin | admin123 |