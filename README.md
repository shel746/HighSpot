Hello!

This is my solution for the High Spot Coding Challenge, you can run my solution by following these steps:
1. Download java 8 if you do not have it. [Link](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
2. Download Jackson Core Jar in the HighSpot/src directory if you do not have it. [Link](http://www.java2s.com/Code/Jar/c/Downloadcomfasterxmljacksoncorejar.htm)
3. Download Jackson Databind Jar in the HighSpot/src directory if you do not have it. [Link](http://www.java2s.com/Code/Jar/c/Downloadcomfasterxmljacksondatabindjar.htm)
4. Download Jackson Annotations Jar in the HighSpot/src directory if you do not have it. [Link](http://www.java2s.com/Code/Jar/c/Downloadcomfasterxmljacksonannotationsjar.htm)
5. `javac -cp .:json-simple-1.1.1.jar:com.fasterxml.jackson.core.jar:com.fasterxml.jackson.databind.jar:com.fasterxml.jackson.annotations.jar HighSpotCLI.java`
6. `java -cp .:json-simple-1.1.1.jar:com.fasterxml.jackson.core.jar:com.fasterxml.jackson.databind.jar:com.fasterxml.jackson.annotations.jar HighSpotCLI mixtape-data.json changes.json`

Scaling Ideas:
If there are very large input file or very large change files:
This poses a problem because then the class that hold these objects become way too large for one host, causing out of memory exceptions.
So one way to solve this issue would to not read the whole file into a json object when opening the file, this would cause memory issues.
Instead, we can go into each object (example: users), and add each user one by one to an external database, such as DynamoDB.
This would allow us to go through all the data in the file without causing memory issues in our server and has the elasticity of a solution such as dynamodb.
Then for changes, we can do a similar idea, and step through one change at a time and apply that change to our dynamodb table.
Then, at the end, we can get each object one by one, reach it into our server and write it out to the file.

Thanks,
Kevin Shelton
