package com.github.ponser2000.kladr.repository;


import com.github.ponser2000.kladr.model.platex5.KladrAreas;
import com.github.ponser2000.kladr.model.platex5.KladrCities;

import java.util.List;

public interface KladrCitiesRepository {

    List<KladrCities> getAll();

    KladrCities update(KladrCities kladrCities);

    List<KladrCities> saveAll(List<KladrCities> kladrCitiesList);
}
