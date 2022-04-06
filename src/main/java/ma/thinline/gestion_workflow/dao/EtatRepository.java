package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Etat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtatRepository extends JpaRepository<Etat,Long> {

    List<Etat> findAll();

    Etat findByStatut(String statut);

}
