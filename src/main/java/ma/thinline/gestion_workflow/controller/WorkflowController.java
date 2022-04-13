package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.service.IWorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Workflow")
public class WorkflowController {

    @Autowired
    private IWorkflowService workflowService;

    @GetMapping(value = "listworkflows")
    public ResponseEntity<Object> ViewWorkflows() {
        List<WorkflowDto> list= workflowService.getAllWorkflows();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<Object> getWorkflowByid(@PathVariable Long id ){
       WorkflowDto dto=workflowService.getWorkflowById(id);
       if(dto==null)
           return new ResponseEntity<>("le workflow n'existe pas",HttpStatus.OK);
       return new ResponseEntity<>(dto,HttpStatus.OK);

    }

    @GetMapping(value = "statut/{statut}")
    public ResponseEntity<Object> getByStatut(@PathVariable String statut)
    {
        List<WorkflowDto> dto=workflowService.getWorkflowByStatut(statut);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PostMapping(value="createworkflow")
    public ResponseEntity<Object> CreateWorkflow(@RequestBody WorkflowDto dto){
       workflowService.save(dto);
       return new ResponseEntity<>("le workflow a été créé avec succés",HttpStatus.CREATED);
    }

    @PutMapping(value ="updateworkflow/{id}")
    public ResponseEntity<Object> UpdateWorkflow(@PathVariable Long id,@RequestBody WorkflowDto dto ){
        if(workflowService.getWorkflowById(id)==null)
            return new ResponseEntity<>("le workflow n'existe pas",HttpStatus.OK);
        workflowService.UpdateWorkflow(id,dto);
        return new ResponseEntity<>("le workflow a été modifié avec succés",HttpStatus.OK);
    }

    @DeleteMapping(value ="deleteworkflow/{id}")
    public ResponseEntity<Object> DeleteWorkflow(@PathVariable Long id ){
        if(workflowService.getWorkflowById(id)==null)
            return new ResponseEntity<>("le workflow n'existe pas",HttpStatus.OK);
       workflowService.DeleteWorkflow(id);
       return ResponseEntity.ok("le workflow a été supprimé avec succés");
    }

}
