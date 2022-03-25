package ma.thinline.gestion_workflow;

import ma.thinline.gestion_workflow.modele.Enumrole;
import ma.thinline.gestion_workflow.modele.Role;
import ma.thinline.gestion_workflow.modele.Utilisateur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GestionWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionWorkflowApplication.class, args);
        //Utilisateur personne =new Utilisateur();
        //Role r=new Role();
        //Enumrole s=Enumrole.Beneficiaire;
        //r.setName_role(s);
        //r.setId_role(1);

        //personne.setAge(10);
        //System.out.println( r.toString());
        //System.out.println("bonjour AGE"+personne.getAge());

    }

}
