package mx.unam.aragon.com.musicamvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class MainController {

    @GetMapping("/")
    public String obtenerInicio() {{
        return "index";}
    }
}
