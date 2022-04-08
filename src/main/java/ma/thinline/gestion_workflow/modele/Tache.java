package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tache_id;
    private String titre;
    private String type;
    private Date date_validation;
    private String assignement;
    private int ordre;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "workflow_id", nullable = false)
    private Workflow workflow;


    @ManyToOne
    @JoinColumn(name = "etat_id", nullable = false)
    private Etat etat;

    public Long getTache_id() { return tache_id;}

    public void setTache_id(Long tache_id) { this.tache_id = tache_id;}

    public String getTitre() { return titre;}

    public void setTitre(String titre) { this.titre = titre;}

    public String getType() { return type;}

    public void setType(String type) { this.type = type;}

    public Date getDate_validation() { return date_validation;}

    public void setDate_validation(Date date_validation) { this.date_validation = date_validation;}

    public String getAssignement() { return assignement;}

    public void setAssignement(String assignement) { this.assignement = assignement;}

    public int getOrdre() { return ordre;}

    public void setOrdre(int ordre) { this.ordre = ordre;}

    public Workflow getWorkflow() { return workflow;}

    public void setWorkflow(Workflow workflow) { this.workflow = workflow;}

    public Etat getEtat() {return etat;}

    public void setEtat(Etat etat) {this.etat = etat;}
}
