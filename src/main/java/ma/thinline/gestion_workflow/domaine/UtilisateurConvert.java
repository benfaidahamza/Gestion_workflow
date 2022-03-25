package ma.thinline.gestion_workflow.domaine;

import ma.thinline.gestion_workflow.modele.Utilisateur;

public class UtilisateurConvert {

    public static UtilisateurVo toVo (Utilisateur user) {
        if (user == null || user.getId_user() ==null)
            return null;
        UtilisateurVo vo = new UtilisateurVo();
        vo.setId_user(user.getId_user());
        vo.setAdresse(user.getAdresse());
        vo.setAge(user.getAge());
        vo.setPhone(user.getPhone());
        vo.setCin(user.getCin());
        vo.setEmail(user.getEmail());
        vo.setDateNaissance(user.getDateNaissance());
        vo.setFirst_name(user.getFirst_name());
        vo.setLast_name(user.getLast_name());
        vo.setPassword(user.getPassword());
        vo.setRole(user.getRole());
        return vo;
    }
}
