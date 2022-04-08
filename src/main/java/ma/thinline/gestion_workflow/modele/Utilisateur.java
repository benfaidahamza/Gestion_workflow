package ma.thinline.gestion_workflow.modele;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Data//la génération des getters et des setters...
@Entity //la génération d'une entité
@NoArgsConstructor //la génération d'un constructeur sans argument
@AllArgsConstructor //la génération d'un constructeur avec argument


public class Utilisateur {

    @Id //pour identifier la clé primaire
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long user_id ;
    private String first_name;
    private String last_name;
    private String cin;
    private String phone;
    private Integer age;
    @Column(unique = true)
    private String email;
    private String password;
    private String adresse;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_workflow", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "workflow_id"))
    private  List<Workflow> workflows=new ArrayList<>();

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
 
}