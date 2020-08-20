Feature: Post feature of facebook
  This will test the post functionality at the user wall

Scenario: Post a text on user wall
 Given User should be logged in and should be present at its own wall
 When I type the text in the text box
 And click on Post Button
 Then The message should get posted
 
 
Scenario: Post a video on user wall
   Given User should be logged in and should be present at its own wall
   When User should supply the video link in the text box
   And click on Post Button
   Then The video should get posted on the user wall
   And The video should have proper Thumbnail
 

   
