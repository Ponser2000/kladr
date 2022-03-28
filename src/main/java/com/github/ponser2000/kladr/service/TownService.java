package com.github.ponser2000.kladr.service;

import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.repository.KladrTownsRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class TownService {

  public final KladrTownsRepository townRepository;
  final GnivcService gnivcService;
  String patternRegions = "^[0-9][0-9]000000000[0-9][0-9]$";
  String patternAreas = "^[0-9][0-9][0-9][0-9][0-9]000000[0-9][0-9]$";
  String patternCities = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]000[0-9][0-9]$";
  String patternTowns = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";
  public TownService(GnivcService gnivcService, KladrTownsRepository kladrTownsRepository) {
    this.gnivcService = gnivcService;
    this.townRepository = kladrTownsRepository;
  }

  public List<KladrGnivc> getKladrGnivcTownsList() {

    List<KladrGnivc> result = new ArrayList<>();

    String entityCode;

    for (KladrGnivc entity : GnivcService.kladrGnivcList) {

      entityCode = entity.code();

      if (!Pattern.matches(patternRegions, entityCode) && !Pattern.matches(patternAreas, entityCode)
          && !Pattern.matches(patternCities, entityCode) && Pattern.matches(patternTowns,
          entityCode)) {
        result.add(entity);
      }
    }

    return result;
  }
}
