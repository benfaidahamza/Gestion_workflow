package ma.thinline.gestion_workflow.dao;

import ma.thinline.gestion_workflow.modele.Enumrole;
import ma.thinline.gestion_workflow.modele.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    List<Role> findByRole(Enumrole role);
    List<Role> findAll();
}