package mx.unam.aragon.com.musicamvc.services;

import mx.unam.aragon.com.musicamvc.models.Artista;
import mx.unam.aragon.com.musicamvc.repositories.ArtistaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService {

    @Autowired
    private ArtistaRepositorie artistaRepositorie;


    public boolean guardarArtista(Artista artista) {
        Artista result = artistaRepositorie.save(artista);
        return result != null;
    }

    public Artista getArtista(Integer id) {
        return artistaRepositorie.getById(id);

    }
}
