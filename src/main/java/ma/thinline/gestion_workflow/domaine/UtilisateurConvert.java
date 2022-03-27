package ma.thinline.gestion_workflow.domaine;

import ma.thinline.gestion_workflow.modele.Utilisateur;

import java.util.ArrayList;
import java.util.List;

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

    public static Utilisateur toBo (UtilisateurVo vo) {
        if (vo == null || vo.getId_user() ==null)
            return null;
        Utilisateur user = new Utilisateur();
        user.setId_user(vo.getId_user());
        user.setAdresse(vo.getAdresse());
        user.setAge(vo.getAge());
        user.setPhone(vo.getPhone());
        user.setCin(vo.getCin());
        user.setEmail(vo.getEmail());
        user.setDateNaissance(vo.getDateNaissance());
        user.setFirst_name(vo.getFirst_name());
        user.setLast_name(vo.getLast_name());
        user.setPassword(vo.getPassword());
        user.setRole(vo.getRole());
        return user;
    }
    public static List<UtilisateurVo> toListVo (List <Utilisateur> listBo) {
        List<UtilisateurVo> listVo = new ArrayList<>();
        for (Utilisateur emp : listBo) {
            listVo.add(toVo(emp));
        }
        return listVo;
    }
}
