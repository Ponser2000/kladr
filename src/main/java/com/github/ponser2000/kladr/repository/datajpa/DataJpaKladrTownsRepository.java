package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrTowns;
import com.github.ponser2000.kladr.repository.KladrTownsRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DataJpaKladrTownsRepository implements KladrTownsRepository {

  final CrudKladrTownsRepository kladrTownsRepository;

  public DataJpaKladrTownsRepository(CrudKladrTownsRepository kladrTownsRepository) {
    this.kladrTownsRepository = kladrTownsRepository;
  }

  @Override
  public KladrTowns update(KladrTowns kladrTown) {
    return kladrTownsRepository.saveAndFlush(kladrTown);
  }

  @Override
  public List<KladrTowns> saveAll(List<KladrTowns> KladrTownsList) {
    return kladrTownsRepository.saveAll(KladrTownsList);
  }
}
