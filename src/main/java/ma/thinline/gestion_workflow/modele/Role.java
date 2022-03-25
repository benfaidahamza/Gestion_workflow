package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id_role;
    private Enumrole name_role;

    @OneToMany(mappedBy = "role", cascade = { CascadeType.ALL })
    private Set<Utilisateur> utilisateurs = new HashSet<Utilisateur>();
}
