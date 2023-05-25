package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String adding(@PathVariable int number,@PathVariable int number2) {
        return number + " Plus " + number2 + " is " + (number+number2);
    }

    @RequestMapping(path = "/subtract/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtract(@PathVariable int number,@PathVariable int number2) {
        return number + " Subtract " + number2 + " is " + (number-number2);
    }

    @RequestMapping(path = "/multiply/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiply(@PathVariable int number,@PathVariable int number2) {
        return number + " Multiplied " + number2 + " is " + (number*number2);
    }

    @RequestMapping(path = "/divide/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divide(@PathVariable int number,@PathVariable int number2) {
        return number + " Divided " + number2 + " is " + (number/number2);
    }
}
