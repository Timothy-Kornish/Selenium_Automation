# Selenium_Automation

To create a maven project, run command:

for sample project: -DarchetypeArtifactId=maven-archetype-quickstart
for webapp project: -DarchetypeArtifactId=maven-archetype-webapp

mvn archetype:generate -DgroupId=<projectId> -DartifactId=<projectName> -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

to make it compatible with eclipse:

mvn eclipse:eclipse


when running file follow steps:

1) mvn compile

2) mvn build

3) mvn test
