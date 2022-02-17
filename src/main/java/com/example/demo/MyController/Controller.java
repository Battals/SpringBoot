package com.example.demo.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;
import java.time.DayOfWeek;


@RestController
public class Controller {

    //Opgave 1.1
    /*@GetMapping
    public String hello() {
        return "Hello User";
    }*/

    //Opgave 1.2
    /*@GetMapping("/input")
    public String echo(@RequestParam(name = "name") String input) {
        return input;
    }*/


    //Opgave 1.3
    int a = 3;
    @GetMapping("/wwwerdetfredagdk")
    public String mimic(){
        if (a == DayOfWeek.FRIDAY.ordinal()){
            return "Jubii, det er fredag idag";
        }
        return "Det er ikke fredag idag ):";
    }




}
