Spring-Boot REST service with Basic authentication and HTTPS encryption.


```java
curl localhost:8080/service/echo/hello

result --> {"timestamp":1490225765690,"status":401,"error":"Unauthorized","message":"Full authentication is required to access this resource","path":"/service/echo/hello"}

--

curl user1:secret1@localhost:8080/service/echo/hello

Hello user1, you said: hello

```

