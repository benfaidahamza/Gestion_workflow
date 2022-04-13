package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long role_id;
    private String role;
    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
    private List<Utilisateur> utilisateurs;
    public long getRole_id() { return role_id;}

    public void setRole_id(long role_id) {this.role_id = role_id;}

    public void setRole(String role) { this.role = role;}

    public String getRole() { return role;}

}
