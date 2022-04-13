package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.dto.WorkflowDto;


import java.util.List;

public interface IWorkflowService {

    List<WorkflowDto> getAllWorkflows();

    void saveWorkflow(WorkflowDto dto);

    List<WorkflowDto> getWorkflowByStatut(String statut);

    WorkflowDto getWorkflowById(Long id);

    void UpdateWorkflow(Long id,WorkflowDto dto);

    void DeleteWorkflow (Long id);
}
