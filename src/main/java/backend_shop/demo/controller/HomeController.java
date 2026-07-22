package backend_shop.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/sasha")
    public String getText() {
        String text = "Sanchizes!";
        return text;
    }
    @GetMapping("/valia")
    public String returnValia() {
        return "Valia!";
    }

}
