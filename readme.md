http://localhost:8080/ no security

http://localhost:8080/private use (user: user, pw: password) see SecurityConfig line 64

http://localhost:8080/api/posts same as /private

http://localhost:8080/h2-console/

connection: jdbc:h2:mem:blog
user: sa
pw:

This is a simple example of how to use Spring Security with multiple Beans for different 
endpoints that needs to be secured in different ways.