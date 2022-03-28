package ma.thinline.gestion_workflow.domaine;

import ma.thinline.gestion_workflow.modele.Utilisateur;

import java.util.ArrayList;
import java.util.List;


public class UtilisateurConvert {

    public static UtilisateurVo toVo (Utilisateur user) {
        if (user == null || user.getUser_id() ==null)
            return null;
        UtilisateurVo vo = new UtilisateurVo();
        vo.setUser_id(user.getUser_id());
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
        if (vo == null || vo.getUser_id() ==null)
            return null;
        Utilisateur user = new Utilisateur();
        user.setUser_id(vo.getUser_id());
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
        if (listBo == null || listBo.isEmpty())
            return null;
        List<UtilisateurVo> listVo = new ArrayList<>();
        for (Utilisateur emp : listBo) {
            listVo.add(toVo(emp));
        }
        return listVo;
    }

    public static List<Utilisateur> toListBo (List <UtilisateurVo> listVo) {
        if (listVo == null || listVo.isEmpty())
            return null;
        List<Utilisateur> listBo = new ArrayList<>();
        for (UtilisateurVo emp : listVo) {
            listBo.add(toBo(emp));
        }
        return listBo;
    }
}
