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

1. Go to Github folder which is public "https://github.com/Thejaswi1994/POSTest.git/Question2"
2. download all files into one of your folder
3. import the same folder to your eclipse 
4. then you see new project "seleniumwebdriver" 
5. go to folder "src/test/java" then run the project as java application which will show you automated test case of calculating the Shipment quote from Malaysia to India.

Language Used: Java
Dependencies: Maven, Pom.xml and TestNG.










