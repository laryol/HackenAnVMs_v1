package com.example.springevilserver;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KeystrokeService {

    private List<String> keystrokeList = new ArrayList<>();

    public void add(String cookieString){
        this.keystrokeList.add(cookieString);
    }

    public String toString(){
        String keystrokeListString = "<h4>Keystrokes received:</h4><br>";
        for(String cookie : keystrokeList){
            keystrokeListString = keystrokeListString + cookie + "<br>";
        }
        return keystrokeListString;
    }
}
