package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorkflowRepository extends JpaRepository<Workflow,Long> {

    List<Workflow> findAll();

    List<Workflow> findAllByStatut(String statut);

}
