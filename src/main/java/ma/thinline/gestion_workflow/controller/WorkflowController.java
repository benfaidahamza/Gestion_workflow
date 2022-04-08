package ma.thinline.gestion_workflow.controller;

import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.modele.Workflow;
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

    @GetMapping(value = "/listusers")
    public ResponseEntity<List> ViewUsers() {
        List<WorkflowDto> list= workflowService.getAllWorkflows();
        return  ResponseEntity.ok(list);
    }

    @GetMapping(value = "/statut/{statut}")
    public ResponseEntity<List> getByStatut(@PathVariable String statut)
    {
        List<WorkflowDto> list=workflowService.getWorkflowByStatut(statut);
        return ResponseEntity.ok(list);
    }

    @PostMapping(value="/createworkflow")
    public ResponseEntity<WorkflowDto> CreateUser(@RequestBody WorkflowDto dto){
       workflowService.save(dto);
       return ResponseEntity.ok(dto);
    }

}
