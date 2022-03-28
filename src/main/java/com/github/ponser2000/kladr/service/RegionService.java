package com.github.ponser2000.kladr.service;

import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.repository.KladrRegionsRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class RegionService {

  public final KladrRegionsRepository regionsRepository;

  public final GnivcService gnivcService;

  String patternRegions = "^[0-9][0-9]000000000[0-9][0-9]$";

  String patternAreasKrasnodar = "^23[0-9][0-9][0-9]000000[0-9][0-9]$";


  public RegionService(KladrRegionsRepository regionsRepository, GnivcService gnivcService) {
    this.regionsRepository = regionsRepository;
    this.gnivcService = gnivcService;
  }


  public List<KladrGnivc> getKladrGnivcRegionsList() {

    List<KladrGnivc> result = new ArrayList<>();

    for (KladrGnivc entity : GnivcService.kladrGnivcList) {

      if (Pattern.matches(patternRegions, entity.code())) {
        result.add(entity);
      }
    }

    return result;
  }

}
