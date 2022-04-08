package ma.thinline.gestion_workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor

public class RoleDto implements Serializable {

    private long role_id;
    private String role;

    public long getRole_id() { return role_id;}

    public void setRole_id(long role_id) { this.role_id = role_id;}

    public String getRole() { return role;}

    public void setRole(String role) { this.role = role;}
}
