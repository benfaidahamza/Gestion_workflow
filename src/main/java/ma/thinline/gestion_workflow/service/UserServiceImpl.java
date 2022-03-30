package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dao.RoleRepository;
import ma.thinline.gestion_workflow.dao.UserRepository;
import ma.thinline.gestion_workflow.domaine.RoleConvert;
import ma.thinline.gestion_workflow.domaine.RoleVo;
import ma.thinline.gestion_workflow.domaine.UtilisateurConvert;
import ma.thinline.gestion_workflow.domaine.UtilisateurVo;
import ma.thinline.gestion_workflow.modele.Role;
import ma.thinline.gestion_workflow.modele.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements  IUserService{
    @Autowired
    private UserRepository userrepo;
    @Autowired
    private RoleRepository rolerepo;
    //@Autowired(required = true)
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(UserRepository userrepo,RoleRepository rolerepo/*,BCryptPasswordEncoder bCryptPasswordEncoder*/ )
    {
        this.userrepo=userrepo;
        this.rolerepo=rolerepo;
        //this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }

   /* @Override
    public UserDetails loadUserByEmail (String email) throws UsernameNotFoundException{
        Utilisateur user=userrepo.findByEmail(email);
        boolean enabled =true;
        boolean accountNonExpired=true;
        boolean credentialsNonExpired=true;
        boolean accountNonLocked= true;
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),enabled,accountNonExpired,credentialsNonExpired,accountNonLocked,getAuthorities(user.getRole()));
    }*/
    @Override
    public void save (UtilisateurVo vo)
    {
        System.out.println("1");
        System.out.println(vo.getFirst_name());
        Utilisateur bo= UtilisateurConvert.toBo(vo);
        System.out.println(vo.getAdresse());
        List<Role> rolesPersist = new ArrayList<>();
        System.out.println("2");
        for (Role role : bo.getRoles()) {
            Role userRole = rolerepo.findByRole(role.getRole()).get(0);
            rolesPersist.add(userRole);
        }
        System.out.println("1");
        bo.setRoles(rolesPersist);
        userrepo.save(bo);
    }
    @Override
    public UtilisateurVo findByEmail(String Email)
    {
        return UtilisateurConvert.toVo(userrepo.findByEmail(Email));
    }

    @Override
    public List<UtilisateurVo> getAllUsers()
    {
        return UtilisateurConvert.toListVo(userrepo.findAll());
    }

    @Override
    public List<RoleVo> getAllRoles() {
        return RoleConvert.toListVo(rolerepo.findAll());
    }
    @Override
    public void save(RoleVo roleVo) {
        rolerepo.save(RoleConvert.toBo(roleVo));
    }

    @Override
    public RoleVo getRoleByName(String role) {
        return RoleConvert.toVo(rolerepo.findByRole(role).get(0));
    }





}
