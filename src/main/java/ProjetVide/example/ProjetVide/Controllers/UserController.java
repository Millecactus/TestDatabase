package ProjetVide.example.ProjetVide.Controllers;

import ProjetVide.example.ProjetVide.Entity.Utilisateurs;
import ProjetVide.example.ProjetVide.Service.UtilisateurService;
import jakarta.servlet.annotation.WebServlet;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("app/v1")
@AllArgsConstructor
@WebServlet ("/UserController")
public class UserController {

private final UtilisateurService utilisateurService;

    @PostMapping(name="/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public  Utilisateurs save(@RequestBody Utilisateurs utilisateurs){
        return utilisateurService.save(utilisateurs);
    };
    @PostMapping(value ="/creer",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateurs creer(@RequestBody Utilisateurs utilisateurs){
        return utilisateurService.creer(utilisateurs);
    }

    @PutMapping (value = "/modifier/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Utilisateurs modifier (@RequestBody Utilisateurs utilisateurs, @PathVariable Integer id ){
        return utilisateurService.modifier(utilisateurs, id);
    }

    @GetMapping("/afficher")
    public List<Utilisateurs> findAll(){
        return utilisateurService.findAll();
    };
}
