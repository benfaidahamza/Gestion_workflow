package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dao.RoleRepository;
import ma.thinline.gestion_workflow.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class ImplService {
    @Autowired
    private UserRepository userrepo;
    @Autowired
    private RoleRepository rolerepo;

}
