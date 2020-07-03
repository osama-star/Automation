# Automation
HungerStation Review 
Please check the following link (Published on GitHub):

https://github.com/osama-star/Automation

Please note the following:

1- Start test from \src\apisTests\masterTest.java 

2- I designed the Automation on error code appeared for every API, but some APIs seems to have some bugs, so you will find some Failed Automated Test Case. 

3- Test Report exists in Test-Output Folder as I used TestNG in Automation, so it produce a fairly acceptable report

4- PUT Update an existing pet in PET section seems to be not working correctly as when I tried it, it seems to be adding, also the description for it is for add not update

5- For POST​/pet Add a new pet to the store, error code 405 can not be reproduced as when I execute anything, the API accepts it.

6- For GET​/pet​/findByStatus Finds Pets by status, 400 Invalid status value can not be reproduced as when I execute with invalid status, another error code appear.

7- For GET​/pet​/{petId} Find pet by ID, 400 Invalid ID supplied can not be reproduced as when I execute with invalid ID, another error code appear.

8- For DELETE​/pet​/{petId} Deletes a pet, 400 Invalid ID supplied can not be reproduced as when I execute with invalid ID, another error code appear.

9- Excel Sheet (Pets.xlsx) is used for some Test Cases just to add the data needed to be tested by automation  
