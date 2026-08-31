package com.example.test.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@CrossOrigin
public class TestController {
    @GetMapping("shai")
    public String shai() {
        return " 를 만든사람 : Shai";
    }
    @GetMapping("test")
    public String test(){
        int[] arr = {1, 2, 3, 4};
        return Arrays.toString(arr);
    }
}
