package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrAreas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudKladrAreasRepository extends JpaRepository<KladrAreas, Integer> {

    KladrAreas findById(String code);
}
