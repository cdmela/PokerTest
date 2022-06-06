#Please note that the program's point of entry is FiveCardDrawerTester class
#JUnit tests are at the follwoing location: src\test\java\poker

#------To clean, package and run the application------

$ mvn clean package -DskipTests
$ cd target/
$ java -jar PokerTest-1.0.jar

#-------To run the tests------------------------------
$ mvn test

