# digitalSkills-AutomationTest

**Task:** 

Code To Read Vehicle Registration Details from a Input Text File based on a RegEx and Compare the Details of the vehicle against a website with the OutPut CSV File

**Solution:**

Read the InputFile and Retrieve the Registration Numbers based on a RegEx and Add it to the List.

Parse the CSV File and Store the Vehicle Details as Key Value Pairs in a Map with Registration Number as Key.

Fed the Input Reg numbers to the website Read the Details from the wePage and Assert it with the values stored in the Map.

Can use SoftAssert to Run All the Registration Number even if something inbetween Fails.



**Tools and Technologies Used:**
Java
Selenium
Cucumber
Maven
OpenCsv
Intellij

**Ways to Execute the Tests:**

1) Right Click on Feature File/Scenario and Run from the Intellij
2) Right Click on the UIRunner File and Run from Intellij
3) mvn clean test from the Command Line


**Reports:**

Sample executed Reports are Placed in executed Reports Folder.
Actual Reports are Generated in Target/Reports/DigitalSkills Folder

