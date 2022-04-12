package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Tache;
import ma.thinline.gestion_workflow.modele.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long> {

    List<Tache> findAll();

    Tache findAllByTitre(String titre);


}
