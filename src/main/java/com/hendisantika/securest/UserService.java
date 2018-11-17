package com.hendisantika.securest;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * Sample service.
 *
 * @author Hendi Santika - hendisantika@gmail.com.
 * Twitter & Telegram : @hendisantika34
 */
@RestController
@RequestMapping("/service")
public class UserService {

    @GetMapping("echo/{in}")
    public String echo(@PathVariable(value = "in") final String in, @AuthenticationPrincipal final UserDetails user) {
        return "Hello " + user.getUsername() + ", you said: " + in;
    }

    @PostMapping("post")
    public void post(@RequestBody final String in, @AuthenticationPrincipal final UserDetails user) {
        System.out.println("User " + user.getUsername() + " posting " + in);
    }

    @PutMapping("put")
    public void put(@RequestBody final String in, @AuthenticationPrincipal final UserDetails user) {
        System.out.println("User " + user.getUsername() + " putting " + in);
    }

    @DeleteMapping("delete/{in}")
    public void delete(@PathVariable(value = "in") final String in, @AuthenticationPrincipal final UserDetails user) {
        System.out.println("User " + user.getUsername() + " deleting " + in);
    }
}
