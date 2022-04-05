package ma.thinline.gestion_workflow.mapper;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.modele.Role;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface RoleMapper extends EntityMapper<RoleDto, Role> {
}
