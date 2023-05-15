package app;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//metody zamieniające klase na klase bina
//@Configuration
//@Service
//@Component
@RestController
//@Controller
//@Repository
public class Display {

    @GetMapping("/displayHello")
    public String displayHello(String[] args) {
        return "Hello";
    }
}
