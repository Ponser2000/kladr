package com.github.ponser2000.kladr.service;

import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.repository.KladrCitiesRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class CitiesService {

  public final KladrCitiesRepository citiesRepository;

  public final GnivcService gnivcService;
  String patternRegions = "^[0-9][0-9]000000000[0-9][0-9]$";
  String patternAreas = "^[0-9][0-9][0-9][0-9][0-9]000000[0-9][0-9]$";
  String patternCities = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]000[0-9][0-9]$";
  public CitiesService(KladrCitiesRepository citiesRepository, GnivcService gnivcService) {
    this.citiesRepository = citiesRepository;
    this.gnivcService = gnivcService;
  }

  public List<KladrGnivc> getKladrGnivcAreasList() {

    List<KladrGnivc> result = new ArrayList<>();

    for (KladrGnivc entity : GnivcService.kladrGnivcList) {

      if (!Pattern.matches(patternRegions, entity.code()) && !Pattern.matches(patternAreas,
          entity.code()) && Pattern.matches(patternCities, entity.code())) {
        result.add(entity);
      }
    }

    return result;
  }

}
