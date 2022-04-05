package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.service.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UtilisateurController {

    @Autowired
    private IUserService userservice;

    @GetMapping(value = "/listusers")
    public ResponseEntity<List> ViewUsers() {
        List<UtilisateurDto> list= userservice.getAllUsers();
        return  ResponseEntity.ok(list);
    }

    @GetMapping(value = "email/{email}")
    public ResponseEntity<UtilisateurDto> getUserByUsernamePassword(@PathVariable("email") String email) {
        UtilisateurDto dto=userservice.findByEmail(email);
        return  ResponseEntity.ok(dto);
    }

    @PostMapping(value = "/Createuser")
    public ResponseEntity<UtilisateurDto> CreateUser(@RequestBody UtilisateurDto dto) {
        userservice.save(dto);
        return  ResponseEntity.ok(dto);
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<UtilisateurDto> getUserById(@PathVariable("id") Long id) {
        UtilisateurDto dto =userservice.getUserById(id);
        return  ResponseEntity.ok(dto);
    }

    @PutMapping(value="/Edit/{id}")
    public ResponseEntity<String> UpdateUser(@PathVariable Long id, @RequestBody UtilisateurDto dto) {
      userservice.UpdateUser(id,dto);
        return ResponseEntity.ok("l'utilisateur a été modifié avec succés");
    }

    @DeleteMapping(value ="/Delete/{id}")
    public ResponseEntity<String> DeleteUser(@PathVariable("id") Long id){
        userservice.DeleteUser(id);
        return ResponseEntity.ok("l'utilisateur a été supprimé avec succés");
    }

}
