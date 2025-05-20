package mx.unam.aragon.com.musicamvc.controllers;

import mx.unam.aragon.com.musicamvc.models.Artista;
import mx.unam.aragon.com.musicamvc.services.ArtistaService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tienda")
public class MusicaController {

    @Autowired
    private ArtistaService artistaService;

    @GetMapping("/home/")
    public String home() {
        return "home";
    }

    @GetMapping("/artista/")
    public String artista(Model model) {
        Artista artista = new Artista("Kendrick", "Hip Hop", 37, "The GOAT", "https://people.com/thmb/i6c3G3AXGNSjcGGFQH1qT1txIOk=/4000x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(739x252:741x254)/kendrick-lamar-super-bowl-lix-halftime-show-new-orleans-021025-d475390879514d9bbcc5f21f79814ecb.jpg" );
        model.addAttribute("artista", artista);
        return "artista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("artista", new Artista());
        return "formArtista";
    }

    @PostMapping("/guardar")
    public String guardar(
            @ModelAttribute Artista artista

    ) {
        LoggerFactory.getLogger(getClass()).info("Guardando artista " + artista);
        //Mandarlo  a db
        artistaService.guardarArtista(artista);
        return "redirect:/tienda/nuevo?exito";
    }

    @GetMapping("/artista/{id}")
    public String artista(@PathVariable Integer id, Model model) {
        model.addAttribute("artista", artistaService.getArtista(id));
        return "artista";
    }
}
