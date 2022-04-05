package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.UtilisateurDto;

import java.util.List;

public interface IUserService {

    UtilisateurDto findByEmail(String email);

    void save(UtilisateurDto utilisateurDto);

    void save(RoleDto roleDto);

    List<UtilisateurDto> getAllUsers();

    List<RoleDto> getAllRoles();

    RoleDto getRoleByName(String role);

    UtilisateurDto getUserById(Long id);

    void UpdateUser(Long id,UtilisateurDto dto);

    void DeleteUser (Long id);

}
