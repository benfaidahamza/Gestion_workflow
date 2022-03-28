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
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long user_id ;
    private String first_name;
    private String last_name;
    private String cin;
    private String phone;
    private Integer age;
    private Date dateNaissance;
    @Column(unique = true)
    private String email;
    private String password;
    @Embedded
    private Adresse adresse;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="Id_role",nullable = false)
    private Role role;
}