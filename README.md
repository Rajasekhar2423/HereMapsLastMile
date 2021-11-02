
How to Execute The test cases:
**Configure Test Runner**
1.	Open Test Runner class and Click on Edit Configuration(Top right side in intellij IDE)
 
2.**	Configuration Details:**
Click on + icon and select Junit and give appropriate name complete the necessary details
 
**How to Run FE Test Scenarios**
3.	Go to Test Runner class and give proper tag(@HereWeGO_2_HappyPaths is to run both the test scenarios, we can also run one by one
Example: line 13: where tags=”@HereWeGo_2_HappyPaths” )
**Update CSV file path**
Update the String named CsvFilePath in the AddScv_File method(line 106 in HereFEMethoda.java)

**How to Run FE Test Scenarios**
3.	Go to Test Runner class and give proper tag(@HereWeGo_BE
Example: line 13: where tags=”@HereWeGo_BE” )




Or give all the tags by seperating them with **"or"** and execute it.
for the results open the cucumber.html page (target/cucumber-reports)
