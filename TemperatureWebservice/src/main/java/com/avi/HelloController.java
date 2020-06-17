package com.avi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
    @RequestMapping("/conversions")
    public String conversions() {
        return "Hello World RESTful with Spring Boot";
    }  
    
    @GetMapping("/conversions/ktoc/{id}")
    public double ktoc(@PathVariable double id) { 
		return (id - 273.15);
    }  
    
    @GetMapping("/conversions/ctok/{id}")
    public double ctok(@PathVariable double id) { 
		return (id + 273.15);
    }  
    
    @GetMapping("/conversions/mtok/{id}")
    public double mtok(@PathVariable double id) { 
        return (id * 1.609);
    }
    public double ktom(@PathVariable double id) { 
        return (id / 1.609);
    }
}