package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data //la génération des getters et des setters...
@Entity //la génération d'une entité
@NoArgsConstructor //la génération d'un constructeur sans argument
@AllArgsConstructor //la génération d'un constructeur avec argument


public class Utilisateur {

    @Id //pour identifier la clé primaire
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long Id_user ;
    private String First_name;
    private String Last_name;
    private String Cin;
    private String Phone;
    private Integer age;
    private Date dateNaissance;
    private String Email;
    private String password;

}