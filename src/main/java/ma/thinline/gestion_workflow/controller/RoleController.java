package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Role")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @GetMapping(value = "listroles")
    public ResponseEntity<Object> ViewRoles() {
        return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);
    }

    @GetMapping(value ="name/{name}")
    public ResponseEntity<Object> getRoleByName(@PathVariable String name){
        RoleDto dto=roleService.getRoleByName(name);
        if(dto==null)
            return new ResponseEntity<>("le role n'existe pas",HttpStatus.OK);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Object> getRoleById(@PathVariable Long id){
        RoleDto dto=roleService.getRoleById(id);
        if(dto==null)
            return new ResponseEntity<>("le role n'existe pas",HttpStatus.OK);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PostMapping(value = "createrole")
    public ResponseEntity<Object> CreateRole(@Valid @RequestBody RoleDto dto){
        roleService.saveRole(dto);
        return new ResponseEntity<>("le role a été créé avec succés",HttpStatus.CREATED);
    }

    @PutMapping(value = "edit/{id}")
    public  ResponseEntity<Object> UpdateRole(@PathVariable Long id,@Valid @RequestBody RoleDto dto){
        if(roleService.getRoleById(id)==null)
            return new ResponseEntity<>("le role n'existe pas",HttpStatus.OK);
        roleService.UpdateRole(id,dto);
        return new ResponseEntity<>("le role a été modifié avec succés",HttpStatus.OK);
    }

    @DeleteMapping(value ="deleterole/{id}")
    public ResponseEntity<Object> DeleteRole(@PathVariable Long id ){
        if (roleService.getRoleById(id)== null)
            return new ResponseEntity<>("le role n'existe pas", HttpStatus.OK);
        roleService.DeleteRole(id);
        return new ResponseEntity<>("le role a été supprimé avec succés", HttpStatus.OK);
    }

}
