package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dao.RoleRepository;
import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.mapper.RoleMapper;
import ma.thinline.gestion_workflow.modele.Role;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class RoleServiceImpl implements IRoleService{

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl( RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return roleMapper.toDto(roleRepository.findAll());
    }

    @Override
    public RoleDto getRoleByName(String role) {
        return roleMapper.toDto(roleRepository.findByRole(role));
    }

    @Override
    public void saveRole (RoleDto roleDto) {
        roleRepository.save(roleMapper.toEntity(roleDto));
    }

    @Override
    public RoleDto getRoleById(Long id){
        boolean trouve = roleRepository.existsById(id);
        if (!trouve)
            return null;
        return roleMapper.toDto(roleRepository.getOne(id));}

    @Override
    public void DeleteRole (Long id){ roleRepository.delete(roleRepository.getById(id));}

    @Override
    public  void UpdateRole(Long id, RoleDto dto){
     Role entity=roleRepository.getById(id);
     entity.setRole(dto.getRole());
     roleRepository.save(entity);
    }

}
