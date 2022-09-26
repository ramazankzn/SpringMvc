package alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class CalculatorController {
    @GetMapping("/calculator")
    public String calculate (@RequestParam(value = "a", defaultValue = "0") int a,
                             @RequestParam(value = "b", defaultValue = "0") int b,
                             @RequestParam(value = "action") String action,
                             Model model) {
        double result = 0.0;
        char actionChar = '?';
        if (action.equalsIgnoreCase("multiplication")) {
            result = a * b;
            actionChar = '*';
        }
        else if (action.equalsIgnoreCase("addition")) {
            result = a + b;
            actionChar = '+';
        }
        else if (action.equalsIgnoreCase("subtraction")) {
            result = a - b;
            actionChar = '-';
        }
        else if (action.equalsIgnoreCase("division")) {
            result = (double) a / b;
            actionChar = '/';
        }
        model.addAttribute("result", a + " " + actionChar + " " + b + " = " + result);
        return "calculator/calculate" ;
    }
}
