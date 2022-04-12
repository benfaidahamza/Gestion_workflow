package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.modele.Role;
import ma.thinline.gestion_workflow.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Role")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping(value = "listroles")
    public ResponseEntity<List> ViewRoles() {
        List<RoleDto> list= roleService.getAllRoles();
        return  ResponseEntity.ok(list);
    }

    @GetMapping(value ="name/{name}")
    public ResponseEntity<RoleDto> getRoleByName(@PathVariable String name){
        return ResponseEntity.ok(roleService.getRoleByName(name));
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<RoleDto> getRoleById(@PathVariable Long id){
        return ResponseEntity.ok(roleService.getUserById(id));
    }

    @PostMapping(value = "createrole")
    public ResponseEntity<String> CreateRole(@RequestBody RoleDto dto){
        roleService.saveRole(dto);
        return ResponseEntity.ok("le role a été créé avec succés");
    }

    @PutMapping(value = "editrole/{id}")
    public  ResponseEntity<String> UpdateRole(@PathVariable Long id, @RequestBody RoleDto dto){
        roleService.UpdateRole(id,dto);
        return ResponseEntity.ok("le role a été modifié avec succés");
    }

    @DeleteMapping(value ="deleterole/{id}")
    public ResponseEntity<String> DeleteRole(@PathVariable Long id ){
        roleService.DeleteRole(id);
        return ResponseEntity.ok("le role a été supprimé avec succés");
    }

}
