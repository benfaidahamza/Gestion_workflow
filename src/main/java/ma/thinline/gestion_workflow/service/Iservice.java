package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.domaine.RoleVo;
import ma.thinline.gestion_workflow.domaine.UtilisateurVo;
import ma.thinline.gestion_workflow.modele.Enumrole;

import java.util.List;

public interface Iservice {
    void save(UtilisateurVo user);
    void save(RoleVo role);
    List<UtilisateurVo> getAllUsers();
    RoleVo getRoleByName(Enumrole role);

}
