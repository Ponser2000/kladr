package com.github.ponser2000.kladr.repository.datajpa;


import com.github.ponser2000.kladr.model.platex5.KladrRegions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudKladrRegionsRepository extends JpaRepository<KladrRegions, Integer> {

  KladrRegions findById(String code);

}
