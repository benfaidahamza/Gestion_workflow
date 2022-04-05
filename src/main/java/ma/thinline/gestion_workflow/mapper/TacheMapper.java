package ma.thinline.gestion_workflow.mapper;

import ma.thinline.gestion_workflow.dto.TacheDto;
import ma.thinline.gestion_workflow.modele.Tache;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TacheMapper extends EntityMapper<TacheDto, Tache> {

}
