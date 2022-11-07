package com.myproject.webcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String sayHello ()
    {
        return calculatorService.sayHello();
    }
    @GetMapping(path = "/hello")
    public String sayhello(@RequestParam("name")String username)
    {
        return "Hello,"+username+",welcome to my online calculator!";
    }
    @GetMapping(path = "/sum")
    public String sum(@RequestParam("num1")int num1,@RequestParam("num2")int num2)
    {
        return calculatorService.sum(num1,num2);
    }
    @GetMapping(path = "/sub")
    public String sub(@RequestParam("num1")int num1,@RequestParam("num2")int num2)
    {
        return calculatorService.sub(num1,num2);
    }
    @GetMapping(path ="/mult")
    public String mult(@RequestParam("num1")int num1,@RequestParam("num2")int num2)
    {
        return calculatorService.mult(num1,num2);
    }
    @GetMapping(path ="/div")
    public String div(@RequestParam("num1")int num1,@RequestParam("num2")int num2)
    {
        return calculatorService.div(num1,num2);
    }

}
