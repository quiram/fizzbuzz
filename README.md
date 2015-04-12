# Build
`mvn clean verify`

# Run
`cd target`  
`java -jar fizzbuzz-1.0.jar`

# Notes
Code has been designed so the running class delegates to tested class as much logic as possible.
Running class will simply capture the arguments passed through the command line and pass them to the relevant classes.
