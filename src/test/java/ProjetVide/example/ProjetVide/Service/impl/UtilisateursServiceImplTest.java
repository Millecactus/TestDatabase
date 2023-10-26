package ProjetVide.example.ProjetVide.Service.impl;

import ProjetVide.example.ProjetVide.Entity.Utilisateurs;
import ProjetVide.example.ProjetVide.Service.UtilisateurService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateursServiceImplTest {

    @Autowired
    private UtilisateurService utilisateurService;

    @Test
    public  void shouldSaveUtilisateur(){

        Utilisateurs expectedUser= new Utilisateurs();
        expectedUser.setId(1);
        expectedUser.setNom("test nom");
        expectedUser.setEmail("test@gmail.com");
        expectedUser.setPassword("test");

         Utilisateurs savedUser = utilisateurService.save(expectedUser);

        assertNotNull(savedUser);
        assertNotNull(savedUser.getId());
        assertEquals(expectedUser.getNom() , savedUser.getNom());
        assertEquals(expectedUser.getEmail() , savedUser.getEmail());
        assertEquals(expectedUser.getPassword() , savedUser.getPassword());
    }

}