package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Etat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtatRepository extends JpaRepository<Etat,Long> {

    List<Etat> findAll();

    Etat findByStatut(String statut);

}
