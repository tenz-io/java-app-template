build:
	mvn clean package -DskipTests


.PHONY: run
run:
	mvn spring-boot:run -Dspring-boot.run.arguments=--arg1=foo,--arg2=bar
#	java -jar target/java-app-template.jar arg1 arg2



.PHONY: test
test:
	mvn clean test