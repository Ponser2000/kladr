package com.github.ponser2000.kladr.service;

import com.github.ponser2000.kladr.model.gnivc.AltnamesGnivc;
import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.util.DBaseUtils;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class GnivcService {


    public static final String KLADR_DBASE_FILE_PATH = "C:\\temp\\KLADR.dbf";
    public static final String STREET_DBASE_FILE_PATH = "C:\\temp\\STREET.dbf";
    public static final String DOMA_DBASE_FILE_PATH = "C:\\temp\\DOMA.dbf";
    public static final String ALTNAMES_DBASE_FILE_PATH = "C:\\temp\\ALTNAMES.dbf";
    public static final String FLAT_DBASE_FILE_PATH = "C:\\temp\\FLAT.dbf";
    public static final String NAMEMAP_DBASE_FILE_PATH = "C:\\temp\\NAMEMAP.dbf";
    public static final String SOCRBASE_DBASE_FILE_PATH = "C:\\temp\\SOCRBASE.dbf";
    public static final String CHARSET_CODEPAGE = "CP866";

    static String[] fieldName;

    public static List<KladrGnivc> kladrGnivcList;
    public static List<AltnamesGnivc> altnamesGnivcList;


    public GnivcService() throws IOException {
        kladrGnivcList = DBaseUtils.readKladrDbf(KLADR_DBASE_FILE_PATH, CHARSET_CODEPAGE);
        altnamesGnivcList = DBaseUtils.readAltnamesDbf(ALTNAMES_DBASE_FILE_PATH, CHARSET_CODEPAGE);
        kladrGnivcList.sort(KladrGnivc.COMPARE_BY_CODE);
        System.out.println("One...");
    }

    public AltnamesGnivc searchAltCode(List<AltnamesGnivc> altnamesGnivcList, String oldcode){

        String code = oldcode.substring(0,11) + "00";
        for (AltnamesGnivc altnamesGnivc : altnamesGnivcList) {
            if (altnamesGnivc.oldcode().equals(code)) {
                return altnamesGnivc;
            }
        }
        return null;
    }


}
