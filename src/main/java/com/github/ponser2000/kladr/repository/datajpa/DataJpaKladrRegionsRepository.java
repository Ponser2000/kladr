package com.github.ponser2000.kladr.repository.datajpa;


import com.github.ponser2000.kladr.model.platex5.KladrRegions;
import com.github.ponser2000.kladr.repository.KladrRegionsRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class DataJpaKladrRegionsRepository implements KladrRegionsRepository {

    public final CrudKladrRegionsRepository crudRepository;

    public DataJpaKladrRegionsRepository(CrudKladrRegionsRepository crudRepository) {

        this.crudRepository = crudRepository;
    }

    @Override
    public List<KladrRegions> getAll() {
        return crudRepository.findAll();
    }

    @Override
    public KladrRegions update(KladrRegions kladrRegions) {
        return crudRepository.saveAndFlush(kladrRegions);
    }

    @Override
    public List<KladrRegions> saveAll(List<KladrRegions> kladrRegionsList) {
        return crudRepository.saveAll(kladrRegionsList);
    }
}
