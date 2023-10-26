package ProjetVide.example.ProjetVide.Service;

import ProjetVide.example.ProjetVide.Entity.Utilisateurs;

import java.util.List;
import java.util.Optional;


public interface UtilisateurService {

    public Utilisateurs save (Utilisateurs utilisateurs);

    public Utilisateurs creer(Utilisateurs utilisateurs);

    public Utilisateurs modifier (Utilisateurs utilisateurs, Integer id);

    public List<Utilisateurs> findAll();

    public  Utilisateurs findById(Integer id);
}
