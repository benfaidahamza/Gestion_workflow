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
    private Long Id_user ;
    private String First_name;
    private String Last_name;
    private String Cin;
    private String Phone;
    private Integer age;
    private Date dateNaissance;
    private String Email;
    private String password;
    private Adresse adresse;
    private Role role;
}
