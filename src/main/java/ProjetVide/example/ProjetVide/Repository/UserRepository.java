package ProjetVide.example.ProjetVide.Repository;

import ProjetVide.example.ProjetVide.Entity.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <Utilisateurs , Integer > {

    public Utilisateurs save (Utilisateurs utilisateurs);

    Utilisateurs findByNom(String nom);

    @Override
    Optional<Utilisateurs> findById(Integer id);

    public List<Utilisateurs> findAll();

    @Query("INSERT INTO Utilisateurs (nom, email,password) VALUES (:nom,:email, :password)")
    public Utilisateurs creer(@Param("nom")String nom,
                              @Param ("email")String email,
                              @Param("password") String password);
}
