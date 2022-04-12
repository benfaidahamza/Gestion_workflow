package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.TacheDto;
import ma.thinline.gestion_workflow.modele.Tache;
import ma.thinline.gestion_workflow.service.TacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Tache")
public class TacheController {

    @Autowired
    private TacheServiceImpl tacheService;

    @GetMapping(value = "listtaches")
    public ResponseEntity<List> ViewTaches() {
        List<TacheDto> list= tacheService.getAllTaches();
        return  ResponseEntity.ok(list);
    }

    @GetMapping(value ="titre/{titre}")
    public ResponseEntity<TacheDto> getRoleByName(@PathVariable String titre){
        return ResponseEntity.ok(tacheService.getTacheByTitre(titre));
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<TacheDto> getRoleById(@PathVariable Long id){
        return ResponseEntity.ok(tacheService.getTacheById(id));
    }

    @PostMapping(value = "createtache")
    public ResponseEntity<String> CreateRole(@RequestBody TacheDto dto){
        tacheService.save(dto);
        return ResponseEntity.ok("la tache a été créé avec succés");
    }

    @PutMapping(value = "edittache/{id}")
    public  ResponseEntity<String> UpdateRole(@PathVariable Long id, @RequestBody TacheDto dto){
        tacheService.UpdateTache(id,dto);
        return ResponseEntity.ok("la tache a été modifié avec succés");
    }

    @DeleteMapping(value ="deletetache/{id}")
    public ResponseEntity<String> DeleteRole(@PathVariable Long id ){
        tacheService.DeleteTache(id);
        return ResponseEntity.ok("la tache a été supprimé avec succés");
    }

}
