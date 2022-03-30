package ma.thinline.gestion_workflow.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.thinline.gestion_workflow.modele.Adresse;
import ma.thinline.gestion_workflow.modele.Role;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private String email;
    private String password;
    private Adresse adresse;
    private List<RoleVo> roles = new ArrayList<>();

    public UtilisateurVo(String first_name,String last_name,String cin,String phone,Integer age,String email,String password,Adresse adresse, List<RoleVo> roles) {
        this.first_name =first_name;
        this.last_name=last_name;
        this.phone=phone;
        this.age=age;
        this.email=email;
        this.password = password;
        this.roles=roles;
        this.adresse.setCity(adresse.getCity());
        this.adresse.setStreetAdress(adresse.getStreetAdress());
        this.adresse.setCountry(adresse.getCountry());
    }


}
