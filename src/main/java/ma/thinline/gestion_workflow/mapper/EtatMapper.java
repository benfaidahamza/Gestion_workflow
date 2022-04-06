package ma.thinline.gestion_workflow.mapper;

import ma.thinline.gestion_workflow.dto.EtatDto;
import ma.thinline.gestion_workflow.modele.Etat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtatMapper extends EntityMapper<EtatDto, Etat> {

}
