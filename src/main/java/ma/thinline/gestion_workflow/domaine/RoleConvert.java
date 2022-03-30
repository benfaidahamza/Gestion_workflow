package ma.thinline.gestion_workflow.domaine;

import ma.thinline.gestion_workflow.modele.Role;
import java.util.ArrayList;
import java.util.List;


public class RoleConvert {

    public  static RoleVo toVo (Role bo)
    {
        if(bo==null )
            return null;
        RoleVo vo=new RoleVo();
        vo.setRole_id(bo.getRole_id());
        vo.setRole(bo.getRole());
        return vo;
    }
    public  static Role toBo (RoleVo Vo)
    {
        if(Vo==null)
            return null;
        Role bo=new Role();
        bo.setRole_id(Vo.getRole_id());
        bo.setRole(Vo.getRole());

        return bo;
    }
    public static List<RoleVo> toListVo (List <Role> listBo) {
        if (listBo == null || listBo.isEmpty())
            return null;
        List<RoleVo> listVo = new ArrayList<>();
        for (Role rolebo : listBo) {
            listVo.add(toVo(rolebo));
        }
        return listVo;
    }
    public static List<Role> toListBo (List<RoleVo> listVo) {
        if (listVo == null || listVo.isEmpty())
            return null;
        List<Role> listBo = new ArrayList<>();
        for (RoleVo rolevo : listVo) {
            listBo.add(toBo(rolevo));
        }
        return listBo;
    }



}
