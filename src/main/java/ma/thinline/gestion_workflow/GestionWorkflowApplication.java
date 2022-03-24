package ma.thinline.gestion_workflow;

import ma.thinline.gestion_workflow.modele.Utilisateur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GestionWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionWorkflowApplication.class, args);
        Utilisateur personne =new Utilisateur();

        //personne.setAge(10);
        //System.out.println( personne.toString());
        //System.out.println("bonjour AGE"+personne.getAge());

    }

}
