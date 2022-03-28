package com.github.ponser2000.kladr.repository.datajpa;

import com.github.ponser2000.kladr.model.platex5.KladrAreas;
import com.github.ponser2000.kladr.model.platex5.KladrAreasId;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudKladrAreasRepository extends JpaRepository<KladrAreas, KladrAreasId> {

  Optional<KladrAreas> findById(KladrAreasId id);
}
