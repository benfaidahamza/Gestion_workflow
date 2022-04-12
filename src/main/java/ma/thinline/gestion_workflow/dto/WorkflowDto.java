package ma.thinline.gestion_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor

public class WorkflowDto implements Serializable {

    private Long workflow_id;
    private String titre;
    private String statut;
    private List<TacheDto> taches;

    public Long getWorkflow_id() {return workflow_id;}

    public void setWorkflow_id(Long workflow_id) {this.workflow_id = workflow_id;}

    public String getTitre() {return titre;}

    public void setTitre(String titre) {this.titre = titre;}

    public String getStatut() {return statut;}

    public void setStatut(String statut) {this.statut = statut;}

    public List<TacheDto> getTaches() {return taches;}

    public void setTaches(List<TacheDto> taches) {this.taches = taches;}

}
