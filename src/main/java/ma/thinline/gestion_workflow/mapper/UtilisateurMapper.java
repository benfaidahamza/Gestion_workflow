package ma.thinline.gestion_workflow.mapper;

import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.modele.Utilisateur;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring" , uses = {RoleMapper.class})
public interface UtilisateurMapper extends EntityMapper<UtilisateurDto,Utilisateur> {

}
