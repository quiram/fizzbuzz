# Build
`mvn clean verify`

# Run
`cd target`  
`java -jar fizzbuzz-1.0.jar`

# Notes
Code has been designed so the running class delegates to tested class as much logic as possible.
Running class will simply capture the arguments passed through the command line and pass them to the relevant classes.

Design has been focused on code readability, not necessarily performance. This is why the report on how many times each key was output is calculated as an aftermath and not straight in the class `FizzBuzz` (where it could be more efficient, but also messier).