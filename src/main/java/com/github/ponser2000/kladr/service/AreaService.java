package com.github.ponser2000.kladr.service;

import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.repository.KladrAreasRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class AreaService {

    public final KladrAreasRepository areasRepository;

    public final GnivcService gnivcService;

    String patternRegions = "^[0-9][0-9]000000000[0-9][0-9]$";
    String patternAreas = "^[0-9][0-9][0-9][0-9][0-9]000000[0-9][0-9]$";


    public AreaService(KladrAreasRepository areasRepository, GnivcService gnivcService) {
        this.areasRepository = areasRepository;
        this.gnivcService = gnivcService;
    }

    public List<KladrGnivc> getKladrGnivcAreasList(){

        List<KladrGnivc> result = new ArrayList<>();

        for (KladrGnivc entity : GnivcService.kladrGnivcList) {

            if (! Pattern.matches(patternRegions,entity.code()) && Pattern.matches(patternAreas,entity.code())) {
                result.add(entity);
            }
        }

        return result;
    }


}
