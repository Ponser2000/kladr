package com.github.ponser2000.kladr.service;

import com.github.ponser2000.kladr.model.gnivc.AltnamesGnivc;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AltnamesService {

  public final GnivcService gnivcService;


  public AltnamesService(GnivcService gnivcService) {
    this.gnivcService = gnivcService;
  }

  public List<AltnamesGnivc> getAllAltnames() {
    return GnivcService.altnamesGnivcList;
  }
}
