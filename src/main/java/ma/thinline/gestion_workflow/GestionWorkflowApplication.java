package ma.thinline.gestion_workflow;

import ma.thinline.gestion_workflow.modele.Utilisateur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class GestionWorkflowApplication {


    public static void main(String[] args) {
        SpringApplication.run(GestionWorkflowApplication.class, args);
    }

   /* @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }*/

}
