package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dao.WorkflowRepository;
import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.mapper.WorkflowMapper;
import ma.thinline.gestion_workflow.modele.Workflow;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WorkflowServiceImpl implements IWorkflowService{

    private final WorkflowRepository workflowRepository;
    private final WorkflowMapper workflowMapper;

    public WorkflowServiceImpl(WorkflowMapper workflowMapper,WorkflowRepository workflowRepository) {
       this.workflowMapper=workflowMapper;
       this.workflowRepository=workflowRepository;
    }

    @Override
    public List<WorkflowDto> getAllWorkflows() {return workflowMapper.toDto(workflowRepository.findAll());}

    @Override
    public void save(WorkflowDto dto){
        Workflow entity=workflowMapper.toEntity(dto);
        workflowRepository.save(entity);
    }

    @Override
    public List<WorkflowDto> getWorkflowByStatut(String statut)
    {
        return workflowMapper.toDto(workflowRepository.findAllByStatut(statut));
    }

    @Override
    public void UpdateWorkflow(Long id, WorkflowDto dto){
        Workflow entity=workflowRepository.getById(id);
        entity.setStatut(dto.getStatut());
        entity.setTitre(dto.getTitre());
    }

    @Override
    public void DeleteWorkflow(Long id ){workflowRepository.delete(workflowRepository.getById(id));}

    @Override
    public  WorkflowDto getWorkflowById(Long id){
        boolean trouve = workflowRepository.existsById(id);
        if (!trouve)
            return null;
        return workflowMapper.toDto(workflowRepository.getOne(id));
    }
}
