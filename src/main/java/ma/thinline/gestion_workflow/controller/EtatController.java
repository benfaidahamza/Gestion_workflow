package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.EtatDto;
import ma.thinline.gestion_workflow.service.EtatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Etat")
public class EtatController {

    @Autowired
    private EtatServiceImpl etatService;

    @GetMapping(value = "listetats")
    public ResponseEntity<Object> ViewEtats() {
        List<EtatDto> list= etatService.getAllEtats();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value ="statut/{statut}")
    public ResponseEntity<Object> getEtatByStatut(@PathVariable String statut){
        EtatDto dto= etatService.getEtatByStatut(statut);
        if(dto==null)
            return new ResponseEntity<>("l'etat n'existe pas",HttpStatus.OK);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Object> getEtatById(@PathVariable Long id){
        EtatDto dto= etatService.getUserById(id);
        if(dto==null)
            return new ResponseEntity<>("l'etat n'existe pas",HttpStatus.OK);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PostMapping(value = "createetat")
    public ResponseEntity<Object> CreateEtat(@RequestBody EtatDto dto){
        etatService.saveEtat(dto);
        return new ResponseEntity<>("l'etat a été créé avec succés",HttpStatus.CREATED);
    }

    @PutMapping(value = "editetat/{id}")
    public  ResponseEntity<Object> UpdateEtat(@PathVariable Long id, @RequestBody EtatDto dto){
        if(etatService.getUserById(id)==null)
            return new ResponseEntity<>("l'état n'existe pas",HttpStatus.OK);
        etatService.UpdateEtat(id,dto);
        return new ResponseEntity("l'etat a été modifié avec succés",HttpStatus.OK);
    }

    @DeleteMapping(value ="deleteetat/{id}")
    public ResponseEntity<Object> DeleteEtat(@PathVariable Long id ){
        if(etatService.getUserById(id)==null)
            return new ResponseEntity<>("l'état n'existe pas",HttpStatus.OK);
        etatService.DeleteEtat(id);
        return new ResponseEntity("l'etat a été supprimé avec succés",HttpStatus.OK);
    }

}
