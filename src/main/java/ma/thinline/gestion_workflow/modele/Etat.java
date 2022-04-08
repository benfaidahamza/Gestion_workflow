package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etat_id;
    private String statut;

    public Long getEtat_id() { return etat_id;}

    public void setEtat_id(Long etat_id) { this.etat_id = etat_id;}

    public String getStatut() { return statut;}

    public void setStatut(String statut) { this.statut = statut;}
}
