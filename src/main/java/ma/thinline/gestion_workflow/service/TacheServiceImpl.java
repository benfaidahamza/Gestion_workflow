package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dao.TacheRepository;
import ma.thinline.gestion_workflow.dto.RoleDto;
import ma.thinline.gestion_workflow.dto.TacheDto;
import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.mapper.EtatMapper;
import ma.thinline.gestion_workflow.mapper.TacheMapper;
import ma.thinline.gestion_workflow.modele.Role;
import ma.thinline.gestion_workflow.modele.Tache;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TacheServiceImpl implements ITacheService{

    private final TacheMapper tacheMapper;
    private final TacheRepository tacheRepository;
    private final EtatMapper etatMapper;

    public TacheServiceImpl(TacheMapper tacheMapper,TacheRepository tacheRepository,EtatMapper etatMapper){
        this.tacheMapper=tacheMapper;
        this.tacheRepository=tacheRepository;
        this.etatMapper=etatMapper;
    }

    @Override
    public List<TacheDto> getAllTaches(){ return tacheMapper.toDto(tacheRepository.findAll());}

    @Override
    public void save(TacheDto dto){ tacheRepository.save(tacheMapper.toEntity(dto));}

    @Override
    public TacheDto getTacheByTitre(String titre){return tacheMapper.toDto(tacheRepository.findAllByTitre(titre));}

    @Override
    public TacheDto getTacheById(Long id){return  tacheMapper.toDto(tacheRepository.getById(id));}

    @Override
    public void DeleteTache (Long id){tacheRepository.delete(tacheRepository.getById(id));}

    @Override
    public void UpdateTache(Long id,TacheDto dto){
        Tache entity=tacheRepository.getById(id);
        entity.setAssignement(dto.getAssignement());
        entity.setEtat(etatMapper.toEntity(dto.getEtat()));
        entity.setOrdre(dto.getOrdre());
        entity.setDate_validation(dto.getDate_validation());
        entity.setAssignement(dto.getAssignement());
        entity.setTitre(dto.getTitre());
        tacheRepository.save(entity);
    }

}
