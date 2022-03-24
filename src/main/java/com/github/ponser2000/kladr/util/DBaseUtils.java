package com.github.ponser2000.kladr.util;

import com.github.ponser2000.kladr.model.gnivc.AltnamesGnivc;
import com.github.ponser2000.kladr.model.gnivc.KladrGnivc;
import com.github.ponser2000.kladr.model.gnivc.StreetGnivc;
import com.linuxense.javadbf.DBFReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


public class DBaseUtils {

    public static String[] getFieldName(String path, String charsetName) throws FileNotFoundException {
        DBFReader dbfReader = new DBFReader(new FileInputStream(path), Charset.forName(charsetName));
        int fieldCount = dbfReader.getFieldCount(); // Количество полей
        String[] fieldName = new String[fieldCount];
        for (int i = 0; i < fieldCount; i++) {
            fieldName[i] = dbfReader.getField(i).getName();
        }
        dbfReader.close();
        return fieldName;
    }

    public static List<KladrGnivc> readKladrDbf(String path, String charsetName) throws IOException {
        List<KladrGnivc> rowList = new ArrayList<>();
        DBFReader dbfReader = new DBFReader(new FileInputStream(path), Charset.forName(charsetName));
        Object[] rowValues;
        while ((rowValues = dbfReader.nextRecord()) != null) {
            KladrGnivc kladrGnivc = new KladrGnivc(
                String.valueOf(rowValues[0]).trim(),
                String.valueOf(rowValues[1]).trim(),
                String.valueOf(rowValues[2]).trim(),
                String.valueOf(rowValues[3]).trim(),
                String.valueOf(rowValues[4]).trim(),
                String.valueOf(rowValues[5]).trim(),
                String.valueOf(rowValues[6]).trim(),
                String.valueOf(rowValues[7]).trim()
            );

            rowList.add(kladrGnivc);
        }
        dbfReader.close();
        return rowList;
    }

    public static List<StreetGnivc> readStreetDbf(String path, String charsetName) throws IOException {
        List<StreetGnivc> rowList = new ArrayList<>();
        DBFReader dbfReader = new DBFReader(new FileInputStream(path), Charset.forName(charsetName));
        Object[] rowValues;
        while ((rowValues = dbfReader.nextRecord()) != null) {
            StreetGnivc streetGnivc = new StreetGnivc(

            String.valueOf(rowValues[0]).trim(),
            String.valueOf(rowValues[1]).trim(),
            String.valueOf(rowValues[2]).trim(),
            String.valueOf(rowValues[3]).trim(),
            String.valueOf(rowValues[4]).trim(),
            String.valueOf(rowValues[5]).trim(),
            String.valueOf(rowValues[6]).trim()
            );

            rowList.add(streetGnivc);
        }
        dbfReader.close();
        return rowList;
    }

    public static List<AltnamesGnivc> readAltnamesDbf(String path, String charsetName) throws IOException {
        List<AltnamesGnivc> rowList = new ArrayList<>();
        DBFReader dbfReader = new DBFReader(new FileInputStream(path), Charset.forName(charsetName));
        Object[] rowValues;
        while ((rowValues = dbfReader.nextRecord()) != null) {
            AltnamesGnivc altnamesGnivc = new AltnamesGnivc(

                    String.valueOf(rowValues[0]).trim(),
                    String.valueOf(rowValues[1]).trim(),
                    String.valueOf(rowValues[2]).trim()
            );

            rowList.add(altnamesGnivc);
        }
        dbfReader.close();
        return rowList;
    }

}
