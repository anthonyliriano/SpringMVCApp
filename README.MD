## Overview
A simple blog application using Spring MVC. The idea behind this project is to create an application that would allow registered users to submit random posts. A demo of project can be found on <a href="http://spring--mvc.herokuapp.com">spring--mvc.herokuapp.com</a> 

Credentials to submit a post: user/password

### Features:
- Create a random post
- Posts contain a title, author, contents, tags and votes
- Login in with user/password
- Register as a new user (user/password/email)
- View user profiles and their last five posts.
 
## Build
[![Build Status](https://travis-ci.org/anthonyliriano/SpringMVCApp.svg?branch=master)](https://travis-ci.org/anthonyliriano/SpringMVCApp)

## Tools
- JDK 8
- Maven 3
- IntelliJ


## Running the Project
Run the following maven command
```
mvn package
```
Run the application on the default port(8080) use ```--PORT``` to change default port.
```
java -cp target/classes:target/dependency/* Application.Application
```
## Open Source Components used
- Spring MVC, Spring Security, JSP
- Bootstrap 4