JPA Persistence in a modular maven application
=========================================

Setup & Build project - IMPORTANT
-------------------------
To let the project run without errors, build and install the whole project as a first step. Type the following on the command line:

    mvn clean compile install

Now locate your maven repository, under windows the path is mostly in your home directory. Mine is under _C:\Users\cternes\.m2\repository_.
If you located your maven repository, try to find the recently installed jar version of the JPA persistence entity project. Mine is under _C:\Users\cternes\.m2\repository\de\slackspace\tutorials\modular-jpa-persistence-entity\0.0.1-SNAPSHOT_.
Now open the pom.xml in the folder _de.slackspace.tutorials.web_.
Search for the first occurence of _entities.jar.location_ element and change the absolute file path to your jar file of the JPA persistence entity project in your maven repository. Mine looks like this:

    <entities.jar.location>file:C:/Users/cternes/.m2/repository/de/slackspace/tutorials/modular-jpa-persistence-entity/0.0.1-SNAPSHOT/modular-jpa-persistence-entity-0.0.1-SNAPSHOT.jar</entities.jar.location>
	
NOTE: Please remind to change the backslashes to slashes!

Now you can run the project with jetty.

Run with standalone Jetty
-------------------------

To run the project with maven and Jetty simply navigate to the folder _de.slackspace.tutorials.web_ and type the following on the command line:  

    mvn jetty:run

After the deployment you can access the project with your browser at http://localhost:8080/modular-jpa-persistence-web/

Run with another container
----------------------------
When running with another container than Jetty, you have to deploy the war-file manually.
You can generate the war-file by navigating to the folder _de.slackspace.tutorials.web_ typing on the command line:
 
    mvn clean compile package -Denvironment=prod

Now you will find the war-file in the target directory of the project.

