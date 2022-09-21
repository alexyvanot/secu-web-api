package fr.alexyvanot.secuwebapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alexyvanot.secuwebapi.core.Utilisateur;

@RestController
public class IndexController {

    @GetMapping("/")
    public Utilisateur index() {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        return utilisateur;
    }
}
