package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrAreas;
import com.github.ponser2000.kladr.repository.KladrAreasRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaKladrAreasRepository implements KladrAreasRepository {

    public final CrudKladrAreasRepository crudRepository;

    public DataJpaKladrAreasRepository(CrudKladrAreasRepository crudRepository) {
        this.crudRepository = crudRepository;
    }


    @Override
    public List<KladrAreas> getAll() {
        return crudRepository.findAll();
    }

    @Override
    public KladrAreas update(KladrAreas kladrAreas) {
        return crudRepository.save(kladrAreas);
    }

    @Override
    public List<KladrAreas> saveAll(List<KladrAreas> kladrAreasList) {
        return crudRepository.saveAll(kladrAreasList);
    }
}
