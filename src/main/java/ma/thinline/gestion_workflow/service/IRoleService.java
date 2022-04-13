package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.RoleDto;


import java.util.List;

public interface IRoleService {

    List<RoleDto> getAllRoles();

    RoleDto getRoleByName(String role);

    RoleDto getRoleById(Long id);

    void saveRole(RoleDto roleDto);

    void UpdateRole(Long id, RoleDto dto);

    void DeleteRole (Long id);

}
