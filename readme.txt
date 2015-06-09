Project: myrestservice

Description: REST service with crud style operations

Requirements: Setup to be deployed to JBoss 7.x or EAP 6.x
			  MySQL database (included script to create table)
			  

Be sure to create MySQL database.  For this example, I am using mycustomers as my database name.
The SQL script will create the required table.
			  
After deployment, service listing is available here:			  
http://localhost:8080/myrestservice/services/rest/CustomerManager/getAllCustomers?_wadl&_type=xml

Using the Google Chrome REST client for testing is recommended:
https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo

Example usage:
http://localhost:8080/myrestservice/services/rest/CustomerManager/insertCustomer

with application/json as content-type, pass this payload:
{"customer":{"firstName":"Blaine","lastName":"Mincey","city":"Atlanta"}}
