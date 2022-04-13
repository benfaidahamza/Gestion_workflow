package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dao.UtilisateurRepository;
import ma.thinline.gestion_workflow.dto.UtilisateurDto;
import ma.thinline.gestion_workflow.mapper.RoleMapper;
import ma.thinline.gestion_workflow.mapper.UtilisateurMapper;
import ma.thinline.gestion_workflow.modele.Role;
import ma.thinline.gestion_workflow.modele.Utilisateur;
import org.springframework.stereotype.Service;



import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    private final UtilisateurRepository userRepository;
    private final UtilisateurMapper utilisateurMapper;
    private final RoleMapper roleMapper;
    private final RoleServiceImpl roleService;

    public UserServiceImpl(UtilisateurRepository userRepository, UtilisateurMapper utilisateurMapper,RoleMapper roleMapper,RoleServiceImpl roleService) {
        this.userRepository = userRepository;
        this.utilisateurMapper = utilisateurMapper;
        this.roleMapper = roleMapper;
        this.roleService=roleService;
    }

    @Override
    public void saveUser(UtilisateurDto dto) {
        Utilisateur entity = utilisateurMapper.toEntity(dto);
        List<Role> rolesPersist = new ArrayList<>();

        for (Role role : entity.getRoles()) {
            Role userRole =roleMapper.toEntity(roleService.getRoleByName(role.getRole()));
            rolesPersist.add(userRole);
        }
        
        entity.setRoles(rolesPersist);
        userRepository.save(entity);
    }

    @Override
    public UtilisateurDto findByEmail(String Email) {
        return utilisateurMapper.toDto(userRepository.findByEmail(Email));
    }

    @Override
    public List<UtilisateurDto> getAllUsers() {
        return utilisateurMapper.toDto(userRepository.findAll());
    }

    @Override
    public UtilisateurDto getUserById(Long id) {
        boolean trouve = userRepository.existsById(id);
        if (!trouve)
            return null;
        return utilisateurMapper.toDto(userRepository.getOne(id));
    }

    @Override
    public void UpdateUser(Long id,UtilisateurDto dto)
    {
        Utilisateur entity=userRepository.getById(id);
        entity.setAdresse(dto.getAdresse());
        entity.setAge(dto.getAge());
        entity.setCin(dto.getCin());
        entity.setEmail(dto.getEmail());
        entity.setFirst_name(dto.getFirst_name());
        entity.setLast_name(dto.getLast_name());
        entity.setPhone(dto.getPhone());
        userRepository.save(entity);

    }

    @Override
    public void DeleteUser(Long id){
        userRepository.deleteById(id);
    }


}
