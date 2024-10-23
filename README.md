# messagingService
Service to broadcast public messages.

# Run this service with an in memory db
1. Open the command prompt or terminal
2. Switch to the root of the project. 
3. Run `mvn clean install -Ph2db` to build the jar file. 
4. Run the application from the command prompt using `java -jar .\service\target\service-0.0.1-SNAPSHOT.jar --spring.profiles.active=h2db` command
5. NOTE once the application terminates all data will be lost.