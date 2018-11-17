Spring-Boot REST service with Basic authentication and HTTPS encryption.


```java
curl localhost:8080/service/echo/hello

result --> {"timestamp":1490225765690,"status":401,"error":"Unauthorized","message":"Full authentication is required to access this resource","path":"/service/echo/hello"}

--

curl user1:secret1@localhost:8080/service/echo/hello

Hello user1, you said: hello

```

or using [httpie](https://httpie.org/)

`http localhost:8080/service/echo/hello`

Result :
```
HTTP/1.1 401
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Content-Type: application/json;charset=UTF-8
Date: Sat, 17 Nov 2018 01:26:41 GMT
Expires: 0
Pragma: no-cache
Set-Cookie: JSESSIONID=601DFBF63F556556BBC87C444E3BFFA5; Path=/; HttpOnly
Transfer-Encoding: chunked
WWW-Authenticate: Basic realm="Realm"
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
X-XSS-Protection: 1; mode=block

{
    "error": "Unauthorized",
    "message": "Full authentication is required to access this resource",
    "path": "/service/echo/hello",
    "status": 401,
    "timestamp": 1542418001419
}
```

Add Username & Password :
Request : `http -a user1:secret1 localhost:8080/service/echo/hello`

Response :
```
HTTP/1.1 200
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Content-Length: 28
Content-Type: text/plain;charset=UTF-8
Date: Sat, 17 Nov 2018 01:36:12 GMT
Expires: 0
Pragma: no-cache
Set-Cookie: JSESSIONID=8D292294AC198F301D8BE21CEA61849D; Path=/; HttpOnly
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
X-XSS-Protection: 1; mode=block

Hello user1, you said: hello
```





