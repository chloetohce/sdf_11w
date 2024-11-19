# SSF Day 11 Workshop Notes

## Changing port
`mvn spring-boot:run -Dserver.port=3000` or `java -Dserver.port=3000 -jar app.jar`

will alter the port used if the port is **not set** by the app itself. 


`mvn spring-boot:run -Dspring-boot.run.argument="--port=3000"`

is how you can pass custom CLI arguments to the app. You will need to manually read them. 