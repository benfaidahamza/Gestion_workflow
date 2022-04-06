package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TacheRepository extends JpaRepository<Tache,Long> {

}
