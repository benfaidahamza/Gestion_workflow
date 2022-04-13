package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/User")
public class UtilisateurController {

    @Autowired
    private IUserService userservice;

    @GetMapping(value = "listusers")
    public ResponseEntity<Object> ViewUsers() {
        return new ResponseEntity<>(userservice.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(value = "email/{email}")
    public ResponseEntity<Object> getUserByEmail(@PathVariable("email") String email) {
        UtilisateurDto dto=userservice.findByEmail(email);
       if (dto==null)
            return new ResponseEntity<>("l'utilisateur n'existe pas", HttpStatus.OK);
        return new ResponseEntity<>(dto, HttpStatus.OK);

    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long id) {

        UtilisateurDto dto=userservice.getUserById(id);
        if (dto==null)
            return new ResponseEntity<>("l'utilisateur n'existe pas", HttpStatus.OK);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "Createuser")
    public ResponseEntity<Object> CreateUser(@Valid @RequestBody UtilisateurDto dto) {
        userservice.saveUser(dto);
        return new ResponseEntity<>("l'utilisateur a été crée", HttpStatus.CREATED);
    }

    @PutMapping(value="Edit/{id}")
    public ResponseEntity<Object> UpdateUser(@PathVariable Long id,@Valid @RequestBody UtilisateurDto dto) {
        if (userservice.getUserById(id) == null)
            return new ResponseEntity<>("l'utilisateur n'existe pas", HttpStatus.OK);

        userservice.UpdateUser(id,dto);
        return new ResponseEntity<>("l'utilisateur a été modifié avec succés", HttpStatus.OK);
    }

    @DeleteMapping(value ="Delete/{id}")
    public ResponseEntity<String> DeleteUser(@PathVariable("id") Long id){
        if (userservice.getUserById(id) == null)
            return new ResponseEntity<>("l'utilisateur n'existe pas", HttpStatus.OK);
        userservice.DeleteUser(id);
        return new ResponseEntity<>("l'utilisateur a été supprimé avec succés", HttpStatus.OK);
    }

}
