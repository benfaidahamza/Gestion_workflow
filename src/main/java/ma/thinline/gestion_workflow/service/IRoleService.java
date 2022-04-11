package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.modele.Role;

import java.util.List;

public interface IRoleService {

    List<RoleDto> getAllRoles();

    RoleDto getRoleByName(String role);

    RoleDto getUserById(Long id);

    void saveRole(RoleDto roleDto);

    void UpdateRole(Long id, RoleDto dto);

    void DeleteRole (Long id);

}
