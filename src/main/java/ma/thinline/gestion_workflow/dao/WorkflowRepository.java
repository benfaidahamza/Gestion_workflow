package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkflowRepository extends JpaRepository<Workflow,Long> {

    List<Workflow> findAll();

    List<Workflow> findAllByStatut(String statut);

}
