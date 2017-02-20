# MindTrails Example Application

This is a starting point / reference implementation of MindTrails.  Fork 
this project to get started developing your site.

# Why MindTrails?

MindTrails provides a quick start for building complete online psychology 
studies and cognitive behavioral modification programs.  It's mobile 
friendly, secure, and complete.  You can start with an attractive 
pre-built interface, and then customize it to fit your exact 
needs.  It works well with JSPsych and PiPlayer, popular javascript 
frameworks for creating behavioral experiments, but it can also accept 
any html
web form.  It stores data in a relational database where the tables match
your forms, making it very easy to run reports and analyze participant
responses.  It complies with the exacting security requirements of the
University of Virginia for capturing and storing highly sensitive data.
It provides critical tools for managing attrition, including automated 
email and text-message reminders, and it works with the Tango service to 
award gift cards to participants for reaching pre-defined milestones.  It 
also includes a complete administrative interface to manage user accounts,
view logs, track participant progress and monitor system health. 

We've used MindTrails to build studies at the University of Virginia for 
the last three years and learned many lessons in the process.  We are now
sharing  this with a larger community in the hopes of making it easier to 
launch similar studies in the future. Our goal is not just to 
support academic research, we hope that this platform can 
provide a safe mechanism for offering behavioral therapy to the public,
directly helping people that might otherwise not receive treatment.


# Getting Started


## Create a database
MiriamDB / Mysql are well tested, but most relational databases should work.
Here are the commands you would use to create a Mysql database named "mindtrails"
with a user "mtuser" and a password of "mtpass".  But you can and should
change these to something more secure.

> CREATE DATABASE mindtrails CHARACTER SET utf8 COLLATE utf8_general_ci;
> CREATE USER 'mtuser'@'localhost' IDENTIFIED BY 'mtpass';
> GRANT ALL PRIVILEGES ON mindtrails.* TO 'mtuser'@'%' IDENTIFIED BY 'mtpass' WITH GRANT OPTION;

## Update the Configuration
You will need to tell MindTrails how to connect to the Database, so
go edit the the application.properties file in /src/main/resources
and look for the section called "Database configuration". If you are
using MiramDB/Mysql you can just set the username and password, and you
are good to go.  
 
# Included files:

### org/mindtrails/example/Application.java
This configures your application paths.  You will need to make sure it
can find your own custom code by adding the package name of your 
application.  In this case it starts out as org.mindtails.example but
you will want to chose your own package name.

### resources/application.properties
This is how you configure MindTrails for your study.  You can specify
where you want to store collected information, if gift cards are awarded,
how email and text messages are sent, how data can be exported from the
system and more.   Please read the file carefully and make the necissary
adjustments.



