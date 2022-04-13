package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.TacheDto;
import ma.thinline.gestion_workflow.modele.Tache;
import ma.thinline.gestion_workflow.service.TacheServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("Tache")
public class TacheController {

    @Autowired
    private TacheServiceImpl tacheService;

    @GetMapping(value = "listtaches")
    public ResponseEntity<Object> ViewTaches() {
        List<TacheDto> list= tacheService.getAllTaches();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value ="titre/{titre}")
    public ResponseEntity<Object> getRoleByName(@PathVariable String titre){
        TacheDto dto= tacheService.getTacheByTitre(titre);
        if (dto==null)
            return new ResponseEntity<>("la tache n'existe pas", HttpStatus.OK);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Object> getRoleById(@PathVariable Long id){
        TacheDto dto= tacheService.getTacheById(id);
        if (dto==null)
            return new ResponseEntity<>("la tache n'existe pas", HttpStatus.OK);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping(value = "createtache")
    public ResponseEntity<String> CreateRole(@Valid @RequestBody TacheDto dto){
        tacheService.saveTache(dto);
        return new ResponseEntity<>("la tache a été crée", HttpStatus.CREATED);
    }

    @PutMapping(value = "edittache/{id}")
    public  ResponseEntity<String> UpdateRole(@PathVariable Long id,@Valid @RequestBody TacheDto dto){
        if (tacheService.getTacheById(id) == null)
            return new ResponseEntity<>("la tache n'existe pas", HttpStatus.OK);
        tacheService.UpdateTache(id,dto);
        return new ResponseEntity<>("la tache a été modifié avec succés", HttpStatus.OK);
    }

    @DeleteMapping(value ="deletetache/{id}")
    public ResponseEntity<String> DeleteRole(@PathVariable Long id ){
        if (tacheService.getTacheById(id) == null)
            return new ResponseEntity<>("la tache n'existe pas", HttpStatus.OK);
        tacheService.DeleteTache(id);
        return new ResponseEntity<>("la tache a été supprimé avec succés", HttpStatus.OK);
    }

}
