package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.domaine.RoleVo;
import ma.thinline.gestion_workflow.domaine.UtilisateurVo;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService /*extends UserDetailsService*/ {



    UtilisateurVo findByEmail(String email);
    void save(UtilisateurVo user);
    void save(RoleVo role);
    List<UtilisateurVo> getAllUsers();
    List<RoleVo> getAllRoles();
    RoleVo getRoleByName(String role);

}
