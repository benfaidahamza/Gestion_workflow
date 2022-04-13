package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.EtatDto;
import ma.thinline.gestion_workflow.dto.RoleDto;

import java.util.List;

public interface IEtatService {

    List<EtatDto> getAllEtats();

    EtatDto getEtatByStatut(String role);

    EtatDto getUserById(Long id);

    void saveRole(EtatDto etatDto);

    void UpdateEtat(Long id, EtatDto dto);

    void DeleteEtat (Long id);
}
