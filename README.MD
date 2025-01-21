Question 1: Please go to  and download the Question 1 postman collection and import in the Postman to find all the below API's

Please follow the steps to download and test the below API's

1. Go to Github path : https://github.com/Thejaswi1994/POSTest.git/
2. download the file "Question1_POS_Ratecalculator.postman_collection.json"
3. Import the above collection into your postman 
4. There we can see the postman collection name "POS_Ratecalculator"
5. The above collection have three test cases 
	i. countries : 
		URL : https://www-api.pos.com.my/api/countries
		description : this is to give the list of countries 
		method : Get
		Body or queryparams : not required
	ii. getStateByPostcode
		URL : https://www-api.pos.com.my/api/getStateByPostcode
		description : this is to get statename by using the postcode value 
		method : Post
		Body : pass the postCode value
	ii. price
		URL : https://www-api.pos.com.my/api/price
		description : this is to get price estimation from different by using the country and weight value 
		method : Post
		Body : pass the country and weight value		
		

Question 2: I have automated the script as per the requirement 

The project uses Maven for managing dependencies. Maven will automatically download the required libraries from the pom.xml file, which includes:

Selenium WebDriver (for automating the web browser).
TestNG (for managing and running the test cases).

1. First, you need to clone the repository to your local machine. Here's how you can do it:
git clone https://github.com/Thejaswi1994/POSTest.git

2. Import the Project into Eclipse
Open Eclipse IDE.
Go to File > Import.
In the import wizard, select Maven > Existing Maven Projects, and click Next.
Browse to the directory where the project was cloned (POSTest).
Select the pom.xml file and click Finish.

3.After importing the project:

In the Project Explorer window in Eclipse, navigate to the folder src/test/java.
You should see the class files related to the automated test case.

4. Run the Automated Test Case
Locate the Java file that contains the automated test case. This will be inside the src/test/java directory.
Right-click the file, and select Run As > Java Application.

5. After the test case runs:
Check the Eclipse Console for the output.









