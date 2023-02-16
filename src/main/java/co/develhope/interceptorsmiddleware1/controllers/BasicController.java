package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/time")
public class BasicController {


    @GetMapping("")
    public String timeDay(){
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy/MM/dd - HH:mm");
        LocalDateTime date = LocalDateTime.now();
        return formattedDate.format(date);
    }

}