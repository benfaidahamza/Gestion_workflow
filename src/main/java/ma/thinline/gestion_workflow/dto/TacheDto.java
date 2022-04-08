package ma.thinline.gestion_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor

public class TacheDto implements Serializable {
    private Long tache_id;
    private String titre;
    private String type;
    private Date date_validation;
    private String assignement;
    private int ordre;
    private WorkflowDto workflow;
    private EtatDto etat;

    public Long getTache_id() {return tache_id;}

    public void setTache_id(Long tache_id) {this.tache_id = tache_id;}

    public String getTitre() {return titre;}

    public void setTitre(String titre) {this.titre = titre;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public Date getDate_validation() {return date_validation;}

    public void setDate_validation(Date date_validation) {this.date_validation = date_validation;}

    public String getAssignement() {return assignement;}

    public void setAssignement(String assignement) {this.assignement = assignement;}

    public int getOrdre() {return ordre;}

    public void setOrdre(int ordre) {this.ordre = ordre;}

    public WorkflowDto getWorkflow() {return workflow;}

    public void setWorkflow(WorkflowDto workflow) {this.workflow = workflow;}

    public EtatDto getEtat() {return etat;}

    public void setEtat(EtatDto etat) {this.etat = etat;}
}
