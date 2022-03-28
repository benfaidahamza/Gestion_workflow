package ma.thinline.gestion_workflow.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.thinline.gestion_workflow.modele.Adresse;
import ma.thinline.gestion_workflow.modele.Role;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UtilisateurVo {
    private Long user_id ;
    private String first_name;
    private String last_name;
    private String cin;
    private String phone;
    private Integer age;
    private Date dateNaissance;
    private String email;
    private String password;
    private Adresse adresse;
    private Role role;
}
