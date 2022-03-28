package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrCities;
import com.github.ponser2000.kladr.model.platex5.KladrCitiesId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudKladrCitiesRepository extends JpaRepository<KladrCities, KladrCitiesId> {

}
