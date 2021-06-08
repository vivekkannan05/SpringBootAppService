package com.vivek;

import org.springframework.web.bind.annotation.*;

@RestController()
public class AppController {
        @GetMapping("/app/{id}")
        public @ResponseBody String greeting(@PathVariable("id") String name){
            return "Hello "+name;
        }
}

