 Feature: Hotel Booking In Adactin Application
 
 @SmokeTest
 Scenario Outline: login page
 
 Given user Launch The Application
 When user Enter The "<username>" In Username Field
 And user Enter The "<password>" In Password Field
 Then user Click On The Login Button And It Navigates To The Search Hotel
 
 Examples:
 	|username|password|
 	|abc|123|
 	|def|456|
 	|bodapatireshma|Cucumber@123|

@SanityTest	 
 Scenario: search hotel
 
 When user Select The Location
 And user Select The Hotel
 And user Select The Room Type
 And user Select The Check In Date
 And user Select The Check Out Date
 And user Select Number Of Adults
 And user Select Number Of Children
 Then user Click On The Search Button And It Navigates To Select Hotel
 
 @SanityTest
 Scenario: select hotel
 
 When user Select The Radio Button To Select Hotel
 Then user Click On The Continue Button And It Navigates To Book A Hotel
 
 @SanityTest
 Scenario: book a hotel
 
 When user Select The First Name
 And user Select The Last Name
 And user Select The Billing Address
 And user Select The Creditcard Number
 And user Select The Creditcard Type
 And user Select The Expiry Month
 And user Select The Expiry Year
 And user Select The Cvv Number
 Then user Click On The Book Now Button And It Navigates To Booking Confirmation
 
 @RegressionTest
 Scenario: booking confirmation
 
Then user Click On The Logout Button