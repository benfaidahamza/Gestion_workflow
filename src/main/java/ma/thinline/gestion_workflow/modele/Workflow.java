package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Workflow {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long workflow_id;
    private String titre;
    private String statut;

    @OneToMany(mappedBy = "workflow")
    private List<Tache> taches;

    public Long getWorkflow_id() { return workflow_id;}

    public void setWorkflow_id(Long workflow_id) { this.workflow_id = workflow_id;}

    public String getTitre() { return titre;}

    public void setTitre(String titre) { this.titre = titre;}

    public String getStatut() { return statut;}

    public void setStatut(String statut) { this.statut = statut;}
}
