package ma.thinline.gestion_workflow.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.thinline.gestion_workflow.modele.Enumrole;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RoleVo {

    private long role_id;
    private Enumrole role;
    private List<UtilisateurVo> utilisateurs = new ArrayList<>();





}
