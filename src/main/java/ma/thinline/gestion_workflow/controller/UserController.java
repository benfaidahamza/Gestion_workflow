package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.domaine.RoleConvert;
import ma.thinline.gestion_workflow.domaine.RoleVo;
import ma.thinline.gestion_workflow.domaine.UtilisateurConvert;
import ma.thinline.gestion_workflow.domaine.UtilisateurVo;
import ma.thinline.gestion_workflow.modele.Role;
import ma.thinline.gestion_workflow.modele.Utilisateur;
import ma.thinline.gestion_workflow.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private EntityManager entity;
    @Autowired
    private IUserService userservice;
    @RequestMapping(value = { "/hello", "/" })
    public String hello() {
        return "Hello World";
    }

    @RequestMapping(value="/createuser",method = RequestMethod.POST)
    public void createuser(UtilisateurVo us)
    {
        userservice.save(us);
    }

    @RequestMapping(value="/Users",method = RequestMethod.GET)
    public  List<UtilisateurVo> viewusers()
    {
        return userservice.getAllUsers();
    }

    @RequestMapping(value ="/users/{email}",method = RequestMethod.GET)
    public UtilisateurVo getUserByUsernamePassword(@PathVariable("email") String email)
    {
        return userservice.findByEmail(email);
    }
    @RequestMapping(value ="/save", method = RequestMethod.POST)
    public void save(@RequestBody UtilisateurVo UserVo) {
        System.out.println("hamza");
        userservice.save(UserVo);
    }

    @RequestMapping(value ="/user/{id}",method = RequestMethod.GET)
    public UtilisateurVo getUserById(@PathVariable("id")Long id)
    {
      return userservice.getUserById(id);
    }


}
