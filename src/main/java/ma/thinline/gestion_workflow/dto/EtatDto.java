package ma.thinline.gestion_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor

public class EtatDto implements Serializable {

    private Long etat_id;
    private String statut;

    public Long getEtat_id() {return etat_id;}

    public void setEtat_id(Long etat_id) {this.etat_id = etat_id;}

    public String getStatut() {return statut;}

    public void setStatut(String statut) {this.statut = statut;}
}
