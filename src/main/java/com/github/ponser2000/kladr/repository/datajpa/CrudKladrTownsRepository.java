package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrTowns;
import com.github.ponser2000.kladr.model.platex5.KladrTownsId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudKladrTownsRepository extends JpaRepository<KladrTowns, KladrTownsId> {

}
