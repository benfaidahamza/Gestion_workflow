package ma.thinline.gestion_workflow.service;


import ma.thinline.gestion_workflow.dao.EtatRepository;
import ma.thinline.gestion_workflow.dto.EtatDto;
import ma.thinline.gestion_workflow.dto.RoleDto;

import ma.thinline.gestion_workflow.mapper.EtatMapper;
import ma.thinline.gestion_workflow.modele.Etat;
import ma.thinline.gestion_workflow.modele.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EtatServiceImpl implements IEtatService, CommandLineRunner {
    private final EtatMapper etatMapper;
    private final EtatRepository etatRepository;

    public EtatServiceImpl( EtatMapper etatMapper,EtatRepository etatRepository) {
        this.etatMapper =etatMapper;
        this.etatRepository= etatRepository;
    }

    @Override
    public List<EtatDto> getAllEtats() {
        return etatMapper.toDto(etatRepository.findAll());
    }

    @Override
    public EtatDto getEtatByStatut(String statut) {
        return etatMapper.toDto(etatRepository.findByStatut(statut));
    }

    @Override
    public void saveEtat (EtatDto etatDto) {
        etatRepository.save(etatMapper.toEntity(etatDto));
    }

    @Override
    public EtatDto getUserById(Long id){
        boolean trouve = etatRepository.existsById(id);
        if (!trouve)
            return null;
        return etatMapper.toDto(etatRepository.getOne(id));
    }

    @Override
    public void DeleteEtat (Long id){ etatRepository.deleteById(id);}

    @Override
    public  void UpdateEtat(Long id, EtatDto dto){
        Etat entity=etatRepository.getById(id);
        entity.setStatut(dto.getStatut());
        etatRepository.save(entity);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Etat etat1=new Etat();
        Etat etat2=new Etat();
        Etat etat3=new Etat();
        Etat etat4=new Etat();
        etat1.setStatut("EN COURS");
        etat2.setStatut("EN ATTENTE");
        etat3.setStatut("VALIDE");
        etat4.setStatut("REFUSE");
        etatRepository.save(etat1);
        etatRepository.save(etat2);
        etatRepository.save(etat3);
        etatRepository.save(etat4);

         */
    }
}
