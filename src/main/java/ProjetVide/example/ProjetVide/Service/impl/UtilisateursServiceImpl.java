package ProjetVide.example.ProjetVide.Service.impl;

import ProjetVide.example.ProjetVide.Entity.Utilisateurs;
import ProjetVide.example.ProjetVide.Repository.UserRepository;
import ProjetVide.example.ProjetVide.Service.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UtilisateursServiceImpl implements UtilisateurService {

    private final UserRepository userRepository;

    @Override
    public Utilisateurs save(Utilisateurs utilisateurs) {
        return userRepository.save(utilisateurs);
    }


    @Override
    public Utilisateurs creer(Utilisateurs utilisateurs) {

        return userRepository.save(utilisateurs);
    }

    @Override
    public Utilisateurs modifier(Utilisateurs utilisateurs, Integer id) {
        return  userRepository.findById(id)
                .map( u -> {
                    u.setNom(u.getNom());
                    u.setEmail(u.getEmail());
                    u.setPassword(u.getPassword());
                    return userRepository.save(u);
                }).orElseThrow(() ->new RuntimeException("L'utilisateur n'existe pas"));
    }

    @Override
    public List<Utilisateurs> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Utilisateurs findById(Integer id) {
        return null;
    }

}
