package ma.thinline.gestion_workflow.service;

import ma.thinline.gestion_workflow.dto.TacheDto;
import ma.thinline.gestion_workflow.dto.WorkflowDto;
import ma.thinline.gestion_workflow.modele.Tache;

import java.util.List;

public interface ITacheService {

    List<TacheDto> getAllTaches();

    void saveTache(TacheDto dto);

    TacheDto getTacheByTitre(String titre);

    TacheDto getTacheById(Long id);

    void UpdateTache(Long id,TacheDto dto);

    void DeleteTache (Long id);
}
