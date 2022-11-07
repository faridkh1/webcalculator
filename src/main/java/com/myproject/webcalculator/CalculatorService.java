package com.myproject.webcalculator;

import org.springframework.stereotype.Service;

import static java.lang.Double.isInfinite;

@Service
public class CalculatorService {
    public String sayHello()
    {
        return "Welcome to my online calculator!";
    }
    public String sum(int num1,int num2)
    {
        return "sum="+(num1+num2);
    }
    public  String sub(int a,int b)
    {
        return "substraction="+(a-b);
    }
    public String mult(int a,int b)
    {
        return "multiplication="+ a*b;
    }
    public String div(double a,double b)
    {

        if(isInfinite(a/b))
        {
            return "You can't divide on 0,please change your divider";
        }
        else
        {
            return "dividance="+a/b;
        }
    }

}
