package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.service.IWorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Workflow")
public class WorkflowController {

    @Autowired
    private IWorkflowService workflowService;

    @GetMapping(value = "listworkflows")
    public ResponseEntity<List> ViewWorkflows() {
        List<WorkflowDto> list= workflowService.getAllWorkflows();
        return  ResponseEntity.ok(list);
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<WorkflowDto> getWorkflowByid(@PathVariable Long id ){
        return ResponseEntity.ok(workflowService.getWorkflowById(id));
    }

    @GetMapping(value = "statut/{statut}")
    public ResponseEntity<List> getByStatut(@PathVariable String statut)
    {
        List<WorkflowDto> list=workflowService.getWorkflowByStatut(statut);
        return ResponseEntity.ok(list);
    }

    @PostMapping(value="createworkflow")
    public ResponseEntity<String> CreateWorkflow(@RequestBody WorkflowDto dto){
       workflowService.save(dto);
       return ResponseEntity.ok("le workflow a été créé avec succés");
    }

    @PutMapping(value ="updateworkflow/{id}")
    public ResponseEntity<String> UpdateWorkflow(@PathVariable Long id,@RequestBody WorkflowDto dto ){
        workflowService.UpdateWorkflow(id,dto);
        return ResponseEntity.ok("le workflow a été modifié avec succés");
    }

    @DeleteMapping(value ="deleteworkflow/{id}")
    public ResponseEntity<String> DeleteWorkflow(@PathVariable Long id ){
       workflowService.DeleteWorkflow(id);
       return ResponseEntity.ok("le workflow a été supprimé avec succés");
    }

}
