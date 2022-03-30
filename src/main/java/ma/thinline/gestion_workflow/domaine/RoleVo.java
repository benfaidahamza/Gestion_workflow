package ma.thinline.gestion_workflow.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor


public class RoleVo {

    private long role_id;
    private String role;

    public RoleVo(String role) {
        this.role = role;
    }



}
