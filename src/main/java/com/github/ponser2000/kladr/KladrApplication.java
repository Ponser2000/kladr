package com.github.ponser2000.kladr;


import com.github.ponser2000.kladr.model.gnivc.AltnamesGnivc;
import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.model.platex5.*;
import com.github.ponser2000.kladr.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KladrApplication implements CommandLineRunner {

    final
    AltnamesService altnamesService;

    final
    RegionService regionService;

    final
    AreaService areaService;

    final
    CitiesService citiesService;

    final
    TownService townService;

    public KladrApplication(AltnamesService altnamesService, RegionService regionService, AreaService areaService, CitiesService citiesService, TownService townService) {
        this.altnamesService = altnamesService;
        this.regionService = regionService;
        this.areaService = areaService;
        this.citiesService = citiesService;
        this.townService = townService;
    }


    public static void main(String[] args){

        SpringApplication.run(KladrApplication.class, args);

    }


    @Override
    public void run(String... args){

        System.out.println("-------------------------------");

        System.out.println("Starting....");

        List<KladrGnivc> kladrGnivcRegionsList = regionService.getKladrGnivcRegionsList();
        List<AltnamesGnivc> altnamesGnivcs = altnamesService.getAllAltnames();
        List<KladrRegions> kladrRegionsList = new ArrayList<>();


        for (KladrGnivc kladrGnivc : kladrGnivcRegionsList) {

            if (kladrGnivc.getCodeActual().equals("00")) {
                KladrRegions kladrRegions = new KladrRegions();
                kladrRegions.setId(kladrGnivc.getCodeRegion());
                kladrRegions.setName(kladrGnivc.name());
                kladrRegions.setSocr(kladrGnivc.socr());
                kladrRegions.setInd(kladrGnivc.index());
                kladrRegions.setOcatd(kladrGnivc.ocatd());
                kladrRegions.setFullCode(kladrGnivc.code());
                kladrRegions.setRgnCode(kladrGnivc.getCodeRegion());

                kladrRegionsList.add(kladrRegions);
            }
        }

        int records = regionService.regionsRepository.saveAll(kladrRegionsList).size();

        System.out.println("-------------------------------");

        System.out.println("Updated KLADR_Regions " + records + " records");

       System.out.println("-------------------------------");

       List<KladrAreas> kladrAreasList = new ArrayList<>();
        List<KladrGnivc> kladrGnivcAreasList = areaService.getKladrGnivcAreasList();
        for (KladrGnivc kladrGnivc : kladrGnivcAreasList) {
            if (kladrGnivc.getCodeActual().equals("00") ) {
                KladrAreasId kladrAreasId = new KladrAreasId();
                kladrAreasId.setCode(kladrGnivc.getCodeAreas());
                kladrAreasId.setRgnCode(kladrGnivc.getCodeRegion());

                KladrAreas kladrAreas = new KladrAreas();
                kladrAreas.setId(kladrAreasId);
                kladrAreas.setName(kladrGnivc.name());
                kladrAreas.setSocr(kladrGnivc.socr());
                kladrAreas.setInd(kladrGnivc.index());
                kladrAreas.setOcatd(kladrGnivc.ocatd());
                kladrAreas.setFullCode(kladrGnivc.code());

                kladrAreasList.add(kladrAreas);
            }
        }

        records = areaService.areasRepository.saveAll(kladrAreasList).size();
        System.out.println("Updated KLADR_Areas " + records + " records");

        System.out.println("-------------------------------");

          List<KladrGnivc> kladrGnivcCitiesList = citiesService.getKladrGnivcAreasList();
          List<KladrCities> kladrCitiesList = new ArrayList<>();
        for (KladrGnivc kladrGnivc : kladrGnivcCitiesList) {
            if (kladrGnivc.getCodeActual().equals("00")) {
                KladrCitiesId kladrCitiesId = new KladrCitiesId();
                kladrCitiesId.setCode(kladrGnivc.getCodeTown());
                kladrCitiesId.setRgnCode(kladrGnivc.getCodeRegion());
                kladrCitiesId.setAreaCode(kladrGnivc.getCodeAreas());

                KladrCities kladrCities = new KladrCities();
                kladrCities.setId(kladrCitiesId);
                kladrCities.setName(kladrGnivc.name());
                kladrCities.setSocr(kladrGnivc.socr());
                kladrCities.setInd(kladrGnivc.index());
                kladrCities.setOcatd(kladrGnivc.ocatd());
                kladrCities.setFullCode(kladrGnivc.code());

                kladrCitiesList.add(kladrCities);
            }
        }

        records = citiesService.citiesRepository.saveAll(kladrCitiesList).size();
        System.out.println("Updated KLADR_Cities " + records + " records");

        System.out.println("-------------------------------");

        List<KladrTowns> kladrTownsList = new ArrayList<>();
        List<KladrGnivc> kladrGnivcTownsList = townService.getKladrGnivcTownsList();
        for (KladrGnivc kladrGnivc : kladrGnivcTownsList) {
            if (kladrGnivc.getCodeActual().equals("00")) {

                KladrTownsId kladrTownsId = new KladrTownsId();
                kladrTownsId.setCode(kladrGnivc.getCodePopulate());
                kladrTownsId.setRgnCode(kladrGnivc.getCodeRegion());
                kladrTownsId.setAreaCode(kladrGnivc.getCodeAreas());
                kladrTownsId.setCityCode(kladrGnivc.getCodeTown());

                KladrTowns kladrTown = new KladrTowns();
                kladrTown.setId(kladrTownsId);
                kladrTown.setName(kladrGnivc.name());
                kladrTown.setName(kladrGnivc.name());
                kladrTown.setSocr(kladrGnivc.socr());
                kladrTown.setInd(kladrGnivc.index());
                kladrTown.setOcatd(kladrGnivc.ocatd());
                kladrTown.setFullCode(kladrGnivc.code());


                kladrTownsList.add(kladrTown);
            }
        }

        records = townService.townRepository.saveAll(kladrTownsList).size();
        System.out.println("Updated KLADR_Towns " + records + " records");

        System.out.println("-------------------------------");

        System.out.println("Finish....");

        System.out.println("-------------------------------");
    }
}
