package com.github.ponser2000.kladr.repository;


import com.github.ponser2000.kladr.model.platex5.KladrRegions;
import java.util.List;

public interface KladrRegionsRepository {

    List<KladrRegions> getAll();

    KladrRegions update(KladrRegions kladrRegions);

    List<KladrRegions> saveAll(List<KladrRegions> kladrRegionsList);
}
