package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.dto.WorkflowDto;

import java.util.List;

public interface IUserService {

    UtilisateurDto findByEmail(String email);

    void saveUser(UtilisateurDto utilisateurDto);

    List<UtilisateurDto> getAllUsers();

    UtilisateurDto getUserById(Long id);
    
    void UpdateUser(Long id,UtilisateurDto dto);
    
    void DeleteUser (Long id);

}
