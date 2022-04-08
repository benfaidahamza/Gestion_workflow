package ma.thinline.gestion_workflow.mapper;

import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.modele.Workflow;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {TacheMapper.class})
public interface WorkflowMapper extends EntityMapper<WorkflowDto, Workflow>{
}
