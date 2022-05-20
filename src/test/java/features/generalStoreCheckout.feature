Feature: Checkout a Product using General Store APP



@smokeTest
Scenario Outline: User is able to proceed for Product Listing Page from Home Page for valid user details
	Given Server is started and the General Store APP is opened
	And Select Country <countryName> on APP home page
	And Enter User Name <userName>
	And Slect User Gender
	When Click on Let's Shop Button
	Then User lands on Product Listing Page
	
	Examples:
	|userName   |countryName|
    |Luke       |Australia  |
    |Ashmit     |Argentina  |
    
