package controller;

import model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("myCounter1")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("myCounter1")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("myCounter1") MyCounter myCounter) {
        myCounter.increment();
        return "view";
    }
}