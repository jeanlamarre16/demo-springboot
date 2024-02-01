package fr.epsi.b3.demospringboot.dal;

import fr.epsi.b3.demospringboot.bo.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne, Integer> {

    @RestResource(path = "by-name")
    List<Personne> f();
}
