package com.github.ponser2000.kladr.repository;

import com.github.ponser2000.kladr.model.platex5.KladrAreas;
import java.util.List;

public interface KladrAreasRepository {

  List<KladrAreas> getAll();

  KladrAreas update(KladrAreas kladrAreas);

  List<KladrAreas> saveAll(List<KladrAreas> kladrAreasList);

}
