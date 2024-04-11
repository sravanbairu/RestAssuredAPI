API Test Automation Framework using RestAssured, Java, Maven and Cucumber with JUnit

This is a sample API test automation framework built using Java, Maven, RestAssured, and Cucumber. It allows you to test the Coinbase API to retrieve the current price for Bitcoin and print the Bitcoin rate in GBP.

├── src

│   ├── main

│   │   └── java

│   │       └── (main Java source files)
│   └── test

           ├── java
           
                  └── cucumber.Options
                  
     └── TestRunner.java
     
         └── features
         
│                    └── checkRateValidation.feature

│       │   └── stepDefinitions

│       │         └── CheckBitCoinRate.java  

          ── pom.xml
          
└── README.md



Prerequisites


•	Java Development Kit (JDK) installed

•	Maven installed

•	GitHub account (optional, for version control)


Getting Started

* Clone the repository
  
  git clone https://github.com/SravanBairu/RestAssuredAPI.git

* Navigate to the project Directory

  cd RestAssuredAPI

* install Depencies

  mvn clean install
  
Running Test 

* to Run the tests, execute the command below one

   mvn test
* to Run the test in different environment then execute the below command.

   mvn -Pdev

  Replace dev with the appropriate profile for your environment

Test Reports

Test reports will be generated in the target directory after running the tests. You can view the reports in HTML format by opening target/cucumber-reports/index.html in a web browser.
