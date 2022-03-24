package com.github.ponser2000.kladr.model.platex5;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KLADR_CITIES_BACKUP")
public class KladrCities {
    @EmbeddedId
    private KladrCitiesId id;

    @Column(name = "NAME", length = 256)
    private String name;

    @Column(name = "SOCR", length = 20)
    private String socr;

    @Column(name = "IND", length = 12)
    private String ind;

    @Column(name = "OCATD", length = 22)
    private String ocatd;

    @Column(name = "FULL_CODE", length = 26)
    private String fullCode;

    @Column(name = "RES", length = 1)
    private String res;

    @Column(name = "ERROR", length = 512)
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getFullCode() {
        return fullCode;
    }

    public void setFullCode(String fullCode) {
        this.fullCode = fullCode;
    }

    public String getOcatd() {
        return ocatd;
    }

    public void setOcatd(String ocatd) {
        this.ocatd = ocatd;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    public String getSocr() {
        return socr;
    }

    public void setSocr(String socr) {
        this.socr = socr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KladrCitiesId getId() {
        return id;
    }

    public void setId(KladrCitiesId id) {
        this.id = id;
    }
}