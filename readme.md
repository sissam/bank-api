Bank account kata

Think of your personal bank account experience When in doubt, go for the simplest solution

Requirements

Deposit and Withdrawal
Account statement (date, amount, balance)
Statement printing
User Stories

US 1:

In order to save money
As a bank client
I want to make a deposit in my account

US 2:

In order to retrieve some or all of my savings
As a bank client
I want to make a withdrawal from my account

US 3:

In order to check my operations
As a bank client
I want to see the history (operation, date, amount, balance) of my operations

========================================================================================================
mvn spring-boot:run in the main directory of project  
swagger : http://localhost:8080/v2/api-docs  
    http://localhost:8080/swagger-ui.html  
Postman or Soapui might be used to test apis as well,  
Technologies : Spring Boot, Rest api, swagger, postman, Spring core, Spring Data, JPA, Hibernate, H2, BDD, Cucumber, Junit  
Developed using Intellij Idea and java 9  
Finally run under java 8, oracle documentation : The application class loader is no longer an instance of URLClassLoader but, rather, of an internal class  
Lombock 1.16.16 because newer versions don't work with java 9  
  
TO DO : open browser after run --> done
        fix bdd --> done (lambda removed)
        add concrete tests and asserts in bdd step defs
        test rest api with junit
        add ft° : create account/create user ..
        generate pdf using itext
        map exceptions
        add unit test
        add h2 console
        add spring security, jwt
        manage database versions with liquibase
        use java 9
        use graphql
        add validation
        test performance
        develop another one using java ee 8
        add front