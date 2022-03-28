package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.thinline.gestion_workflow.domaine.UtilisateurVo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long role_id;
    private Enumrole role;

    @OneToMany(mappedBy = "role", cascade = { CascadeType.ALL })
     private List<Utilisateur> utilisateurs = new ArrayList<>();

}
