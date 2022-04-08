package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long> {

}
