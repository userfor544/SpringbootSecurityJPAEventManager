# SpringbootSecurityJPAEventManager

GitHub Repository:
https://github.com/userfor544/SpringbootSecurityJPAEventManager

Step to run this project:
1. Clone this repo above into your local machine
2. Import as Maven project into your IDE workspace
3. Install MySQL (5.5) Server locally
         username  is: root
          password  is root 
          Schema is: spring
(see /spring/src/main/resources/application.properties for more detail)

 4. User can Sign as Admin or regular user ( see application.properties where the user can set its email address as admin. -- 
 currently it is set to mine achille.komla@gmail.com MUST be changed to do email verification during account creation process.) 

5. Right-click > Run as > Spring Boot App

6. User can Sign as Admin or regular user ( see application.properties where the user can set its email address as admin 

5. User can log out

Note: General Application Before
After the user log in or Sign Up, he is directed to a his events page where all his events should be listed if none. user can add new events - user can CRUD those events or list  them by daily/weekly/monthly 
-Advance Feature such us forgot email and Stay logged in are supported
-Spring AOP is used to standarize the logging
-All static messages are externalized into a into:
           . /spring/src/main/resources/messages.properties
           . /spring/src/main/resources/ValidationMessages.properties 
