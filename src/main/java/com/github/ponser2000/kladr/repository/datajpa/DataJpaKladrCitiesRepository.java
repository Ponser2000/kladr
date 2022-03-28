package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrCities;
import com.github.ponser2000.kladr.repository.KladrCitiesRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DataJpaKladrCitiesRepository implements KladrCitiesRepository {

  public final CrudKladrCitiesRepository kladrCitiesRepository;

  public DataJpaKladrCitiesRepository(CrudKladrCitiesRepository kladrCitiesRepository) {
    this.kladrCitiesRepository = kladrCitiesRepository;
  }

  @Override
  public List<KladrCities> getAll() {
    return kladrCitiesRepository.findAll();
  }

  @Override
  public KladrCities update(KladrCities kladrCities) {
    return kladrCitiesRepository.saveAndFlush(kladrCities);
  }

  @Override
  public List<KladrCities> saveAll(List<KladrCities> kladrCitiesList) {
    return kladrCitiesRepository.saveAll(kladrCitiesList);
  }
}
