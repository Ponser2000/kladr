package com.github.ponser2000.kladr.repository;


import com.github.ponser2000.kladr.model.platex5.KladrTowns;
import java.util.List;

public interface KladrTownsRepository {

    KladrTowns update(KladrTowns kladrTown);

    List<KladrTowns> saveAll(List<KladrTowns> KladrTownsList);
}
