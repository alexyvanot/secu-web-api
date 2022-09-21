package fr.alexyvanot.secuwebapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.alexyvanot.secuwebapi.core.User;

@RestController
public class IndexController {

    @GetMapping("/")
    public User index() {
        User utilisateur = new User();
        utilisateur.setNom("Toto");
        utilisateur.setPrenom("Tata");
        return utilisateur;
    }
}
