package mx.unam.aragon.com.musicamvc.controllers;

import mx.unam.aragon.com.musicamvc.models.Artista;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tienda")
public class MusicaController {
    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista("Kendrick", "Hip Hop", 37, "The GOAT", "https://media.gettyimages.com/id/2197345941/es/foto/los-angeles-california-kendrick-lamar-winner-of-record-of-the-year-best-rap-performance-best.jpg?s=612x612&w=0&k=20&c=6u1u6UAq1hzhO4XWKoXupiu_LqUOdDW8m8yV14BXh4c=");
        model.addAttribute("artista", artista);
        return "artista";
    }
}
